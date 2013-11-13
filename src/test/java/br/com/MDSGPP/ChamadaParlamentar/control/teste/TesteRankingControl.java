package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.RankingControl;

public class TesteRankingControl {
	RankingControl rankingControl;
	
	@Before
	public void setUp() {
		rankingControl = new RankingControl();
	}
	
	@Test
	public void testRankingControl() {
		assertNotNull(rankingControl);
	}

	@Test
	public void testGerarRanking() {
		fail("Not yet implemented");
	}

	@Test
	public void testGerarListaEstatistica() {
		RankingControl.gerarListaEstatistica()
	}

}
