package com.masai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class StudentDao {
public static boolean insertStudent(Student st) {
	boolean flag=false;
	// jdbc code
	try {
		Connection con=CP.createC();
		String q="insert into students(sname,sphone,scity) values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setString(1, st.getStudentName());
		ps.setString(2, st.getStudentPhone());
		ps.setString(3, st.getStudentCity());
		
		ps.executeUpdate();
		flag=true;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return flag;
	
}

public static boolean deleteStudent(int userid) {
	// TODO Auto-generated method stub
	boolean flag=false;
	// jdbc code
	try {
		Connection con=CP.createC();
		String q="delete from students where sid=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, userid);
		
		ps.executeUpdate();
		flag=true;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return flag;
	
	
}

public static void showAllStudents() {
	
	// jdbc code
	try {
		Connection con=CP.createC();
		String q="select * from students";
		Statement st=con.createStatement();
		ResultSet set=st.executeQuery(q);
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString("scity");
			
			System.out.println("Id "+id);
			System.out.println("Name "+name);
			System.out.println("Phone "+phone);
			System.out.println("City "+city);
			System.out.println("******************");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
public static void updatestudent(int id ,String nameString,String numString,String cityString) {
	
	try 
	{
		Connection connection=CP.createC();
		String q="update students set sname=?,sphone=?,scity=? where sid=?";
		
		PreparedStatement pstmt=connection.prepareStatement(q);
		
		
		
		pstmt.setString(1, nameString);
		pstmt.setString(2, numString);
		pstmt.setString(3, cityString);
		pstmt.setInt(4, id);
		
		int x= pstmt.executeUpdate();
		
		if(x>0)
		{
			System.out.println(x+" updated Successfully.");
			
		}
		else {
			System.out.println("Not updated");
		}
		System.out.println("Thankxxxx");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	

}
}
