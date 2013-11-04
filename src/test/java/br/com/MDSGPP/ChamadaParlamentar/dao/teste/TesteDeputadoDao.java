package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.dao.ConnectionFactory;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public class TesteDeputadoDao {
	
	DeputadoDao deputadoDao;
	ArrayList<Deputados> deputados = new ArrayList<Deputados>();
	
	Deputados deputado1;
	Deputados deputado2;
	
	
	public void setUp() throws ClassNotFoundException {
		deputadoDao = new DeputadoDao();
		
		
	}
	
	public ArrayList<Deputados> criaLista() {
		ArrayList<Deputados> lista = new ArrayList<Deputados>();
		
		deputado1 = new Deputados();
		deputado1.setAnexo("123");
		deputado1.setEmail("teste");
		deputado1.setIdDoParlamentar(123);
		deputado1.setIdeCadastro(1234);
		deputado1.setMatricula(123);
		deputado1.setNomeCivilDoParlamentar("nomeDeTeste");
		deputado1.setNomeDeTratamentoDoParlamentar("NomeDeTratamentoTeste");
		deputado1.setNumeroDoGabinete("12345678");
		deputado1.setPartido("partidoTeste");
		deputado1.setSexo("teste");
		deputado1.setTelefone("12345678");
		deputado1.setUf("Df");
		
		deputado2 = new Deputados();
		
		deputado2.setAnexo("0000");
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
	
	//@Test
	public void testDeputadoDao() {		
		
	}

	@Test
	public void testAdicionaDeputado() throws SQLException {
		deputados = criaLista();
		
		System.out.println(deputados.size());
		
		deputadoDao.adicionaDeputado(deputados);
		
	}

	//@Test
	public void testGetNomesDeputados() {
		fail("Not yet implemented");
	}

	//@Test
	public void testGetMatriculaDeputados() {
		fail("Not yet implemented");
	}

	//@Test
	public void testReceberDadosDeputado() {
		fail("Not yet implemented");
	}
	
	@After
	public void tearDown() throws ClassNotFoundException, SQLException {
		Connection conexao = new ConnectionFactory().getConnection();
		
		String sql = "Delete from deputado where nomeCivil = ?";
		
		java.sql.PreparedStatement stmt = conexao.prepareStatement(sql);
		
		for(int i = 0; i<deputados.size(); i++) {
			
			stmt.setString(1, deputados.get(i).getNomeCivilDoParlamentar());
		
			stmt.execute();
		}
		stmt.close();		
	}
	
}
