package br.com.MDSGPP.ChamadaParlamentar.exception;

public class ExceptionDia {

	public static boolean verificaData(int tamanho){
		boolean passar = false;
		if(tamanho>0){
			passar = true;
		}
		
		return passar;
	}
	

}
