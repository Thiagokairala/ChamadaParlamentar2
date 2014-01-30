package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	private static Connection conexao;

	public ConnectionFactory() {

	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if(ConnectionFactory.conexao == null) {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionFactory.conexao = DriverManager.getConnection
					("jdbc:mysql://localhost/chamada", "root", "12345");
		}
		return ConnectionFactory.conexao;
	}

	public static Connection getConexao() {
		return conexao;
	}	
}
