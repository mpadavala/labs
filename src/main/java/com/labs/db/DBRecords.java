package com.labs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBRecords {

	private static final String dbString = "jdbc:oracle:thin:@localhost:1700/testschema";
	private static final String userName = "schemausername";
	private static final String password = "schemapassword";
	private static final String query = "select count(1) from dual";
	
	
	public static void main(String args[]) {
		System.out.println(new DBRecords().sendRecordCount());
		
	}

	public String sendRecordCount() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String date = "";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(dbString, userName, password);
			preparedStatement = connection.prepareStatement(query);
			ResultSet rs = null;
			
			
		
			
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				date = rs.getString(1);
				System.out.println(rs.getString(1));
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null){
					preparedStatement.close();
				}
				if (connection != null) {
				
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();				
			}
		}
		
		return "date :  " + date;
	}

}
