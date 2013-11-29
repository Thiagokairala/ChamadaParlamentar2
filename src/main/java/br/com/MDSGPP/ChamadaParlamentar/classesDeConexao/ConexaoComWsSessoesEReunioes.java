package br.com.MDSGPP.ChamadaParlamentar.classesDeConexao;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.NodeList;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
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

	public static ArrayList<String> adcionarSessaoNaTable(String data)
			throws SQLException, ClassNotFoundException, MalformedURLException, ServiceException {
		ArrayList<String> foi = new ArrayList<String>();
		ArrayList<Integer> lista = new ArrayList<Integer>();

		DeputadoDao conexaoDeputado = new DeputadoDao();

		lista = conexaoDeputado.getMatriculaDeputados();

		for(int i = 0; i<lista.size(); i++) {
			double porcentagem = (((double)(i)/(double)lista.size())*100.0);

			System.out.println(i+"- " + porcentagem+"%");
			Calendar hoje = new GregorianCalendar();

			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("dd/MM/yyyy");

			ListarPresencasParlamentarResponseListarPresencasParlamentarResult sessao;
			try {
				sessao = ConexaoComWsSessoesEReunioes.receberElementPresenca
						(ConexaoComWsSessoesEReunioes.obterConexao(),
								data, df.format(hoje.getTime()), Integer.toString(lista.get(i)));

				NodeList dias = sessao.get_any()[0].getElementsByTagName("dia");

				for(int j = 0; j<dias.getLength(); j++) {

					MessageElement diasTemp = (MessageElement) dias.item(j);				
					NodeList descricaoTemp = diasTemp.getElementsByTagName("descricao");
					NodeList presencaTemp = diasTemp.getElementsByTagName("frequencia");


					for(int k = 0; k<descricaoTemp.getLength(); k++) {
						MessageElement descricaoText = (MessageElement) descricaoTemp.item(k);
						NodeList nomeTemp = sessao.get_any()[0].getElementsByTagName("nomeParlamentar");
						MessageElement nomeText = (MessageElement) nomeTemp.item(0);
						MessageElement presencaText = (MessageElement) presencaTemp.item(k);

						if(presencaText.getFirstChild().getNodeValue().equals("Presença"))
						{


							foi.add(descricaoText.getFirstChild().getNodeValue());
							foi.add(nomeText.getFirstChild().getNodeValue());
						}
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return foi;
	}

	public static ArrayList<String> adcionarDataNaTable(String data, String matricula) 
			throws SQLException, MalformedURLException, ServiceException {			 
		ArrayList<String> passar = new ArrayList<String>();

		ListarPresencasParlamentarResponseListarPresencasParlamentarResult sessao;

		Calendar hoje = new GregorianCalendar();

		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("dd/MM/yyyy");

		sessao = ConexaoComWsSessoesEReunioes.receberElementPresenca
				(ConexaoComWsSessoesEReunioes.obterConexao(),
						data, df.format(hoje.getTime()), matricula);

		NodeList dias = sessao.get_any()[0].getElementsByTagName("dia");

		for(int i= 0; i<dias.getLength(); i++) {				
			MessageElement diaTemp = (MessageElement) dias.item(i);

			NodeList dataTemp = diaTemp.getElementsByTagName("data");
			NodeList descricaoTemp = diaTemp.getElementsByTagName("descricao");

			MessageElement dataText = (MessageElement) dataTemp.item(0);

			for(int j = 0; j<descricaoTemp.getLength(); j++) {
				MessageElement descricaoText = (MessageElement) descricaoTemp.item(j);

				System.out.println(dataText.getFirstChild().getNodeValue());
				passar.add(dataText.getFirstChild().getNodeValue());
				passar.add(descricaoText.getFirstChild().getNodeValue());
			}
		}			
		return passar;
	}
}
