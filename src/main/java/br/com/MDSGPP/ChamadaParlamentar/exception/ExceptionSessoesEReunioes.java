package br.com.MDSGPP.ChamadaParlamentar.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ExceptionSessoesEReunioes {

	public static boolean validaData(String data) {
		boolean passar = false;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		
		try {
		  Date dataTeste = sdf.parse(data);
		  passar = true;
		} catch(ParseException e) {
		  passar = false;
		}
		
		return passar;
	}
	
}
