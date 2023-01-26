package com.masai.inheritancesuperdowncasting.problem5;

public class Main {
public static void main(String[] args) {
	Sbi s=new Sbi();
	ICIC i=new ICIC();
	AXIS a=new AXIS();
	System.out.println("Sbi Rate of Interest "+s.getRateOfInterest());
	System.out.println("ICICI Rate of interest "+i.getRateOfInterest());
	System.out.println("Axis bank rate of interest "+a.getRateOfInterest());
}
}
