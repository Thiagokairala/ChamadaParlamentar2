package br.com.MDSGPP.ChamadaParlamentar.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class ExceptionSessoesEReunioes {

	public static boolean validaData(String data) {

		boolean validado = false;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		sdf.setLenient(false);
		
		try {
			Date greg = sdf.parse(data);
			validado = true;
		} catch (ParseException e) {
			validado = false;
		}		
		return validado;		
	}
	
}
