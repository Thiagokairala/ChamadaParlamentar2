package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import junit.framework.TestCase;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class TesteSessoesEReunioes extends TestCase {
	SessoesEReunioes sessoes = new SessoesEReunioes();
	
	public void setUp() throws Exception {
	
		sessoes.setData("000");
		sessoes.setDescricao("Sessao muito importante");
		
	}
	
	//Testando a instância do objeto.
	@Test
public void testInstancia() {
		assertNotNull(sessoes);
	}
	//Testando gets e sets
	@Test
	public void testObjeto() {
		assertTrue(sessoes.getData().equalsIgnoreCase("000"));
		assertTrue(sessoes.getDescricao().equalsIgnoreCase("Sessao muito importante"));
	}
}
