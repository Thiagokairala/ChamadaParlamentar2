package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.dao.DiaDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class TesteDiaDao {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDiaDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuscarTodasDescricoes() throws ClassNotFoundException, SQLException {
		ArrayList<Dia> dias = new ArrayList<Dia>();
		DiaDao diaDao = new DiaDao();
		dias = diaDao.buscarTodasDescricoes();
		
		for(int i = 0; i<dias.size(); i++) {
			System.out.println(dias.get(i).getData());
			ArrayList<String> lista = dias.get(i).getLista();
			
			for(int j = 0; j<lista.size(); j++) {
				System.out.println("------"+lista.get(j));
			}
		}
	}

}
