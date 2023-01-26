package com.masai.DateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo1 {
public static void main(String[] args) {
	
	// date is in the format YYYY-MM-dd
	LocalDate date=LocalDate.now();
	System.out.println(date);
	
	// time is in the format hh:mm:ss.ns
	LocalTime time=LocalTime.now();
	System.out.println(time);
	// Date time Format YYYY-MM-DD:hh:mm:ss.ns
	LocalDateTime ldt= LocalDateTime.now();
	System.out.println(ldt);
	
	boolean dob=(LocalDate.now()).isAfter(LocalDate.of(1999, 03, 06));
	System.out.println(dob);
}
}
