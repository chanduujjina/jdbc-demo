package com.practice.jdbc_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FetchResultsFromDB {
public static void main(String[] args) {

	String sql ="select * from student ";
	
	//get the connection
	Connection conn = null;
	
	PreparedStatement preparedStatement = null;
	
	 try {
		 conn =DBConnectivity.getConnection();
		 preparedStatement = conn.prepareStatement(sql);
			boolean value = preparedStatement.execute();
			
		 ResultSet resultset = preparedStatement.getResultSet();
		 List<Student> studentList = new ArrayList<>();
		 while(resultset.next()) {
			 Student student = new Student();
			 student.setId(resultset.getInt("id"));
			 student.setName(resultset.getString("name"));
			 student.setEmail(resultset.getString("email"));
			 studentList.add(student);
		 }
		 
		System.out.println(studentList);
		 
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
