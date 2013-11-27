package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class TestePartidos {

	Partidos partido;
	
	@Before
	public void setUp() {
		ArrayList<Deputados> lista = new ArrayList<Deputados>();
		partido = new Partidos();
		partido.setNomePartido("teste");
		partido.setSigla("df");
		partido.setDeputadosDoPartido(lista);
		
	}
	@Test
	public void testGetNomePartido() {
		assertTrue(partido.getNomePartido().equalsIgnoreCase("teste"));
	}

	@Test
	public void testSetNomePartido() {
		partido.setNomePartido("testeSet");
		assertTrue(partido.getNomePartido().equalsIgnoreCase("testeSet"));
	}

	@Test
	public void testGetSigla() {
		assertTrue(partido.getSigla().equalsIgnoreCase("df"));
	}

	@Test
	public void testSetSigla() {
		partido.setSigla("OF");
		assertTrue(partido.getSigla().equalsIgnoreCase("OF"));
	}

	@Test
	public void testGetDeputadosDoPartido() {
		assertTrue(partido.getDeputadosDoPartido().size() == 0);
	}

	@Test
	public void testSetDeputadosDoPartido() {
		Deputados deputado = new Deputados();
		 partido.getDeputadosDoPartido().add(deputado);
		 
		 assertTrue(partido.getDeputadosDoPartido().size() == 1);
	}

}
