package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.PartidoControl;

public class TestePartidoControl {

	@Test
	public void testPassarListaPartidos() 
			throws ClassNotFoundException, SQLException {
		assertNotNull(PartidoControl.passarListaPartidos());
	}

}
