package br.com.MDSGPP.ChamadaParlamentar.classesDeConexao.teste;

import static org.junit.Assert.assertNotNull;

import java.net.MalformedURLException;

import javax.xml.rpc.ServiceException;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.classesDeConexao.ConexaoComWsSessoesEReunioes;

public class TesteConexaoComWsSessoesEReunioes {

	//@Test
	public void testObterConexao() throws MalformedURLException, ServiceException {
		assertNotNull(ConexaoComWsSessoesEReunioes.obterConexao());
	}

	//@Test
	public void testReceberElementPresenca() throws MalformedURLException, ServiceException {
		assertNotNull(ConexaoComWsSessoesEReunioes.
				receberElementPresenca(ConexaoComWsSessoesEReunioes.obterConexao(), 
						"20/11/2012", "30/11/2013", "440"));
	}

}
