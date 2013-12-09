package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class RankingDao extends ConnectionFactory {

	public RankingDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	public void adicionarRankingNaTable(Ranking ranking) throws SQLException {
		String sql =  "insert into ranking(nomeParlamentar, porcentagem)values (?, ?)";
		PreparedStatement stmt = ConnectionFactory.getConexao().prepareStatement(sql);

		for(int i = 0; i < ranking.getLista().size(); i++) {
			try {
				stmt.setString(1, ranking.getLista().get(i).getNome());
				stmt.setString(2, ranking.getLista().get(i).getPorcentagem());
				stmt.execute();
			} catch (MySQLIntegrityConstraintViolationException e) {
				System.out.println(ranking.getLista().get(i).getNome());
			}
		}
		for(int i = 0; i<ranking.getRemovidos().size(); i++) {
			stmt.setString(1, ranking.getRemovidos().get(i).getNome());
			stmt.setString(2, "semDados");
			stmt.execute();
		}

		stmt.close();
	}
	
	public Ranking retornaRanking () throws SQLException {
		Ranking ranking = new Ranking();
		ArrayList<Estatistica> removidos = new ArrayList<Estatistica>();
		ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
		
		String sql = "Select * from ranking";
		
		PreparedStatement stmt = ConnectionFactory.getConexao().prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Estatistica estatistica = new Estatistica();
			estatistica.setNome(rs.getString("nomeParlamentar"));
			if(rs.getString("porcentagem").equalsIgnoreCase("semDados")) {
				removidos.add(estatistica);
			} 
			else {
				estatistica.setPorcentagem(rs.getString("porcentagem"));
				lista.add(estatistica);
			}
		}
		
		ranking.setLista(lista);
		ranking.setRemovidos(removidos);
		return ranking;
	}


}
