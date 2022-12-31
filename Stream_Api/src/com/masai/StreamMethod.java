package com.masai;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
	public static void main(String[] args) {
		
	
// filter(predicate(interface),predicate is a boolean value function)
	//boolean value function;
	
	
	// map(function)-> to perform operations on given element 
	
	List<String> names=List.of("Aman","Ankit","Abhinav","Harshit");
List<String>nameList=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
System.out.println(nameList);

List<Integer> numbers=List.of(23,4,2,5,7,9);
List<Integer> squareofnumbers=numbers.stream().map(i->i*i).collect(Collectors.toList());
System.out.println(squareofnumbers);

names.stream().filter(e->e.startsWith("H")).forEach(e->{
System.out.println(e);
});

//sorted
numbers.stream().sorted().forEach(System.out::println);
Integer integer=numbers.stream().min((x,y)->x.compareTo(y)).get();
System.out.println("Minimum element from the above list "+integer);

Integer integer1=numbers.stream().max((x,y)->x.compareTo(y)).get();
System.out.println("Maximum element from the above list "+integer1);
}
}