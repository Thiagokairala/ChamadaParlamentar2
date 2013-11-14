package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DiaDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class DiaControl {
	
	public static ArrayList<Dia> getDias() throws ClassNotFoundException, SQLException {
		ArrayList<Dia> lista;
		DiaDao diaDao = new DiaDao();
		
		lista = diaDao.buscarTodasDescricoes();
		return lista;
	}
	
}
