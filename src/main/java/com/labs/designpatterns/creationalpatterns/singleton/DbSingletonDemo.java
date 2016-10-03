package com.labs.designpatterns.creationalpatterns.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

	public static void main(String[] args) {
		
		DbSingleton singleton = DbSingleton.getInstance();
		System.out.println(singleton);
		
		long startTime = 0;
		
		startTime = System.currentTimeMillis();
		Connection connection = singleton.getConnection();
		System.out.println(System.currentTimeMillis()-startTime);
		
		Statement statement;
		
		try {
			statement = connection.createStatement();
			statement.executeUpdate("CREATE TABLE USERS(ID INT, NAME VARCHAR(40))");
			System.out.println("USERS table created");
			System.out.println(statement.execute("SELECT * FROM USERS"));
			
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		startTime = System.currentTimeMillis();
		connection = singleton.getConnection();
		System.out.println(System.currentTimeMillis()-startTime);
				
		
	}
}
