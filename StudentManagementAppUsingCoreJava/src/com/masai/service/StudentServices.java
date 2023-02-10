package com.masai.service;

import java.util.List;

import com.masai.entity.Student;

import com.masai.exception.StudentNotFoundException;

public interface StudentServices {

	public void addStudents(Student student);
	public void deleteStudent() throws StudentNotFoundException;
	public void updateStudent() throws StudentNotFoundException;
	public void getStudentDetails() throws StudentNotFoundException;
	public void allStudentDetails() throws StudentNotFoundException;
}
