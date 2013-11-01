package br.com.MDSGPP.ChamadaParlamentar.classesDeConexao.teste;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.classesDeConexao.ConexaoComWsDeputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public class TesteConexaoComWsDeputados {
	
	ConexaoComWsDeputados conexao;
	
	@Before
	public void setUp() {
		conexao = new ConexaoComWsDeputados();
	}
	
	//@Test
	public void testObterConexao() throws MalformedURLException,
	UnknownHostException, ServiceException {
		assertNotNull(ConexaoComWsDeputados.obterConexao());
	}

	//@Test
	public void testReceberElementDeputados() throws MalformedURLException,
	UnknownHostException, ServiceException {
		assertNotNull(ConexaoComWsDeputados.
				receberElementDeputados(ConexaoComWsDeputados.
						obterConexao()));
	}
	
	//@Test
	public void testCriaLista() throws MalformedURLException,
	UnknownHostException, ServiceException {
		ArrayList<Deputados> lista = conexao.criaLista();
		
		//testando se o arrayList possui tamanho maior que 0
		assertTrue(lista.size() != 0);
	}
}
