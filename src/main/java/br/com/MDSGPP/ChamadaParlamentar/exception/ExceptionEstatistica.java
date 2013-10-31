package br.com.MDSGPP.ChamadaParlamentar.exception;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;

public class ExceptionEstatistica {

	public ExceptionEstatistica() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean verificaNome(String nome) {
		boolean passar = false;
		
		DeputadoDao deputados;
		try {
			deputados = new DeputadoDao();
			

			ArrayList<String>nomesDeputados = deputados.getNomesDeputados();
			
			for(int i = 0; i < nomesDeputados.size(); i++) {
				if(nomesDeputados.get(i).equals(nome)) {
					passar = true;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return passar;
	}

}
