package com.pack.jdbc;

import java.sql.*;


public class JdbcDemo {
	public static void main(String [] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbctesting";
			String username = "root";
			Connection connection = DriverManager.getConnection(url, username, "Sapient123");
		
			Statement statement = connection.createStatement();
			
//			statement.executeUpdate("insert into EMP (NAME, AGE) values ('Penny', 32)");
			statement.executeUpdate("update EMP set AGE = AGE+1");
//			statement.executeUpdate("delete from EMP where AGE<25");
			
//			ResultSet resultSet = statement.executeQuery("select * from EMP");
//			while(resultSet.next()) {
//				System.out.println("Name : "+resultSet.getString(1));
//				System.out.println("Age : "+resultSet.getString(2));
//				System.out.println();
//			}
//			resultSet.close();
			
			statement.close();
			connection.close();
			
		}
		catch (Exception e) {
			System.out.println("Error Occured : "+e);
		}
	}
}
