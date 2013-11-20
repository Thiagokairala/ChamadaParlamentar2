package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.html5.ResultSet;

import br.com.MDSGPP.ChamadaParlamentar.dao.ConnectionFactory;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

import com.mysql.jdbc.PreparedStatement;

public class TesteSessoesEReunioesDao {
	SessoesEReunioesDao sessoesDao;

	@Before
	public void setUp() throws ClassNotFoundException, SQLException {
		sessoesDao = new SessoesEReunioesDao();
	}

	public static ArrayList<String> gerarListaDatas(){
		String string1 = "eulalala";
		String string2 = "tulalalas";
		String string3 = "elelalala";
		String string5 = "noslalalemos";
		String string6 = "voslalalais";
		String string7 = "eleslalalam";

		ArrayList<String> lista = new ArrayList<String>();
		lista.add(string1);
		lista.add(string2);
		lista.add(string3);
		lista.add(string5);
		lista.add(string6);
		lista.add(string7);

		return lista;
	}

	@Test
	public void testSessoesEReunioesDao() {
		assertNotNull(sessoesDao);
	}

	@Test
	public void testPassarNumeroDeSessoes() throws SQLException {
		assertTrue(sessoesDao.passarNumeroDeSessoes() > 0);
	}

	@Test
	public void testAdicionaDataNaTable() throws SQLException, MalformedURLException, 
	ServiceException, ClassNotFoundException {
		ArrayList<String> lista = gerarListaDatas();

		sessoesDao.adcionarDataNaTable(lista);

		for(int i = 0; i<lista.size();i=i+2) {
			String sql = "Select * from datas where datas LIKE ?";
			String nome = lista.get(i);
			String desc = lista.get(i+1);

			java.sql.PreparedStatement stmt = sessoesDao.getConnection().prepareStatement(sql);
			stmt.setString(1, nome);

			java.sql.ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				String data = rs.getString("datas");
				String descTest = rs.getString("sessao");

				assertTrue(descTest.equals(desc));
				assertTrue(data.equals(nome));
			}
			stmt.close();

		}
	}

	@Test
	public void testAdicionaSessaoNaTable() throws SQLException, MalformedURLException, 
	ServiceException, ClassNotFoundException {
		ArrayList<String> lista = gerarListaDatas();

		sessoesDao.adcionarSessaoNaTable(lista);

		for(int i = 0; i<lista.size();i=i+2) {
			String sql = "Select * from sessao where idSessoes LIKE ?";
			String nome = lista.get(i);
			String desc = lista.get(i+1);

			java.sql.PreparedStatement stmt = sessoesDao.getConnection().prepareStatement(sql);
			stmt.setString(1, nome);

			java.sql.ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				String data = rs.getString("idSessoes");
				String descTest = rs.getString("deputadoPresente");

				assertTrue(descTest.equals(desc));
				assertTrue(data.equals(nome));
			}
			stmt.close();

		}
	}

	@After
	public void tearDown() throws SQLException, ClassNotFoundException {
		Connection conexao = sessoesDao.getConnection();
		String sql = "Delete from datas where datas = ?";

		java.sql.PreparedStatement stmt = conexao.prepareStatement(sql);

		ArrayList<String> lista = gerarListaDatas();

		for(int i = 0; i<lista.size(); i=i+2) {

			stmt.setString(1, lista.get(i));

			stmt.execute();
		}
		stmt.close();		

		
		String sql2 = "Delete from sessao where idSessoes = ?";

		java.sql.PreparedStatement stmt2 = conexao.prepareStatement(sql);

		for(int i = 0; i<lista.size(); i=i+2) {

			stmt2.setString(1, lista.get(i));

			stmt2.execute();
		}
		stmt2.close();
	}

}
