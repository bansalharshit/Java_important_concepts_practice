package com.masai.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.entity.Student;
import com.masai.exception.StudentNotFoundException;
import com.masai.service.StudentServices;

public class StudentServiceImpl implements StudentServices {
Scanner sc=new Scanner(System.in);
static int index=0;
static Student[] students=new Student[10];
	@Override
	public void addStudents(Student student) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Student Addmission id");
		int id=sc.nextInt();
		System.out.println("Enter the Student Roll Number");
		int roll=sc.nextInt();
		System.out.println("Enter the Student Name");
		String name=sc.next();
		sc.nextLine();
		System.out.println("Enter the Student Class");
		String student_class=sc.nextLine();
		System.out.println("Enter the Student Section");
		String section=sc.nextLine();
		System.out.println("Enter the Student Address");
		String address=sc.nextLine();
	 Student st=new Student(id,roll,name,student_class,section,address);
	 students[index++]=st;
	 
	
	}

	public void deleteStudent() throws StudentNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Admisson No");
		int AddmissionNo=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<index;i++) {
			if(students[i].getAddmission_id()==AddmissionNo) {
				found=true;
				for(int j=i;j<index-1;j++) {
					students[j]=students[j+1];
				}
				index--;
				break;
			}		
		}
		if(!found) {
			System.out.println("Student with Given Addmission id "+AddmissionNo+" No Found ");
		}
	}

	@Override
	public void updateStudent() throws StudentNotFoundException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Addmission Id ");
		int AddmissionId=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<index;i++) {
			if(students[i].getAddmission_id()==AddmissionId) {
				System.out.println("Enter Name: ");
				String name=scan.next();
				
				System.out.println("Enter class : ");
				String sclass=scan.next();
				
				students[i].setStudent_name(name);
				students[i].setStudent_class(sclass);;
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Student with Addmission Number "+AddmissionId+"not found ");
		}
	}

	@Override
	public void getStudentDetails() throws StudentNotFoundException {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the Addmission No");
		 int addmissionId=scan.nextInt();
		 boolean flag=false;
		 for(int i=0;i<index;i++) {
			 if(students[i].getAddmission_id()==addmissionId) {
				 System.out.println("Student  Id "+students[i].getAddmission_id());
					System.out.println("Student  Roll Number "+students[i].getRoll_no());
					System.out.println("Student  Name "+students[i].getStudent_name());
					System.out.println("Student  class "+students[i].getStudent_class());
					System.out.println("Student  Section "+students[i].getStudent_section());
					System.out.println("Student  Address "+students[i].getStudent_address());
				 flag=true;
				 break;
			 }
		 }
		 if(!flag) {
			 System.out.println("Student with given Addmission Id "+addmissionId+" not found");
		 }

		
		
	}

	@Override
	public void allStudentDetails() throws StudentNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("All Students Details");
		System.out.println("--------------------------");
		for(int i=0;i<index;i++) {
			System.out.println("Student  Id "+students[i].getAddmission_id());
			System.out.println("Student  Roll Number "+students[i].getRoll_no());
			System.out.println("Student  Name "+students[i].getStudent_name());
			System.out.println("Student  class "+students[i].getStudent_class());
			System.out.println("Student  Section "+students[i].getStudent_section());
			System.out.println("Student  Address "+students[i].getStudent_address());
			System.out.println("-----------------------");
		}
		
		
	}
	
}
