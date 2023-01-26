package com.masai;

public class Main {
	public static void main(String[] args) {
	int a=10;
	int b=10;
	if((++a==10) | (++b==10)) {
		System.out.println(a+" "+b);
	}else {
		System.out.println("Something Went Wrong");
	}
	}
	
}

