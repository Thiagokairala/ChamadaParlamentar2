package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	public ConnectionFactory() {
		
	}
	
	public Connection getConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");  
	    try {
	         return DriverManager.getConnection(
	 "jdbc:mysql://localhost/projetoMDS", "root", "12345");

	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
}
