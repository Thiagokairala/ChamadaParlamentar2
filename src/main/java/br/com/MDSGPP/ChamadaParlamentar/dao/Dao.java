package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao extends ConnectionFactory {
	
	public Dao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	public static void truncateTables() throws SQLException, ClassNotFoundException{
		Dao dao = new Dao();
		
		String sql1 = "truncate table datas";
		String sql3 = "truncate table sessao";
		
		PreparedStatement stmt1 = ConnectionFactory.getConexao().prepareStatement(sql1);
		PreparedStatement stmt3 = ConnectionFactory.getConexao().prepareStatement(sql3);
	
		stmt1.execute();
		stmt3.execute();
	}
}
