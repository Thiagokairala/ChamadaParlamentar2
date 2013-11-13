package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.dao.ConnectionFactory;

public class TesteConnectionFactory {

	ConnectionFactory connection;
	@Before
	public void setUp() throws Exception {
		connection = new ConnectionFactory();
	}

	//Testando a instância
	@Test
	public void test() {
		assertNotNull(connection);
	}	
}
