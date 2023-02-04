package com.akyuz.dbReading;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbReading {

	public static void main(String[] args) throws SQLException {
		Connecting conn = new Connecting();
		Connection connection = conn.connecting();
		String sqlQuery = "select * from products";

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sqlQuery);
		
		while(resultSet.next()) {
			int productId=resultSet.getInt("productId");
			String productName=resultSet.getString("productName");
			int productPrice = resultSet.getInt("productPrice");
			
			System.out.println(+productId+" Product Name : "+productName+" Product Price : "+productPrice);
			
		}

	}

}
