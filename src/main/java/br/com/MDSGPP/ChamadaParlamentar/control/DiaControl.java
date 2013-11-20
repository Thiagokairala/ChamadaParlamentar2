package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DiaDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class DiaControl {

	public static ArrayList<Dia> getDias() throws ClassNotFoundException, SQLException {
		ArrayList<Dia> lista;
		DiaDao diaDao = new DiaDao();

		lista = diaDao.buscarTodasDescricoes();

		ArrayList<Dia> listaInverter = new ArrayList<Dia>();

		for(int i = 0; i<lista.size(); i++) {
			listaInverter.add(lista.get(lista.size()-1-i));
		}

		return listaInverter;
	}

	public static ArrayList<Dia> getListaCerta(int pagina, int datasPorPagina,
			ArrayList<Dia> dia) {
		ArrayList<Dia> listaPassar = new ArrayList<Dia>();
		
		for(int i = 0; i< datasPorPagina; i++) {
			if(pagina == 0) {
				listaPassar.add(dia.get(i));
			}
			else {
				if(i+(pagina*datasPorPagina) < dia.size()) {
					listaPassar.add(dia.get(i+ (pagina*datasPorPagina)));
				}
			}
		}
		
		return listaPassar;
	}
	
	public static Dia passarData(String data) throws ClassNotFoundException, SQLException{
		Dia dia = new SessoesEReunioesDao().procuraDia(data);
		dia.setData(data);
		if(dia.getListaSessoes().size() == 0){
			dia = null;
		}
		
		return dia;
	}
}
