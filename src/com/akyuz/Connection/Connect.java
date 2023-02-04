package com.akyuz.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

   

	public static void main(String[] args) {
		
		 String kullaniciadi = "root";
	     String parola = "Adana01010101";
	     String dbismi = "demo";
	     String host ="localhost";
	     int port = 3306;
		
		String url = "jdbc:mysql://"+host+":"+port+"/"+dbismi;

		try {
			Class.forName("com.mysql.jdbc.Driver");		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection(url,kullaniciadi,parola);
			System.out.println("Connection DONE!!!");
		} catch (SQLException e) {
			System.out.println("Connection Fail!!");
			e.printStackTrace();
		}

	}

}
