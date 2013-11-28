package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class PartidoDao extends ConnectionFactory {

	private final int UM = 1;
	private final int DOIS = 2;

	public PartidoDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	public void adicionarPartidoNaTable (ArrayList<Partidos> lista)
			throws SQLException {
		String sql = "insert into partido(sigla, nomePartido)values(?, ?)";

		PreparedStatement stmt = getConexao().prepareStatement(sql);

		for(int i = 0; i<lista.size(); i++) {
			stmt.setString(UM, lista.get(i).getSigla());
			stmt.setString(DOIS, lista.get(i).getNomePartido());

			stmt.execute();
		}

		stmt.close();
	}
	
	public ArrayList<ArrayList<String>> pegarPartidos() throws SQLException {
		
		ArrayList<ArrayList<String>> listaPassar = new ArrayList<ArrayList<String>>();
		
		String sql = "Select * from partido";
		
		PreparedStatement stmt = getConexao().prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			ArrayList<String> adicionar = new ArrayList<String>();
			adicionar.add(rs.getString("sigla"));
			adicionar.add(rs.getString("nomePartido"));
			listaPassar.add(adicionar);
		}
		
		return listaPassar;
	}
	
	
}
