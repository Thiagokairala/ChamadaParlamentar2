package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.net.MalformedURLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.NodeList;

import br.com.MDSGPP.ChamadaParlamentar.classesDeConexao.ConexaoComWsSessoesEReunioes;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;
import br.gov.camara.www.SitCamaraWS.SessoesReunioes.ListarPresencasParlamentarResponseListarPresencasParlamentarResult;

public class SessoesEReunioesDao extends ConnectionFactory {

	public SessoesEReunioesDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	public void adcionarDataNaTable(String data, String matricula) 
			throws SQLException, MalformedURLException, ServiceException {			     
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

				String sql = "insert into datas(datas, sessao) values(?, ?)";

				PreparedStatement stmt;

				stmt = conexao.prepareStatement(sql);
				System.out.println(dataText.getFirstChild().getNodeValue());
				stmt.setString(1, dataText.getFirstChild().getNodeValue());
				stmt.setString(2, descricaoText.getFirstChild().getNodeValue());

				stmt.execute();
				stmt.close();
			}
		}			
	}

	public void adcionarSessaoNaTable(String data)
			throws SQLException, ClassNotFoundException, MalformedURLException, ServiceException {
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
							String sql = "insert into sessao(idSessoes, deputadoPresente)values(?,?)";
							PreparedStatement stmt = conexao.prepareStatement(sql);

							stmt.setString(1, descricaoText.getFirstChild().getNodeValue());
							stmt.setString(2, nomeText.getFirstChild().getNodeValue());

							stmt.execute();
							stmt.close();
						}

					}
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public int passarNumeroDeSessoes() throws SQLException
	{
		String sql = "select * from datas";

		PreparedStatement stmt= ConnectionFactory.conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery(); 
		int i = 0;

		while(rs.next())
		{
			i++;
		}

		return i;		
	}
}

