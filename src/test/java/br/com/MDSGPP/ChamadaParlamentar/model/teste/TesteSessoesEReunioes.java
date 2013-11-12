package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class TesteSessoesEReunioes {

	SessoesEReunioes ser1;
	SessoesEReunioes ser2;
	
	@Test
	public void testSessoesEReunioesStringStringArrayListOfDeputados() {
		Deputados deputado1 = new Deputados();
		Deputados deputado2 = new Deputados();
		
		ArrayList<Deputados> lista = new ArrayList<Deputados>();
		
		lista.add(deputado1);
		lista.add(deputado2);
		
		
		ser1 = new SessoesEReunioes("12/12/2011", "descricaoQualquer", lista);
		ser2 = new SessoesEReunioes("abc", "descricaoQualquer2", lista);
		
		assertNotNull(ser1);
		assertNotNull(ser2);
		
		assertTrue(ser1.getData().equalsIgnoreCase("12/12/2011"));
		assertTrue(ser1.getDeputados() != null);
		assertTrue(ser1.getDescricao() != null);
		
		assertTrue(ser2.getData() == null);
		assertTrue(ser2.getDeputados() == null);
		assertTrue(ser2.getDescricao() == null);
	}

	@Test
	public void testSessoesEReunioes() {
		ser1 = null;
		
		ser1 = new SessoesEReunioes();
		
		assertNotNull(ser1);
	}

	//@Test
	public void testGetData() {
		fail("Not yet implemented");
	}

	//@Test
	public void testSetData() {
		fail("Not yet implemented");
	}

	//@Test
	public void testGetDescricao() {
		fail("Not yet implemented");
	}

	//@Test
	public void testSetDescricao() {
		fail("Not yet implemented");
	}

	//@Test
	public void testGetDeputados() {
		fail("Not yet implemented");
	}

	//@Test
	public void testSetDeputados() {
		fail("Not yet implemented");
	}

}
