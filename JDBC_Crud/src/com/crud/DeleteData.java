package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver laoded...");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false","root","root");
	System.out.println("Connection succesfully...");
	
	String sql = "delete from student where stid=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, 500);
	ps.executeUpdate();
	ps.close();
	System.out.println("Delete successfully");
}
}
