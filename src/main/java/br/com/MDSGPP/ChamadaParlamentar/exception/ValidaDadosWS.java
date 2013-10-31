package br.com.MDSGPP.ChamadaParlamentar.exception;

import java.util.ArrayList;

public class ValidaDadosWS {

	public ValidaDadosWS() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean validaLista(ArrayList<String> lista) {
		
		if(lista.size() != 0) {
			return true;
		}
		return false;
	}

}
