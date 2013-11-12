package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	protected static Connection conexao;
	
	public ConnectionFactory() {
		
	}
	
	public void getConnection() throws ClassNotFoundException, SQLException {
		if(ConnectionFactory.conexao == null) {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionFactory.conexao = DriverManager.getConnection
					("jdbc:mysql://localhost/projetoMDS", "root", "12345");
		}
		
	 }
}
