package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver loaded");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false","root","root");
	System.out.println("Connection set...");
	
	String sql = "update student set first_name=? where stid=?";
	
	PreparedStatement ps = con.prepareCall(sql);
	ps.setString(1, "Ram");
	ps.setInt(2, 100);
	ps.executeUpdate();
	ps.close();
	System.out.println("Updated successfully...");
	
}
}
