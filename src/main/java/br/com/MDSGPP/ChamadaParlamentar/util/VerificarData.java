package br.com.MDSGPP.ChamadaParlamentar.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public final class VerificarData {

	public static boolean verificaData(String data) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		sdf.setLenient(false);

		try {
			Date greg = sdf.parse(data);
		} catch (ParseException e) {
			return false;
		}	
		return true;
	}
}
