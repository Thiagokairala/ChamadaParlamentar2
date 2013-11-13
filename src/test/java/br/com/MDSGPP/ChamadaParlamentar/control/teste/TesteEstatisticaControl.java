package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.EstatisticaControl;
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
	public void testGerarEstatisticas() throws ClassNotFoundException, SQLException {
		Estatistica estatisticaTeste1 = null;
		Estatistica estatisticaTeste2 = null;
		Estatistica estatisticaTeste3 = null;
		
		estatisticaTeste1 = EstatisticaControl.gerarEstatisticas("naoDevePassar");
		estatisticaTeste2 = EstatisticaControl.gerarEstatisticas("abelardo lupion-dem/pr");
		estatisticaTeste3 = EstatisticaControl.gerarEstatisticas("ABELARDO LUPION-DEM/PR");
		
		assertTrue(estatisticaTeste1 == null);
		assertTrue(estatisticaTeste2 != null);
		assertTrue(estatisticaTeste3 != null);
	}
	
	@Test
	public void testArrumarNomePesquisa() {
		Deputados deputado1 = new Deputados();
		Deputados deputado2 = new Deputados();
		
		deputado1.setNomeDeTratamentoDoParlamentar("teste");
		deputado1.setPartido("PT");
		deputado1.setUf("Sn");
		
		String nomeArrumado = estatistica.arrumarNomePesquisa(deputado1);
		
		assertTrue(nomeArrumado.equals("TESTE-PT/SN"));
	}
}
