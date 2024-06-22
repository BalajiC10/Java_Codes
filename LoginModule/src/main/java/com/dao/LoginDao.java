package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
String url = "jdbc:mysql://localhost:3306/login";
String username = "root";
String password ="root";
String sql = "select * from login where name=? and pass=?";

		public boolean check(String uname, String pass) {
			
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Connection con =DriverManager.getConnection(url,username,password);
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, uname);
					ps.setString(2, pass);
					ResultSet rs = ps.executeQuery();
					
					while(rs.next()) {
						return true;
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			
			
			
			
			
			return false;
			
		}
}
