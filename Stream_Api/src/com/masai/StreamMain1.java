package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
public static void main(String[] args) {
	// create a list and filter all even numbers from list
	
	List<Integer> list1=List.of(2,4,50,21,22,97);

	System.out.println("list1 "+list1);
//	System.out.println("Hello World");
	List<Integer> list2=new ArrayList<>();
	list2.add(10);
	list2.add(11);
	list2.add(13);
	list2.add(12);
	System.out.println("list2 "+list2);
	
	List<Integer> list3=Arrays.asList(25,36,28,14,63);
	System.out.println("list3 "+list3);
	System.out.println("*******************");
	// list1
	List<Integer> evenlist=new ArrayList<>();
	for(Integer i:list1) {
		if(i%2==0) {
			evenlist.add(i);
		}
	}
	System.out.println("evenlist "+evenlist);
	
	// using streamapi
//	Stream<Integer> stream=list1.stream();
//	List<Integer>newList=stream.filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println("stream "+newList);
	List<Integer> newList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(newList);
	
	System.out.println(list1.stream().filter(i-> i > 10).collect(Collectors.toList()));
}
}
