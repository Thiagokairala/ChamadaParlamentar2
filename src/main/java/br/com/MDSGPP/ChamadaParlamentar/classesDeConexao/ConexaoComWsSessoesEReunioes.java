package br.com.MDSGPP.ChamadaParlamentar.classesDeConexao;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasParlamentarResponseListarPresencasParlamentarResult;
import br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioesLocator;
import br.gov.camara.www.SitCamaraWS.SessoesReunioes.SessoesReunioesSoapStub;

public class ConexaoComWsSessoesEReunioes {

	public ConexaoComWsSessoesEReunioes() {

	}

	public static SessoesReunioesSoapStub obterConexao() throws MalformedURLException,
	ServiceException {
		URL url;
		url = new URL("http://www.camara.gov.br/SitCamaraWS/SessoesReunioes.asmx");
		
		SessoesReunioesSoapStub service = (SessoesReunioesSoapStub)
		new SessoesReunioesLocator().getSessoesReunioesSoap(url);
		
		return service;
	}
	
	public static
	ListarPresencasParlamentarResponseListarPresencasParlamentarResult
	receberElementPresenca (SessoesReunioesSoapStub service, String inicio,
			String fim, String matricula) {
		
		//conexao criada, agora chamaremos a classe do ws
		try {
			ListarPresencasParlamentarResponseListarPresencasParlamentarResult 
			sessoes = service.listarPresencasParlamentar(inicio, fim, matricula);
			
			return sessoes;
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
			return null;
		}	
	}
}
