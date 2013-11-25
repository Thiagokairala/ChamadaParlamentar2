package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.SessoesEReunioesControl;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class TesteSessoesEReunioesControl {
	SessoesEReunioesControl sessoes;
	
	@Before
	public void setUp() {
		sessoes = new SessoesEReunioesControl();
	}

	@Test
	public void testSessoesEReunioesControl() {
		assertNotNull(sessoes);
	}

	@Test
	public void testPassarSessao() throws ClassNotFoundException, SQLException {
		SessoesEReunioes teste = SessoesEReunioesControl.passarSessao("teste");
		assertNotNull(teste.getDeputadosPresentes());
		assertTrue(teste.getDeputadosPresentes().size() == 0);
		
		SessoesEReunioes teste2 = SessoesEReunioesControl.passarSessao("ORDINÁRIA Nº 313 - 20/11/2012");
		assertNotNull(teste2.getDeputadosPresentes());
		assertTrue(teste2.getDeputadosPresentes().size() > 0);		
	}
	
	@Test
	public void testArrumarListaDeputados() {
		ArrayList<String> listaParaTeste = new ArrayList<String>();
		
		
		for(int i = 0; i<50; i++) {
			listaParaTeste.add("numero " + i);
		}
		
		ArrayList<String> listaRecebida1 = SessoesEReunioesControl.arrumarListaDeputados(0, 10, listaParaTeste);
		ArrayList<String> listaRecebida2 = SessoesEReunioesControl.arrumarListaDeputados(5, 9, listaParaTeste);
		
		
		assertTrue(listaRecebida1.size() <= 10);
		assertTrue(listaRecebida2.size() > 0);
		assertTrue(listaRecebida2.size()<10);
	
	}

}
