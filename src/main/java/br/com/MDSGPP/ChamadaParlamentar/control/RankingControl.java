package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.exception.ListaRankingException;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;
import br.com.MDSGPP.ChamadaParlamentar.util.LimparLista;

public final class RankingControl {
	private static final int TAMANHO_RANKINGS = 5;

	public static Ranking gerarRanking(ArrayList<Estatistica> lista) 
			throws ListaRankingException {

		Ranking ranking = new Ranking();
		try {
			ArrayList<ArrayList<Estatistica>> recebido = 
					LimparLista.limparLista(lista);
			ArrayList<Estatistica> removidos = recebido.get(1);
			ArrayList<Estatistica> melhores = new ArrayList<Estatistica>();
			ArrayList<Estatistica> piores = new ArrayList<Estatistica>();

			ArrayList<Estatistica> listaRecebida = recebido.get(0);

			ArrayList<Estatistica> listaOrdenada = ordenacao(listaRecebida);

			for(int i = 0; i<TAMANHO_RANKINGS; i++) {
				melhores.add(lista.get(i));
				piores.add(lista.get(lista.size() -1 -i));
			}

			ranking.setMelhores(melhores);
			ranking.setPiores(piores);
			ranking.setLista(listaOrdenada);
			ranking.setRemovidos(removidos);

		} catch (NullPointerException e) {
			throw new ListaRankingException();
		}

		return ranking;
	}

	public static ArrayList<Estatistica> gerarListaEstatistica(ArrayList<Deputados> lista) throws ClassNotFoundException, SQLException {

		ArrayList<Estatistica> devolver = new ArrayList<Estatistica>();
		String nome = EstatisticaControl.arrumarNomePesquisa(lista.get(0));

		try {
			devolver.add(EstatisticaControl.gerarEstatisticas(nome));
		} catch (ListaVaziaException e1) {
			Estatistica estatistica = new Estatistica();
			estatistica.setNome(nome);
			devolver.add(estatistica);
			System.out.println(estatistica.getNome());
		}

		int totalSessao = Integer.parseInt(devolver.get(0).getTotalSessao());

		for(int i = 0; i< lista.size(); i++) {
			nome = EstatisticaControl.arrumarNomePesquisa(lista.get(i));

			devolver.add(EstatisticaControl.gerarEstatisticas(nome, 
					totalSessao));
		}

		return devolver;
	}

	public static ArrayList<Estatistica> ordenacao(ArrayList<Estatistica> lista) {
		//Insertion Sort
		int i = 1, j = 1;
		if(lista.size() > 0)
		{
			while(j<lista.size())
			{
				i=j;
				while(i>0)
				{
					int primeiro = Integer.parseInt(lista.get(i-1).getNumeroSessao());
					int segundo = Integer.parseInt(lista.get(i).getNumeroSessao());

					if ( primeiro < segundo ) {
						Estatistica temp;

						temp = lista.get(i-1);

						lista.set(i-1, lista.get(i));
						lista.set(i, temp);
						i--;
					}
					else
					{
						break;
					}		
				}
				j++;
			}
		}

		return lista;
	}
}