package com.practice.jdbc_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class PersistantTable1 {

	public static void main(String[] args) {
		
		
		String sql ="insert into student values(?,?,?)";
		
		//get the connection
		Connection conn = null;
		
		PreparedStatement preparedStatement = null;
		
		 try {
			 conn =DBConnectivity.getConnection();
			 preparedStatement = conn.prepareStatement(sql);
			 preparedStatement.setInt(1, 2);
			 preparedStatement.setString(2, "Akshara");
			 preparedStatement.setString(3, "Akshara@gamil.com");
			 
			boolean value = preparedStatement.execute();
			System.out.println(value);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
