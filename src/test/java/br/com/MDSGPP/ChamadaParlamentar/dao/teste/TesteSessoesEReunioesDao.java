package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;

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

}
