package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver loaded success");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false","root","root");
	System.out.println("Connection succesfully");
	
	String sql = "select * from student";
	Statement ss= con.createStatement();
	
	ResultSet rs = ss.executeQuery(sql);
	
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
		System.out.println("______________");
	}
	
}
}
