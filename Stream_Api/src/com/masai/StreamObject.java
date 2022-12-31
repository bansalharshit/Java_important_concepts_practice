package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	// Stream Api-collection process
	// collection/ group of objects
	public static void main(String[] args) {
		// how to create empty stream
		Stream<Object> st=Stream.empty();
//		
		// use can use array,object,collection
		String names[]= {"Durgesh","Uttam","Ankit","Divya"};
		Stream<String> stream1=Stream.of(names);
		stream1.forEach(e->{
			System.out.println(e);
		});
		System.out.println("***********************");
		// Builder pattern
		
		Stream<Object> streamBuilder=Stream.builder().build();
		
		// Arrays.stream
		IntStream str= Arrays.stream(new int[] {10,20,30,40,50,60});
		str.forEach(e->{
			System.out.println(e);
		});
		System.out.println("***********************");
		// List,Set
		List<Integer> list2=new ArrayList<>();
		list2.add(10);
		list2.add(11);
		list2.add(13);
		list2.add(12);
//		System.out.println("list2 "+list2);
		Stream<Integer> stream2=list2.stream();
		stream2.forEach(e->System.out.println(e));
		System.out.println("************************");
//		stream2.filter(i->i%2==0).forEach(e->System.out.println(e));
		
	}
}
