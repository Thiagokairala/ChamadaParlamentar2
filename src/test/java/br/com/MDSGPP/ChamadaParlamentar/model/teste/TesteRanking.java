package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

public class TesteRanking {
	Ranking ranking1 = new Ranking();
	Ranking ranking2 = new Ranking();
	ArrayList<Estatistica> lista;

	@Before
	public void setUp() throws Exception {
		lista = new ArrayList<Estatistica>();
		ranking1.setLista(lista);
		ranking1.setMelhores(lista);
		ranking1.setPiores(lista);
		ranking1.setRemovidos(lista);
	}

	@Test
	public void testRanking() {
		assertNotNull(ranking1);
		assertNotNull(ranking2);
	}

	@Test
	public void testGetLista() {
		assertNotNull(ranking1.getLista());
	}

	@Test
	public void testSetLista() {
		ranking2.setLista(lista);
		assertNotNull(ranking2.getLista());
	}

	@Test
	public void testGetRemovidos() {
		assertNotNull(ranking1.getRemovidos());
	}

	@Test
	public void testSetRemovidos() {
		ranking2.setRemovidos(lista);
		assertNotNull(ranking2.getRemovidos());
	}

	@Test
	public void testGetMelhores() {
		assertNotNull(ranking1.getMelhores());
	}

	@Test
	public void testSetMelhores() {
		ranking2.setMelhores(lista);
		assertNotNull(ranking2.getMelhores());
	}

	@Test
	public void testGetPiores() {
		assertNotNull(ranking1.getPiores());
	}

	@Test
	public void testSetPiores() {
		ranking2.setPiores(lista);
		assertNotNull(ranking2.getPiores());
	}

}
