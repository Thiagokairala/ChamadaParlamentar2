package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DiaDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

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
		
		for(int i = 0; i<= datasPorPagina; i++) {
			if(pagina == 0) {
				listaPassar.add(dia.get(i));
			}
			else {
				if(listaPassar.size() < i+(pagina*datasPorPagina)) {
					listaPassar.add(dia.get(i+ (pagina*datasPorPagina)));
				}
			}
		}
		
		return listaPassar;
	}
	
	public static SessoesEReunioes procurarDia(ArrayList<Dia> lista, String descricao) {
		for(int i = 0; i<lista.size(); i++) {
			
			for(int j = 0; j<lista.get(i).getListaDescricaoCompleta().size(); j++) {
				if(lista.get(i).getListaDescricaoCompleta().get(j).equalsIgnoreCase(descricao)) {
					
				}
			}
		}
	}
}
