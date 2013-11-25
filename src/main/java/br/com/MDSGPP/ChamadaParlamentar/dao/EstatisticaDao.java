package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EstatisticaDao extends ConnectionFactory {

	public EstatisticaDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}


	public ArrayList<String> getEstatisticaDeputados(String nome) throws SQLException {
		String sql = "select * from sessao where deputadoPresente LIKE ?"; 

		ArrayList<String> lista = new ArrayList<String>();
		PreparedStatement stmt= ConnectionFactory.conexao.prepareStatement(sql);
		stmt.setString(1, nome);

		ResultSet rs = stmt.executeQuery(); 

		while(rs.next()) {
			lista.add(rs.getString("idSessoes"));
		}
		stmt.close();

		rs.close();
		return lista;
	}
}