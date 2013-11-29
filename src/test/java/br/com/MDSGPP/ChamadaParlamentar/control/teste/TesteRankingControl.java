package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.RankingControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaRankingException;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
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
	public void testGerarRanking()
			throws ClassNotFoundException, SQLException, ListaRankingException, ListaVaziaException {
		Ranking ranking = RankingControl.gerarRanking
				(RankingControl.gerarListaEstatistica
						(new DeputadoDao().getDeputados()));


		assertNotNull(ranking.getLista());
		assertNotNull(ranking.getMelhores());
		assertNotNull(ranking.getPiores());
		assertNotNull(ranking.getRemovidos());
	}

	@Test(expected=ListaRankingException.class)
	public void testGerarRankingListaRankingException() throws ListaRankingException{
		ArrayList<Estatistica> teste = new ArrayList<Estatistica>();
		Ranking ranking2 = RankingControl.gerarRanking(teste);
	}

	@Test(expected=ListaRankingException.class)
	public void testGerarRankingListaComParametroNull() throws ListaRankingException {

		Ranking ranking3 = RankingControl.gerarRanking(null);
	}


	@Test
	public void testGerarListaEstatistica() throws ClassNotFoundException, SQLException, ListaRankingException, ListaVaziaException {
		ArrayList<Estatistica> lista1 = RankingControl.gerarListaEstatistica(new DeputadoDao().getDeputados());
		assertNotNull(lista1);
	}

	@Test(expected=ListaRankingException.class)
	public void testGerarListaEstatisticaException() throws ClassNotFoundException, SQLException, ListaRankingException, ListaVaziaException {
		ArrayList<Deputados> listaParaParametro = new ArrayList<Deputados>();
		ArrayList<Estatistica> lista2 = RankingControl.gerarListaEstatistica(listaParaParametro);
	}

	@Test
	public void testOrdenacao() {
		ArrayList<Estatistica> lista = new ArrayList<Estatistica>();

		Estatistica primeiro = new Estatistica();
		Estatistica segundo = new Estatistica();
		Estatistica terceiro = new Estatistica();
		primeiro.setNumeroSessao("10");
		segundo.setNumeroSessao("20");
		terceiro.setNumeroSessao("15");

		lista.add(primeiro);
		lista.add(segundo);
		lista.add(terceiro);
		lista = RankingControl.ordenacao(lista);

		for(int i=0; i < lista.size() -1; i++)
		{
			assertTrue(Integer.parseInt(lista.get(i).getNumeroSessao()) > Integer.parseInt(lista.get(i+1).getNumeroSessao()));
		}
	}

	@Test
	public void testOrdenacaoListaNull() {
		ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
		lista = RankingControl.ordenacao(lista);
		assertTrue(lista.size() == 0 );
	}

}
