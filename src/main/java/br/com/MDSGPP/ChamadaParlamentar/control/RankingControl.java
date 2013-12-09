package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.RankingDao;
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

			if(listaRecebida.size() == 0) {
				throw new ListaRankingException();
			}
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

	public static ArrayList<Estatistica> gerarListaEstatistica(ArrayList<Deputados> lista)
			throws ClassNotFoundException, SQLException, 
			ListaRankingException, ListaVaziaException {

		try {
			ArrayList<Estatistica> devolver = new ArrayList<Estatistica>();
			String nome = EstatisticaControl.arrumarNomePesquisa(lista.get(0));

			devolver.add(EstatisticaControl.gerarEstatisticas(nome));


			int totalSessao = Integer.parseInt(devolver.get(0).getTotalSessao());

			for(int i = 0; i< lista.size(); i++) {
				nome = EstatisticaControl.arrumarNomePesquisa(lista.get(i));

				try {
					devolver.add(EstatisticaControl.gerarEstatisticas(nome, 
							totalSessao));
				} catch (ListaVaziaException e) {
					Estatistica estatistica = new Estatistica();
					estatistica.setNome(nome);
					devolver.add(estatistica);
				}
			}
			return devolver;
		} catch (IndexOutOfBoundsException e2) {
			throw new ListaRankingException();
		}
	}
	
	public static Ranking passarRankingTop5() throws ClassNotFoundException, SQLException {
		RankingDao rankingDao = new RankingDao();
		Ranking ranking = rankingDao.retornaRanking();
		ArrayList<Estatistica> melhores = new ArrayList<Estatistica>();
		ArrayList<Estatistica> piores = new ArrayList<Estatistica>();
		
		ranking.setLista(ordenacao(ranking.getLista()));
		
		for(int i = 0; i<5; i++) {
			melhores.add(ranking.getLista().get(i));
			piores.add(ranking.getLista().get(ranking.getLista().size() -1 -i));
		}
		ranking.setMelhores(melhores);
		ranking.setPiores(piores);
		return ranking;
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

	public static Ranking passarRankingCompleto() 
			throws SQLException, ClassNotFoundException {
		RankingDao rankingDao = new RankingDao();
		Ranking ranking = rankingDao.retornaRanking();
		
		ranking.setLista(ordenacao(ranking.getLista()));
		
		return ranking;
	}
}