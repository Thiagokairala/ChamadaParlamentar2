package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	private static Connection conexao;
	private static final String URL = "jdbc:mysql://mysql-chamadaparlamentar"
			+ ".jelastic.websolute.net.br/Chamada";
	private static final String USER = "Chamada";
	private static final String SENHA = "77jU8jaUbWAKayVC";

	public ConnectionFactory() {

	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if(ConnectionFactory.conexao == null) {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection
					(URL, USER, SENHA);
		}
		return ConnectionFactory.conexao;
	}

	public static Connection getConexao() {
		return conexao;
	}	
}
