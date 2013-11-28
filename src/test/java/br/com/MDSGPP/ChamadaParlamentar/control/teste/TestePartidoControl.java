package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.PartidoControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class TestePartidoControl {

	@Test
	public void testPassarListaPartidos() 
			throws ClassNotFoundException, SQLException {
		assertNotNull(PartidoControl.passarListaPartidos());
	}
	
	@Test
	public void testVerificaExistenciaRetornaNulo() throws ClassNotFoundException, SQLException {
		PartidoControl control = new PartidoControl();
		assertTrue(control.verificaExistencia("ronaldo") == null);
	}
	
	@Test
	public void testVerificaExistenciaSigla() throws ClassNotFoundException, SQLException {
		PartidoControl control = new PartidoControl();
		
		ArrayList<ArrayList<String>> listaComDados = control.passarListaPartidos();
		String sigla = "PT";

		for(int i = 0; i<listaComDados.size(); i++) {
			if(listaComDados.get(i).get(1).equalsIgnoreCase(sigla)) {
				assertTrue(control.verificaExistencia(sigla) == listaComDados.get(i));
			}
		}
	}
	
	@Test
	public void testVerificaExistenciaNomePartido() throws ClassNotFoundException, SQLException {
		PartidoControl control = new PartidoControl();
		
		ArrayList<ArrayList<String>> listaComDados = control.passarListaPartidos();
		String partido = "Partido dos Trabalhadores";

		for(int i = 0; i<listaComDados.size(); i++) {
			if(listaComDados.get(i).get(0).equalsIgnoreCase(partido)) {
				assertTrue(control.verificaExistencia(partido) == listaComDados.get(i));
			}
		}
	}
	
	@Test
	public void testPassarPartidoCerto() throws ClassNotFoundException, SQLException {
		PartidoControl control = new PartidoControl();
		String nomePartido = "PT";
		
		ArrayList<String> nomePartidoCerto = control.verificaExistencia(nomePartido);
		
		assertNotNull(control.passarPartido(nomePartido));
	}
	
	@Test
	public void testPassarPartidoIncorreto() throws ClassNotFoundException, SQLException {
		PartidoControl control = new PartidoControl();
		String nomePartido = "erro";
		
		assertNotNull(control.passarPartido(nomePartido));
	}
	
	@Test
	public void testGerarEstatisticasdoPartidoCerto() throws ClassNotFoundException, SQLException {
		PartidoControl control = new PartidoControl();
		String nomePartido = "pt";
		assertNotNull(control.gerarEstatisticaDoPartido(nomePartido));
	}
}


	
