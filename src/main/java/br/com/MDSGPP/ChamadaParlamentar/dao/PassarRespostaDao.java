package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PassarRespostaDao {

	Connection conexao;
	public PassarRespostaDao() throws ClassNotFoundException {
		this.conexao = new ConnectionFactory().getConnection();
	}

	public void popularTabela(ArrayList<String> lista) throws SQLException {
		String sql1 = "truncate table passarResposta";
		PreparedStatement stmt1 = conexao.prepareStatement(sql1);
		stmt1.execute();
		stmt1.close();

		String sql2 = "insert into passarResposta (idpassarResposta) values (?)";

		PreparedStatement stmt2 = conexao.prepareStatement(sql2);

		for(int i = 0; i<lista.size(); i++) {
			stmt2.setString(1, lista.get(i));
			stmt2.execute();
		}
		stmt2.close();
	}

}