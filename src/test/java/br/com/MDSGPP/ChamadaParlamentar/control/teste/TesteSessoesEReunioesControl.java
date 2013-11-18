package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;

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

}
