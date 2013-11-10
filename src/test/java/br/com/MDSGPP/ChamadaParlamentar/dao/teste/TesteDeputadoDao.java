package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.dao.ConnectionFactory;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public class TesteDeputadoDao {
	
	DeputadoDao deputadoDao;
	
	Deputados deputado1;
	Deputados deputado2;
	
	@Before
	public void setUp() throws ClassNotFoundException {
		deputadoDao = new DeputadoDao();
	}
	
	public ArrayList<Deputados> criaLista() {
		ArrayList<Deputados> lista = new ArrayList<Deputados>();
		
		deputado1 = new Deputados();
		deputado1.setAnexo("0");
		deputado1.setEmail("teste");
		deputado1.setIdDoParlamentar(123);
		deputado1.setIdeCadastro(1234);
		deputado1.setMatricula(123);
		deputado1.setNomeCivilDoParlamentar("nomeDeTeste");
		deputado1.setNomeDeTratamentoDoParlamentar("NomeDeTratamentoTeste");
		deputado1.setNumeroDoGabinete("123");
		deputado1.setPartido("partidoTeste");
		deputado1.setSexo("teste");
		deputado1.setTelefone("12");
		deputado1.setUf("Df");
		
		deputado2 = new Deputados();
		
		deputado2.setAnexo("0");
		deputado2.setEmail("teste2");
		deputado2.setIdDoParlamentar(000);
		deputado2.setIdeCadastro(0000);
		deputado2.setMatricula(0000);
		deputado2.setNomeCivilDoParlamentar("nomeDeTeste2");
		deputado2.setNomeDeTratamentoDoParlamentar("NomeDeTratamentoTeste2");
		deputado2.setNumeroDoGabinete("00000000");
		deputado2.setPartido("partidoTeste2");
		deputado2.setSexo("teste2");
		deputado2.setTelefone("00000000");
		deputado2.setUf("Df");
		
		lista.add(deputado1);
		lista.add(deputado2);
		
		return lista;
	}
	
	@Test
	public void testDeputadoDao() {		
		assertNotNull(deputadoDao);
	}

	@Test
	public void testAdicionaDeputado() throws SQLException {		
		deputadoDao.adicionaDeputado(criaLista());
	}

	@Test
	public void testGetNomesDeputados() throws SQLException {
		ArrayList<String> lista = deputadoDao.getNomesDeputados();
		
		assertNotNull(lista);
		assertTrue(lista.size() == 513);
	}
	
	@After
	public void tearDown() throws ClassNotFoundException, SQLException {
		Connection conexao = new ConnectionFactory().getConnection();
		
		String sql = "Delete from deputado where nomeCivil = ?";
		
		java.sql.PreparedStatement stmt = conexao.prepareStatement(sql);
		
		ArrayList<Deputados> lista = criaLista();
		
		for(int i = 0; i<lista.size(); i++) {
			
			stmt.setString(1, lista.get(i).getNomeCivilDoParlamentar());
		
			stmt.execute();
		}
		stmt.close();		
	}
	
}
