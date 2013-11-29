package br.com.MDSGPP.ChamadaParlamentar.util.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.util.VerificarData;

public class TesteVerificarData {
	
	@Test
	public void testVerificarData() {
		assertNotNull(new VerificarData());
	}

	@Test
	public void testVerificaData() {
		boolean resposta = VerificarData.verificaData("12/12/2012");
		boolean resposta2 = VerificarData.verificaData("nao deve passar");
		
		assertTrue(resposta);
		assertTrue(resposta2 == false);
	}

}
