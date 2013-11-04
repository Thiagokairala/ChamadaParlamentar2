package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.SessoesEReunioesControl;

public class TesteSessoesEReunioesControl {

	SessoesEReunioesControl sessoesEReunioes;
	
	@Before
	public void setUp() {
		sessoesEReunioes = new SessoesEReunioesControl();
	}
	
	@Test
	public void testSessoesEReunioesControl() {
		assertNotNull(sessoesEReunioes);
	}

}
