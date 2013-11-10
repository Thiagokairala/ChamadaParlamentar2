package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class TesteEstatistica {
	Estatistica test = new Estatistica();	
	@Before
	public void setUp() throws Exception {
		test.setNome("Rafael");
		test.setNumeroSessao("123");
		test.setTotalSessao("100");
		test.setPorcentagem("98");
		ArrayList<String> lista = new ArrayList<String> ();
		for(int i=0 ; i<30 ; i++)
			lista.add(""+i);
		test.setLista(lista);
		
	}
		

	@Test
	public void testEstatistica() {//Testando instância de estatistica
		assertNotNull(test);
	}
	@Test
	public void testGetNumeroSessao() {
		assertNotNull(test.getNumeroSessao());
	}

	@Test
	public void testSetNumeroSessao() {
		assertTrue(test.getNumeroSessao().equals("123"));
	}

	@Test
	public void testGetTotalSessao() {
		assertNotNull(test.getTotalSessao());
	}

	@Test
	public void testSetTotalSessao() {
		assertTrue(test.getTotalSessao().equals("100"));
	}

	@Test
	public void testGetNome() {
		assertNotNull(test.getNome());
	}

	@Test
	public void testSetNome() {
		assertTrue(test.getNome().equals("Rafael"));
	}

	@Test
	public void testGetPorcentagem() {
		assertNotNull(test.getPorcentagem());
	}

	@Test
	public void testSetPorcentagem() {
		assertTrue(test.getPorcentagem().equals("98"));
	}

	@Test
	public void testGetLista() {
		assertNotNull(test.getLista());
	}

	@Test
	public void testSetLista() {
			for(int i=0 ; i<30 ; i++)
			assertTrue(test.getLista().get(i).equals(""+i));
	}
}
