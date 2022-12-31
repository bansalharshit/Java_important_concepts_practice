package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
static Connection con;
public static Connection createC() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/student_management";
		
		try {
			con=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
	return con;
	
}
}
