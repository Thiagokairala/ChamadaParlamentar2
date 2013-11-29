package br.com.MDSGPP.ChamadaParlamentar.util.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.util.AtualizarBanco;

public class TesteAtualizarBanco {

	@Test
	public void testIniciar() {
		AtualizarBanco atualiza = new AtualizarBanco();
		atualiza.iniciar();
	}

	@Test
	public void testParar() {
		fail("Not yet implemented");
	}

}
