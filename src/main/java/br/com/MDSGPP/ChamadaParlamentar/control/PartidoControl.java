package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.PartidoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public final class PartidoControl {

	public static ArrayList<ArrayList<String>> passarListaPartidos() 
			throws ClassNotFoundException, SQLException {
		ArrayList<ArrayList<String>> lista = new PartidoDao().pegarPartidos();	
		return lista;
	}

	public static ArrayList<String> verificaExistencia(String partido)
			throws ClassNotFoundException, SQLException {
		
		ArrayList<ArrayList<String>> listaComDados = passarListaPartidos();

		for(int i = 0; i<listaComDados.size(); i++) {
			if(listaComDados.get(i).get(0).equalsIgnoreCase(partido)
					||listaComDados.get(i).get(1).equalsIgnoreCase(partido)) {
				return listaComDados.get(i);
			}
		}
		return null;
	}

	public static Partidos passarPartido(String nomePartido) 
			throws ClassNotFoundException, SQLException {
		Partidos partido = new Partidos();
		partido.setDeputadosDoPartido(null);
		
		ArrayList<String> nomePartidoCerto = verificaExistencia(nomePartido);
		
		ArrayList<Deputados> todosDeputados = new DeputadoDao().getDeputados();
		ArrayList<Deputados> deputadosDoPartido = new ArrayList<Deputados>();

		if(nomePartidoCerto != null) {			
			for(int i = 0; i<todosDeputados.size(); i++) {
				if(nomePartidoCerto.get(0).equalsIgnoreCase(
						todosDeputados.get(i).getPartido())) {
					deputadosDoPartido.add(todosDeputados.get(i));
				}
			}
		}
		
		partido.setSigla(nomePartidoCerto.get(0));
		partido.setNomePartido(nomePartidoCerto.get(1));
		
		partido.setDeputadosDoPartido(deputadosDoPartido);
		return partido;
	}
}
