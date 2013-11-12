package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public class DeputadosControl {

	public DeputadosControl() {
		
	}

	public static ArrayList<String> getDeputados() {
		
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
	
	public static Deputados verificaExistencia(String nome) {
		Deputados deputado = null;
		
		try {
			DeputadoDao deputadoDao = new DeputadoDao();			
			ArrayList<Deputados> lista = deputadoDao.getDeputados();

			for(int i = 0; i<lista.size(); i++) {
				if((lista.get(i).getNomeCivilDoParlamentar().
						equalsIgnoreCase(nome)) ||
						lista.get(i).getNomeDeTratamentoDoParlamentar()
						.equalsIgnoreCase(nome)) {

					deputado = lista.get(i);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deputado;
	}
}
