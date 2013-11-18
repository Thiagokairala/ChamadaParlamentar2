package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.RankingControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

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
	public void testGerarRanking() throws ClassNotFoundException, SQLException {
		Ranking ranking = RankingControl.gerarRanking
				(RankingControl.gerarListaEstatistica
						(new DeputadoDao().getDeputados()));
		ArrayList<Estatistica> teste = new ArrayList<Estatistica>();
		Ranking ranking2 = RankingControl.gerarRanking(teste);
		
		Ranking ranking3 = RankingControl.gerarRanking(null);
		
		assertNotNull(ranking.getLista());
		assertNotNull(ranking.getMelhores());
		assertNotNull(ranking.getPiores());
		assertNotNull(ranking.getRemovidos());
		
		assertTrue(ranking2 == null);
		
		assertTrue(ranking3 == null);
	}
	
	@Test
	public void testGerarListaEstatistica() throws ClassNotFoundException, SQLException {
		ArrayList<Estatistica> lista1 = RankingControl.gerarListaEstatistica(new DeputadoDao().getDeputados());
		
		assertNotNull(lista1);
	}
	
	@Test
	public void testOrdenacao() {
		ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
		
		lista = RankingControl.ordenacao(lista);
		
		assertNotNull(lista);
	}

}
