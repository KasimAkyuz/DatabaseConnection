package com.akyuz.dbwriting;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DbWriting {

	public static void main(String[] args) throws SQLException {
		Connecting conn = new Connecting();
		Connection connection = conn.connecting();
		String sqlQuery= "Insert into products(productName,productPrice) values (?,?)";
		
		PreparedStatement statement = connection.prepareStatement(sqlQuery);
		statement.setString(1, "Laptop");
		statement.setInt(2, 1500);
		statement.executeUpdate();
		
		
	}

}
