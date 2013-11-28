package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import static org.junit.Assert.*;

import java.awt.List;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.dao.PartidoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class TestePartidoDao {
	PartidoDao partidoDao;
	
	@Before
	public void setUp() throws ClassNotFoundException, SQLException {
		partidoDao = new PartidoDao();
	}
	
	public ArrayList<Partidos> criaLista() {
		ArrayList<Partidos> lista = new ArrayList<Partidos>();
		
		for(int i = 0; i<10; i++) {
			Partidos partido = new Partidos();
			
			partido.setSigla("S"+i);
			partido.setNomePartido("nome" +i);
			lista.add(partido);
		}
		return lista;
	}
	
	@Test
	public void testPartidoDao()
			throws ClassNotFoundException, SQLException {
		assertNotNull(partidoDao.getConnection());
	}

	@Test
	public void testAdicionarPartidoNaTable()
			throws MalformedURLException, UnknownHostException, 
			SQLException, ServiceException, ClassNotFoundException {
	
		ArrayList<Partidos> partido = criaLista();
		ArrayList<Partidos> listaTeste = new ArrayList<Partidos>();
		
		partidoDao.adicionarPartidoNaTable(partido);
		partidoDao.adicionarPartidoNaTable(listaTeste);
		
		String sql = "Select * from partido";
		
		PreparedStatement stmt = partidoDao.getConnection().prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		
		ArrayList<String> siglas = new ArrayList<String>();
		
		while(rs.next()) {
			siglas.add(rs.getString("sigla"));
		}
		
		for(int i = 0; i<partido.size(); i++) {
			int j;
			for(j = 0; j<siglas.size(); j++) {
				if(partido.get(i).getSigla().equals(siglas.get(j))) {
					break;
				}
			}
			assertTrue(partido.get(i).getSigla().equals(siglas.get(j)));
		}
	}
	
	@Test
	public void testPegarPartidos() throws SQLException {
		ArrayList<ArrayList<String>> listaDeTeste = partidoDao.pegarPartidos();
		
		for(int i = 0; i<listaDeTeste.size(); i++) {
			for(int j = 0; j<listaDeTeste.get(i).size(); j++) {
				assertNotNull(listaDeTeste.get(i).get(j));
			}
		}
		
		assertTrue(listaDeTeste.size() >0);
	}
	
	@After
	public void tearDown() throws ClassNotFoundException, SQLException {
		ArrayList<Partidos> partido = criaLista();
		
		String sql = "Delete from partido where sigla = ?";
		
		PreparedStatement stmt = partidoDao.getConnection().prepareStatement(sql);
		
		
		for(int i = 0; i<partido.size(); i++) {
			stmt.setString(1, partido.get(i).getSigla());
			stmt.execute();
		}
		
		stmt.close();
	}

}
