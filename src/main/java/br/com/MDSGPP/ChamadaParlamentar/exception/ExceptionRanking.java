package br.com.MDSGPP.ChamadaParlamentar.exception;

import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class ExceptionRanking {
	
	public static ArrayList<ArrayList<Estatistica>> limparLista(ArrayList<Estatistica> lista){
		ArrayList<ArrayList<Estatistica>> passar = new ArrayList<ArrayList<Estatistica>>();
		ArrayList<Estatistica> removidos = new ArrayList<Estatistica>();
		for(int i = 0; i<lista.size(); i++) {
			try {
				Integer.parseInt(lista.get(i).getNumeroSessao());
			} catch (NumberFormatException e) {
				removidos.add(lista.get(i));
				lista.remove(i);
				i--;
			}
		}
		
		passar.add(lista);
		passar.add(removidos);
		return passar;
	}
}
