package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.assertNotNull;

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
		
		assertNotNull(ranking.getLista());
		assertNotNull(ranking.getMelhores());
		assertNotNull(ranking.getPiores());
		assertNotNull(ranking.getRemovidos());
	}
	
	@Test
	public void testGerarListaEstatistica() throws ClassNotFoundException, SQLException {
		ArrayList<Estatistica> lista1 = RankingControl.gerarListaEstatistica(new DeputadoDao().getDeputados());
		
		assertNotNull(lista1);
	}

}
