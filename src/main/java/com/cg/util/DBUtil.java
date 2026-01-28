package com.cg.util;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBUtil {
		private final static String url="jdbc:mysql://localhost:3306/emp_db";
		private final static String user="root";
		private final static String password="AjayKumar";
		
		public static Connection getConnection() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password);
			return conn;
		}

	}


