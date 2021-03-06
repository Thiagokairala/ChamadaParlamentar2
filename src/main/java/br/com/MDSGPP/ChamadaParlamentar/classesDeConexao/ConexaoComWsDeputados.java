package br.com.MDSGPP.ChamadaParlamentar.classesDeConexao;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.NodeList;

import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;
import br.gov.camara.www.SitCamaraWS.Deputados.DeputadosLocator;
import br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoapStub;
import br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult;
import br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult;

public class ConexaoComWsDeputados {

	public ConexaoComWsDeputados() {


	}


	public static DeputadosSoapStub obterConexao()
			throws MalformedURLException, ServiceException, UnknownHostException {
		URL url;
		url = new URL("http://www.camara.gov.br/SitCamaraWS/Deputados.asmx");
		DeputadosSoapStub service = (DeputadosSoapStub)
				new DeputadosLocator().getDeputadosSoap(url);

		return service;
	}


	public static ObterDeputadosResponseObterDeputadosResult 
	receberElementDeputados(DeputadosSoapStub service) {

		//conexao criada, agora chamaremos a classe do ws
		try {
			ObterDeputadosResponseObterDeputadosResult deputados =
					service.obterDeputados();

			return deputados;

		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}	
	}

	public static ArrayList<Deputados> criaLista() throws MalformedURLException,
	UnknownHostException, ServiceException {
		ArrayList<Deputados> lista = new ArrayList<Deputados>();
		ObterDeputadosResponseObterDeputadosResult deputados;

		deputados = ConexaoComWsDeputados.receberElementDeputados
				(ConexaoComWsDeputados.obterConexao());			
		NodeList nome = deputados.get_any()[0].getElementsByTagName("nome");
		NodeList nomeTratamento = deputados.get_any()[0].getElementsByTagName("nomeParlamentar");
		NodeList id = deputados.get_any()[0].getElementsByTagName("ideCadastro");
		NodeList matricula = deputados.get_any()[0].getElementsByTagName("matricula");
		NodeList idParlamentar = deputados.get_any()[0].getElementsByTagName("idParlamentar");
		NodeList sexo = deputados.get_any()[0].getElementsByTagName("sexo");
		NodeList uf = deputados.get_any()[0].getElementsByTagName("uf");
		NodeList partido = deputados.get_any()[0].getElementsByTagName("partido");
		NodeList gabinete = deputados.get_any()[0].getElementsByTagName("gabinete");
		NodeList anexo = deputados.get_any()[0].getElementsByTagName("anexo");
		NodeList fone = deputados.get_any()[0].getElementsByTagName("fone");
		NodeList email = deputados.get_any()[0].getElementsByTagName("email");

		for(int i = 0; i<nome.getLength(); i++) {
			MessageElement nomeTratamentoTemp = (MessageElement) nomeTratamento.item(i);
			MessageElement nomeTemp = (MessageElement) nome.item(i);
			MessageElement idTemp = (MessageElement) id.item(i);
			MessageElement matriculaTemp = (MessageElement) matricula.item(i);
			MessageElement idParlamentarTemp = (MessageElement) idParlamentar.item(i);
			MessageElement sexoTemp = (MessageElement) sexo.item(i);
			MessageElement ufTemp = (MessageElement) uf.item(i);
			MessageElement partidoTemp = (MessageElement) partido.item(i);
			MessageElement gabineteTemp = (MessageElement) gabinete.item(i);
			MessageElement anexoTemp = (MessageElement) anexo.item(i);
			MessageElement foneTemp = (MessageElement) fone.item(i);
			MessageElement emailTemp = (MessageElement) email.item(i);

			int idInt = Integer.parseInt(idTemp.getFirstChild().getNodeValue());
			int matriculaInt = Integer.parseInt(matriculaTemp.getFirstChild().getNodeValue());
			int idParlamentarInt = Integer.parseInt(idParlamentarTemp.getFirstChild().getNodeValue());
			String nomeText = nomeTemp.getFirstChild().getNodeValue();
			String nomeTratamentoText = nomeTratamentoTemp.getFirstChild().getNodeValue();
			String sexoText = sexoTemp.getFirstChild().getNodeValue();
			String ufText = ufTemp.getFirstChild().getNodeValue();
			String partidoText = partidoTemp.getFirstChild().getNodeValue();
			String gabineteText;
			String anexoText;
			String foneText;

			try {//esse try catch esta aqui por causa de um erro oriundo do webservice no qual
				//a tag nao vem completa para o devido tratamento.
				gabineteText = gabineteTemp.getFirstChild().getNodeValue();
				anexoText = anexoTemp.getFirstChild().getNodeValue();
				foneText = foneTemp.getFirstChild().getNodeValue();
			} catch (NullPointerException e) {
				gabineteText = null;
				anexoText = null;
				foneText = null;

			}



			String emailText = emailTemp.getFirstChild().getNodeValue();

			Deputados deputadoNovo = new Deputados(idParlamentarInt, matriculaInt, idInt,
					nomeText, nomeTratamentoText, sexoText, ufText, partidoText, gabineteText,
					anexoText, foneText, emailText);

			lista.add(deputadoNovo);
		}
		return lista;
	}

	public static ObterPartidosCDResponseObterPartidosCDResult 
	receberElementPartido(DeputadosSoapStub service) {			
		//conexao criada, agora chamaremos a classe do ws
		try {
			ObterPartidosCDResponseObterPartidosCDResult partidos =
					service.obterPartidosCD();

			return partidos;

		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}	
	}

	public static ArrayList<Partidos> criaListaPartidos() 
			throws MalformedURLException, UnknownHostException, ServiceException {
		ArrayList<Partidos> lista = new ArrayList<Partidos>();

		ObterPartidosCDResponseObterPartidosCDResult partidos;

		partidos = receberElementPartido(obterConexao());

		NodeList nomePartido = partidos.get_any()[0].getElementsByTagName("nomePartido");
		NodeList siglaPartido = partidos.get_any()[0].getElementsByTagName("siglaPartido");
		NodeList dataExtincao = partidos.get_any()[0].getElementsByTagName("dataExtincao");

		for(int i = 0; i<nomePartido.getLength(); i++) {
			MessageElement nomePartidoTemp = (MessageElement) nomePartido.item(i);
			MessageElement siglaPartidoTemp = (MessageElement) siglaPartido.item(i);
			MessageElement dataExtincaoTemp = (MessageElement) dataExtincao.item(i);

			String nomePartidoText = nomePartidoTemp.getFirstChild().getNodeValue();
			String siglaPartidoText = siglaPartidoTemp.getFirstChild().getNodeValue();

			//esse try catch é para retirar os partidos que já nao
			//existem mais
			try {
				String dataExtincaoText = dataExtincaoTemp.getFirstChild().getNodeValue();
			} catch(NullPointerException e) {
				Partidos partidoAdicionar = new Partidos();
				partidoAdicionar.setSigla(siglaPartidoText);
				partidoAdicionar.setNomePartido(nomePartidoText);

				//se essa expressao for falsa
				if(!nomePartidoText.equalsIgnoreCase("sem partido")) {
					lista.add(partidoAdicionar);
				}
			}
		}

		return lista;
	}
}	
