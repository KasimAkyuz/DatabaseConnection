package com.akyuz.dbReading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecting {

	public Connection connecting() throws SQLException {

		String kullaniciadi = "root";
		String parola = "Adana01010101";
		String dbismi = "demo";
		String host = "localhost";
		int port = 3306;
		Connection conn;

		String url = "jdbc:mysql://" + host + ":" + port + "/" + dbismi;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		conn = DriverManager.getConnection(url, kullaniciadi, parola);
		System.out.println("Connection DONE!!!");

		return conn;

	}

}
