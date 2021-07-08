package com.practice.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class CreateTable {
	
	private static String sql ="create table student(id int,name varchar(255),email varchar(255))";

	public static void main(String[] args) throws SQLException  {
		
		
		//get the connection from  database
		Connection connection =null;
		
		Statement stat =null;
		
	   try {
		 connection = DBConnectivity.getConnection();
		   
		   
		 stat  = connection.createStatement();
		
		stat.execute(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   finally {
		 connection.close();
		  stat.close();
	   }
	  
		

	}

}
