package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.PartidoDao;

public final class PartidoControl {

	public static ArrayList<String> passarListaPartidos() 
			throws ClassNotFoundException, SQLException {
		ArrayList<String> listaPassar = new PartidoDao().pegarPartidos();
		
		return listaPassar;
	}
}
