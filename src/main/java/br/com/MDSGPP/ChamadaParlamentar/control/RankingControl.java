package br.com.MDSGPP.ChamadaParlamentar.control;

import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class RankingControl {

	public RankingControl() {

	}

	public static void gerarRanking(ArrayList<Estatistica> lista) {
		ArrayList<Estatistica> removidos = new ArrayList<Estatistica>();

		for(int i = 0; i<lista.size(); i++) {
			try {
				Integer.parseInt(lista.get(i).getNumeroSessao());
			} catch (NumberFormatException e) {
				lista.remove(i);
				i--;
			}
		}
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

		for(int i = 0; i<lista.size(); i++) {
			System.out.println(lista.get(i).getNome() + ' ' +lista.get(i).getPorcentagem());
		}
		for(int j = 0; j<removidos.size(); j++) {
			System.out.println(removidos.get(j).getNome() + ' ' + removidos.get(j).getPorcentagem());
		}
	}

	public static ArrayList<Estatistica> gerarListaEstatistica(ArrayList<Deputados> lista) {

		ArrayList<Estatistica> devolver = new ArrayList<Estatistica>();
		for(int i = 0; i< lista.size(); i++) {
			String nome = EstatisticaControl.arrumarNomePesquisa(lista.get(i));

			devolver.add(EstatisticaControl.gerarEstatisticas(nome));
		}

		return devolver;
	}
}