package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.PartidoControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class TestePartidoControl {

	@Test
	public void testPassarListaPartidos() 
			throws ClassNotFoundException, SQLException {
		assertNotNull(PartidoControl.passarListaPartidos());
	}
	
	@Test
	public void testVerificaExistenciaRetornaNulo() throws ClassNotFoundException, SQLException {
		assertTrue(PartidoControl.verificaExistencia("ronaldo") == null);
	}
	
	@Test
	public void testVerificaExistenciaSigla() throws ClassNotFoundException, SQLException {
		ArrayList<ArrayList<String>> listaComDados = PartidoControl.passarListaPartidos();
		String sigla = "PT";

		for(int i = 0; i<listaComDados.size(); i++) {
			if(listaComDados.get(i).get(1).equalsIgnoreCase(sigla)) {
				assertTrue(PartidoControl.verificaExistencia(sigla) == listaComDados.get(i));
			}
		}
	}
	
	@Test
	public void testVerificaExistenciaNomePartido() throws ClassNotFoundException, SQLException {
		ArrayList<ArrayList<String>> listaComDados = PartidoControl.passarListaPartidos();
		String partido = "Partido dos Trabalhadores";

		for(int i = 0; i<listaComDados.size(); i++) {
			if(listaComDados.get(i).get(0).equalsIgnoreCase(partido)) {
				assertTrue(PartidoControl.verificaExistencia(partido) == listaComDados.get(i));
			}
		}
	}
	
	@Test//aqui ainda falta testar
	public void testPassarPartidoCerto() throws ClassNotFoundException, SQLException {
		PartidoControl control = new PartidoControl();
		String nomePartido = "PT";
		
		ArrayList<String> nomePartidoCerto = PartidoControl.verificaExistencia(nomePartido);
		
		assertNotNull(PartidoControl.passarPartido(nomePartido));
	}
	
	@Test
	public void testPassarPartidoIncorreto() throws ClassNotFoundException, SQLException {
		String nomePartido = "erro";
		
		assertNotNull(PartidoControl.passarPartido(nomePartido));
	}
	
	@Test
	public void testGerarEstatisticasdoPartidoCerto() 
			throws ClassNotFoundException, SQLException, ListaVaziaException {
		String nomePartido = "pt";
		assertNotNull(PartidoControl.gerarEstatisticaDoPartido(nomePartido));
	}
	
	@Test(expected=ListaVaziaException.class)
	public void testGerarEstatisticasdoPartidoCertoListaVazia() throws ClassNotFoundException, SQLException, ListaVaziaException {
		String nomePartido = "NaoEPraPassar";
		PartidoControl.gerarEstatisticaDoPartido(nomePartido);
	}
	
	@Test
	public void testPassarPartidoComDadosCompletos() 
			throws ClassNotFoundException, SQLException, ListaVaziaException {
		String nomePartido1 = "pt";
		String nomePartido2 = "PT";
		String nomePartido3 = "partido dos trabalhadores";
		
		Partidos partido1 = PartidoControl.passarPartidoComDadosCompletos(nomePartido1);
		Partidos partido2 = PartidoControl.passarPartidoComDadosCompletos(nomePartido2);
		Partidos partido3 = PartidoControl.passarPartidoComDadosCompletos(nomePartido3);
		
		assertNotNull(partido1);
		assertTrue(partido1.getDeputadosDoPartido().size()>0);
		
		assertNotNull(partido2);
		assertTrue(partido2.getDeputadosDoPartido().size()>0);
		
		assertTrue(partido1.getSigla().equalsIgnoreCase(partido2.getSigla()));
		
		assertNotNull(partido3);
		
		assertTrue(partido1.getSigla().equalsIgnoreCase(partido3.getSigla()));
	}
	
	@Test(expected=ListaVaziaException.class)
	public void testPassarPartidoComDadosCompletosListaVazia() throws ClassNotFoundException, SQLException, ListaVaziaException {
		Partidos partido1 = PartidoControl.passarPartidoComDadosCompletos("nao pode passar");
	}
}