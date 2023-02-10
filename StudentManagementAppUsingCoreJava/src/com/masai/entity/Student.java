package com.masai.entity;

public class Student {
	
private int addmission_id;
private int roll_no;
private String student_name;
private String student_class;
private String student_section;
private String student_address;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int addmission_id, int roll_no, String student_name, String student_class, String student_section,
		String student_address) {
	super();
	this.addmission_id = addmission_id;
	this.roll_no = roll_no;
	this.student_name = student_name;
	this.student_class = student_class;
	this.student_section = student_section;
	this.student_address = student_address;
	
	
}
public int getAddmission_id() {
	return addmission_id;
}
public void setAddmission_id(int addmission_id) {
	this.addmission_id = addmission_id;
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}

public String getStudent_class() {
	return student_class;
}

public void setStudent_class(String student_class) {
	this.student_class = student_class;
}

public String getStudent_section() {
	return student_section;
}

public void setStudent_section(String student_section) {
	this.student_section = student_section;
}

public String getStudent_address() {
	return student_address;
}

public void setStudent_address(String student_address) {
	this.student_address = student_address;
}
@Override
public String toString() {
	return "Student [addmission_id=" + addmission_id + ", roll_no=" + roll_no + ", student_name=" + student_name
			+ ", student_class=" + student_class + ", student_section=" + student_section + ", student_address="
			+ student_address + "]";
}



}
