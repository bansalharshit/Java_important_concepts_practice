package com.masai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
public static void main(String[] args) throws IOException {
	System.out.println("Welcome to Student Management App");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {
		System.out.println("Press 1 to Add Student");
		System.out.println("Press 2 to Delete Student");
		System.out.println("Press 3 to Display Student");
		System.out.println("Press 4 to update  Student details");
		System.out.println("Press 5 to Exist from the app");
		int c=Integer.parseInt(br.readLine());
		
		if(c==1) {
			// add student;
			System.out.println("Enter user name");
			String name=br.readLine();
			
			System.out.println("Enter user phone");
			String phone=br.readLine();
			
			System.out.println("Enter user city");
			String city=br.readLine();
			
			Student st=new Student(name,phone,city);
			boolean answer=StudentDao.insertStudent(st);
			if(answer) {
				System.out.println("Student is added successfully...");
			}else {
				System.out.println("Something went wrong, try again");
			}
			System.out.println(st);
			
		}else if(c==2) {
			// delete student
			System.out.println("Entr the Student Id to Delete the Student from the database");
			int userid=Integer.parseInt(br.readLine());
			
			boolean ans=StudentDao.deleteStudent(userid);
			if(ans) {
				System.out.println("Student has been Deleted Successfully!");
			}else {
				System.out.println("Student does not found with given id "+userid);
			}
		}else if(c==3) {
			// display student
			StudentDao.showAllStudents();
		}else if(c==4) {
			// update student detials
			System.out.println("Enter user student id");
			Integer id=Integer.parseInt(br.readLine());
			
			System.out.println("Enter user name");
			String name=br.readLine();
			
			System.out.println("Enter user phone");
			String phone=br.readLine();
			
			System.out.println("Enter user city");
			String city=br.readLine();;
			StudentDao.updatestudent(id, name, phone, city);
		}else if(c==5) {
			break;
		}
		else {
			System.out.println("choose a valid option");
		}
	}
	System.out.println("Thank! for using the application...");
}
}
