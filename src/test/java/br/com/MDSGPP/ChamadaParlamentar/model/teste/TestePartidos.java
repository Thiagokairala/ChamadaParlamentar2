package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
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
		
		ArrayList<Estatistica> array = new ArrayList<Estatistica>();
		partido.setEstatisticaDosDeputados(array);
		partido.setDeputadosSemDados(array);
		
		
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

	@Test
	public void testSetEstatisticaDosDeputados() {
		Estatistica estatistica = new Estatistica();
		partido.getEstatisticaDosDeputados().add(estatistica);
		assertTrue(partido.getEstatisticaDosDeputados().size() == 1);
	}

	@Test
	public void testsetDeputadosSemDados() {
		Estatistica estatistica = new Estatistica();
		partido.getDeputadosSemDados().add(estatistica);
		 assertTrue(partido.getDeputadosSemDados().size() == 1);
	}
	
}
