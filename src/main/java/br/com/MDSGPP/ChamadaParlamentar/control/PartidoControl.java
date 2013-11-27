package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.PartidoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public final class PartidoControl {

	public static ArrayList<String> passarListaPartidos() 
			throws ClassNotFoundException, SQLException {
		ArrayList<String> listaPassar = new PartidoDao().pegarPartidos();

		return listaPassar;
	}

	public static String verificaExistencia(String partido)
			throws ClassNotFoundException, SQLException {
		
		ArrayList<String> listaComDados = passarListaPartidos();

		System.out.println(partido);
		for(int i = 0; i<listaComDados.size(); i++) {
			if(partido.equalsIgnoreCase(listaComDados.get(i))) {
				return listaComDados.get(i);
			}
		}
		return null;
	}

	public static Partidos passarPartido(String nomePartido) 
			throws ClassNotFoundException, SQLException {
		Partidos partido = new Partidos();
		partido.setDeputadosDoPartido(null);
		
		String nomePartidoCerto = verificaExistencia(nomePartido);
		
		ArrayList<Deputados> todosDeputados = new DeputadoDao().getDeputados();
		ArrayList<Deputados> deputadosDoPartido = new ArrayList<Deputados>();

		if(nomePartidoCerto != null) {
			
			
			for(int i = 0; i<todosDeputados.size(); i++) {
				if(nomePartidoCerto.equalsIgnoreCase(
						todosDeputados.get(i).getPartido())) {
					
					deputadosDoPartido.add(todosDeputados.get(i));
				}
			}
		}
		
		partido.setNomePartido(nomePartidoCerto);
		
		partido.setDeputadosDoPartido(deputadosDoPartido);
		return partido;
	}
}
