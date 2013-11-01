package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;

public class DeputadosControl {

	public DeputadosControl() {
	
	}

	public ArrayList<String> getDeputados() {
		
		DeputadoDao deputado;
		try {
			deputado = new DeputadoDao();
						
			return deputado.getNomesDeputados();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
