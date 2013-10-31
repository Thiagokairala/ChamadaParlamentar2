package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;

public class TesteDeputadoDao {

	DeputadoDao depu;
	@Before
	public void setUp() throws Exception {
		depu = new DeputadoDao();
	}
	
	//Testando a instância
	@Test
	public void test() {
		assertNotNull(depu);
	}
	
	//Pensar em mais testes para esta classe

}
