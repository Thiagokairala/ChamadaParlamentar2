package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.DeputadosControl;

public class TesteDeputadosControl {
	DeputadosControl deputados;
	
	@Before
	public void setUp() {
		deputados = new DeputadosControl();
	}

	@Test
	public void testDeputadosControl() {
		assertNotNull(deputados);
	}

	@Test
	public void testGetDeputados() throws ClassNotFoundException, SQLException {
		assertTrue(DeputadosControl.getDeputados().size() != 0);
	}

	@Test
	public void testVerificaExistencia() throws ClassNotFoundException, SQLException {
		String nome1 = "naoVaiPassar";
		String nome2 = "tiririca";
		String nome3 = "JOSÉ AUGUSTO MAIA";
		
		assertTrue(DeputadosControl.verificaExistencia(nome1) == null);
		assertNotNull(DeputadosControl.verificaExistencia(nome2));
		assertNotNull(DeputadosControl.verificaExistencia(nome3));
		
	}
}
