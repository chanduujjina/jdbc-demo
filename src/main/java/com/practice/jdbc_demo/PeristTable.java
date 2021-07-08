package com.practice.jdbc_demo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class PeristTable {
	
	

	public static void main(String[] args) throws SQLException  {
		
		insertBulkData();
		

}
	  private static String generateInsert(int id, String name,String email) {

	        return "INSERT INTO student (id, name, email) " +
	                "VALUES (" + id + ",'" + name + "','" + email + "')";

	    }
	  
	  private static void insertBulkData() throws SQLException {
		  Connection connection = null;
		  Statement  stat = null;
		  
		  try {
			  connection = DBConnectivity.getConnection();
			   
			   stat  = connection.createStatement();
		  
		  for(int i=26;i<=50;i++) {
		//get the connection from  database
			
			
		
			String sql =generateInsert(i,"test"+i,"test@gmail.com");
		
		  
			
			stat.execute(sql);
		} 
		  }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   finally {
			 connection.close();
			  stat.close();
		   }
		   
		  }
	  
	}
