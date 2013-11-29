package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.EstatisticaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class TesteEstatisticaControl {
	
	EstatisticaControl estatistica;
	
	@Before
	public void setUp() {
		estatistica = new EstatisticaControl();
	}
	
	@Test
	public void testEstatisticaControl() {
		assertNotNull(estatistica);
	}

	@Test
	public void testGerarEstatisticas() 
			throws ClassNotFoundException, SQLException, ListaVaziaException {
		Estatistica estatisticaTeste2 = null;
		Estatistica estatisticaTeste3 = null;
		
		estatisticaTeste2 = EstatisticaControl.gerarEstatisticas("abelardo lupion-dem/pr");
		estatisticaTeste3 = EstatisticaControl.gerarEstatisticas("ABELARDO LUPION-DEM/PR");
		
		assertTrue(estatisticaTeste2 != null);
		assertTrue(estatisticaTeste3 != null);
	}
	
	@Test(expected=ListaVaziaException.class)
	public void testGerarEstatisticasListaVazia() 
			throws ClassNotFoundException, SQLException, ListaVaziaException {
		Estatistica estatisticaTeste1 = 
				EstatisticaControl.gerarEstatisticas("naoDevePassar");
	}
	
	@Test
	public void testGerarEstatisticasComDoisParametros() 
			throws ClassNotFoundException, SQLException, ListaVaziaException {
		Estatistica estatisticaTeste2 = null;
		Estatistica estatisticaTeste3 = null;
		
		estatisticaTeste2 = EstatisticaControl.gerarEstatisticas("abelardo lupion-dem/pr", 4);
		estatisticaTeste3 = EstatisticaControl.gerarEstatisticas("ABELARDO LUPION-DEM/PR", 5);
		
		assertTrue(estatisticaTeste2 != null);
		assertTrue(estatisticaTeste3 != null);
		assertTrue(estatisticaTeste2.getNome().equalsIgnoreCase(estatisticaTeste3.getNome()));
	}
	
	@Test(expected=ListaVaziaException.class)
	public void testGerarEstatisticasComDoisParametrosListaVazia() 
			throws ClassNotFoundException, SQLException, ListaVaziaException {
		Estatistica estatisticaTeste1 = EstatisticaControl.gerarEstatisticas("naoDevePassar", 3);
	}
	
	@Test
	public void testArrumarNomePesquisa() {
		Deputados deputado1 = new Deputados();
		
		deputado1.setNomeDeTratamentoDoParlamentar("teste");
		deputado1.setPartido("PT");
		deputado1.setUf("Sn");
		
		String nomeArrumado = EstatisticaControl.arrumarNomePesquisa(deputado1);
		
		assertTrue(nomeArrumado.equals("TESTE-PT/SN"));
	}
	
	@Test
	public void testPassarListaCerta() {
		ArrayList<String> listaParaTeste = new ArrayList<String>();
		ArrayList<String> listaParaTeste2 = new ArrayList<String>();
		for(int i = 0 ; i<50; i++) {
			listaParaTeste.add("numero " + i);
			listaParaTeste2.add("numero " + i);
		}
		
		listaParaTeste = EstatisticaControl.passarListaCerta(0, 10, listaParaTeste);
		assertTrue(listaParaTeste.size() <= 10);
		
		listaParaTeste2 = EstatisticaControl.passarListaCerta(5, 9, listaParaTeste2);
		assertTrue(listaParaTeste2.size() > 0);
		assertTrue(listaParaTeste2.size() < 10);
	}
	
	@Test(expected= IndexOutOfBoundsException.class)
	public void testPassarListaCertaExcessao() {
		ArrayList<String> listaParaTeste = new ArrayList<String>();
		
		listaParaTeste = EstatisticaControl.passarListaCerta(5, 9, listaParaTeste);
	}
	
	@Test
	public void testOrdenarLista() {
		ArrayList<String> listaParaTeste = new ArrayList<String>();
		for(int i = 0 ; i<50; i++) {
			listaParaTeste.add("numero " + i);
		}
		
		ArrayList<String> ordenado = EstatisticaControl.ordenarLista(listaParaTeste);
		
		for(int i = 0; i<listaParaTeste.size(); i++) {
			assertTrue(ordenado.get(i).equals(listaParaTeste.get(listaParaTeste.size() - 1 - i)));
		}
	}
}
