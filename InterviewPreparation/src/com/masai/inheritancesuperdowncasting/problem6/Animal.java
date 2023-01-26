package com.masai.inheritancesuperdowncasting.problem6;

public class Animal {
String color="white";


}
class Dog extends Animal{
	String color="Black";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	
}
