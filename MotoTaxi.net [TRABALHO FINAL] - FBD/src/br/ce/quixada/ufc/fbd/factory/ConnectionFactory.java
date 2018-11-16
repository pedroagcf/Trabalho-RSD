package br.ce.quixada.ufc.fbd.factory;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private final String url = "jdbc:postgresql://localhost:5432/MotoTaxi.net";
	private final String user = "postgres";
	private final String password = "12345678";

	public Connection getConnection() {
		try {
			
			System.out.println("estabelendo conexao!");
			return DriverManager.getConnection(url, user, password);
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
