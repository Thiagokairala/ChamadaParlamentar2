package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.PartidoControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class TestePartidoControl {

	@Test
	public void testPassarListaPartidos() 
			throws ClassNotFoundException, SQLException {
		assertNotNull(PartidoControl.passarListaPartidos());
	}
	
	@Test
	public void testVerificaExistenciaRetornaNulo() throws ClassNotFoundException, SQLException{
		PartidoControl control = new PartidoControl();
		assertTrue(control.verificaExistencia("ronaldo") == null);
	}
}


	
