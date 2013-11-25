package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public class DeputadosControl {

	public static ArrayList<String> getDeputados() throws ClassNotFoundException, SQLException {

		DeputadoDao deputado;
		deputado = new DeputadoDao();

		return deputado.getNomesDeputados();
	}

	public static Deputados verificaExistencia(String nome) throws ClassNotFoundException, SQLException {
		Deputados deputado = null;

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

		return deputado;
	}
}
