package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionRanking;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

public class RankingControl {

	public RankingControl() {

	}

	public static Ranking gerarRanking(ArrayList<Estatistica> lista) {

		Ranking ranking = new Ranking();
		if(ExceptionRanking.verificaLista(lista)) {
			ArrayList<ArrayList<Estatistica>> recebido = 
					ExceptionRanking.limparLista(lista);
			ArrayList<Estatistica> removidos = recebido.get(1);
			ArrayList<Estatistica> melhores = new ArrayList<Estatistica>();
			ArrayList<Estatistica> piores = new ArrayList<Estatistica>();



			lista = recebido.get(0);



			for (int i=0; i< lista.size(); i++) // bubble sort outer loop
			{
				int verifica = 0;
				for (int j=0; j < lista.size() - i - 1 ; j++) {

					int primeiro = Integer.parseInt(lista.get(j).getNumeroSessao());
					int segundo = Integer.parseInt(lista.get(j+1).getNumeroSessao());

					if ( primeiro < segundo ) {
						Estatistica temp;

						temp = lista.get(j);

						lista.set(j, lista.get(j+1));
						lista.set(j+1, temp);
						verifica++;
					}
				}
				if(verifica == 0) {
					break;
				}
			}

			for(int i = 0; i<5; i++) {
				melhores.add(lista.get(i));
				piores.add(lista.get(lista.size() -1 -i));
			}
			ranking.setMelhores(melhores);
			ranking.setPiores(piores);
			ranking.setLista(lista);
			ranking.setRemovidos(removidos);
		}
		else {
			ranking = null;
		}


		return ranking;
	}

	public static ArrayList<Estatistica> gerarListaEstatistica(ArrayList<Deputados> lista) throws ClassNotFoundException, SQLException {

		ArrayList<Estatistica> devolver = new ArrayList<Estatistica>();
		for(int i = 0; i< lista.size(); i++) {
			String nome = EstatisticaControl.arrumarNomePesquisa(lista.get(i));

			devolver.add(EstatisticaControl.gerarEstatisticas(nome));
		}

		return devolver;
	}
}