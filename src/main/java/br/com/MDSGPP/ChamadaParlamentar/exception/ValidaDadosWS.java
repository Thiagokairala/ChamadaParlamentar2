package br.com.MDSGPP.ChamadaParlamentar.exception;

import java.util.ArrayList;

public final class ValidaDadosWS {
	
	public static boolean validaLista(ArrayList<String> lista) {
		
		if(lista.size() != 0) {
			return true;
		}
		return false;
	}

}
