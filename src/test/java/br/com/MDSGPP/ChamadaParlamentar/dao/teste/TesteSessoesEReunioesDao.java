package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class TesteSessoesEReunioesDao {
	SessoesEReunioesDao sessoesDao;
	
	@Before
	public void setUp() throws ClassNotFoundException, SQLException {
		sessoesDao = new SessoesEReunioesDao();
	}
	
	@Test
	public void testSessoesEReunioesDao() {
		assertNotNull(sessoesDao);
	}

	@Test
	public void testPassarNumeroDeSessoes() throws SQLException {
		assertTrue(sessoesDao.passarNumeroDeSessoes() > 0);
	}
	
	@Test
	public void testbuscarTodasDescricoes() throws SQLException {
		ArrayList<SessoesEReunioes> sessoes = sessoesDao.buscarTodasDescricoes();
		
	}

}
