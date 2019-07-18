package com.pack.jdbc;

import java.util.*;
import java.sql.*;


public class PreparedStatementsJdbc {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbctesting";
			String username = "root";
			Connection connection = DriverManager.getConnection(url, username, "Sapient123");
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into EMP values(?,?)");
			
			System.out.println("Enter your name : ");
			String name = sc.nextLine();
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, age);
			
			preparedStatement.execute();
			
			preparedStatement.close();
			connection.close();
			sc.close();

		} catch (Exception e) {
			System.out.println("Error Occured : " + e);
		}
	}

}
