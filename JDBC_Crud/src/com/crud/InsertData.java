package com.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class InsertData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded succes");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSl=false","root","root");
	System.out.println("Connection succes");
	
	String sql = "insert into student (stid, first_name, last_name, dept) values(?, ?,?,?) ";
	
	PreparedStatement ps = con.prepareCall(sql);
	
	ps.setInt(1, 500);
	ps.setString(2, "Vijay");
	ps.setString(3, "Jalgi");
	ps.setString(4, "Cloud");
	
	ps.executeUpdate();
	System.out.println("Data inserted successfully...");
	ps.close();
	
	
}

}
