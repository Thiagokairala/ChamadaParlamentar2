package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.model.EstatisticaPartido;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class TesteEstatisticaPartido {

	EstatisticaPartido estatisticaPartido;
	
	@Before
	public void setUp()
	{
		estatisticaPartido = new EstatisticaPartido();
		
	}
	
	@Test
	public void testGetPartido() {
		Partidos partido = new Partidos();
		estatisticaPartido.setPartido(partido);
		assertTrue(estatisticaPartido.getPartido().equals(partido));
	}

	@Test
	public void testSetPartido() {
		Partidos partido = new Partidos();
		estatisticaPartido.setPartido(partido);
		assertTrue(estatisticaPartido.getPartido().equals(partido));
	}

	@Test
	public void testGetQuantidadeDeSessoes() {
		int testQuantidade = 9;
		estatisticaPartido.setQuantidadeDeSessoes(testQuantidade);
		assertTrue(estatisticaPartido.getQuantidadeDeSessoes() == testQuantidade);
	}

	@Test
	public void testSetQuantidadeDeSessoes() {
		int testQuantidade = 9;
		estatisticaPartido.setQuantidadeDeSessoes(testQuantidade);
		assertTrue(estatisticaPartido.getQuantidadeDeSessoes() == testQuantidade);
		
	}

	@Test
	public void testGetSessoesAssistidas() {
		int testQuantidade = 1;
		estatisticaPartido.setSessoesAssistidas(testQuantidade);
		assertTrue(estatisticaPartido.getSessoesAssistidas() == testQuantidade);
	}

	@Test
	public void testSetSessoesAssistidas() {
		estatisticaPartido.setSessoesAssistidas(9);
		assertTrue(estatisticaPartido.getSessoesAssistidas() == 9);
	}

	@Test
	public void testGetPorcentagem() {
		String testString = "teste";
		estatisticaPartido.setPorcentagem(testString);
		assertTrue(estatisticaPartido.getPorcentagem().equalsIgnoreCase(testString));
	}

	@Test
	public void testSetPorcentagem() {
		String testString = "teste";
		estatisticaPartido.setPorcentagem(testString);
		assertTrue(estatisticaPartido.getPorcentagem().equalsIgnoreCase(testString));
	}

}
