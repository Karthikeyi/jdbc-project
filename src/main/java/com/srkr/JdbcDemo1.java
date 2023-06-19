package com.srkr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//setting connection with sql
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		
		String query="SELECT * FROM student";
		Statement statement=con.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		while(resultSet.next())
		{
			int stdid=resultSet.getInt(1);
			String s_fname=resultSet.getString(2);
			String s_lname=resultSet.getString(3);
			String email=resultSet.getString(4);
			
			System.out.println(stdid +" "+s_fname+" "+s_lname+" "+email);
		}
}
}
