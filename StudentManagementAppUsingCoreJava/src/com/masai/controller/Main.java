package com.masai.controller;

import java.util.Scanner;

import com.masai.entity.Student;
import com.masai.exception.StudentNotFoundException;
import com.masai.logic.StudentServiceImpl;
import com.masai.service.StudentServices;

public class Main {


public static void main(String[] args) {
	while(true) {
		
	
	System.out.println("||-------Welcome to the Student Management App-----||");
	System.out.println("\n");
	System.out.println("Press 1 to add the Stuedent Details to the Application");
	System.out.println("Press 2 to delete the Stuedent Details from the Application");
	System.out.println("Press 3 to update the Stuedent Details from the Application");
	System.out.println("Press 4 to get the Stuedent Details from the Application");
	System.out.println("Press 5 to get all the Stuedent Details from the Application");
	
	Scanner sc=new Scanner(System.in);
	Student stu=new Student();
	while(true) {
		int choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Please Enter the Student Details");
			
//		StudentServices st=new StudentServiceImpl();
		StudentServiceImpl s1=new StudentServiceImpl();
		s1.addStudents(stu);
		System.out.println("Student Added Successfully!!");
		break;
		case 2:
			StudentServiceImpl s2=new StudentServiceImpl();
			try {
				s2.deleteStudent();
				System.out.println("Student Deleted Successfully!!");
			} catch (StudentNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			break;
		case 3:
			StudentServiceImpl s3=new StudentServiceImpl();
			try {
				s3.updateStudent();
				System.out.println("Student has been updated Successfully!!");
			} catch (StudentNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
			break;
		case 4:StudentServiceImpl s4=new StudentServiceImpl();
			try {
				s4.getStudentDetails();
			} catch (StudentNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
			break;
		case 5: System.out.println("List of Student Details");
		Student s5=new Student();
//		StudentServices st=new StudentServiceImpl();
		StudentServiceImpl ss5=new StudentServiceImpl();
			try {
				ss5.allStudentDetails();
			} catch (StudentNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			default:
			System.out.println("Please Enter the Valid Input");
		}
	}
	
	
	}
}
}
