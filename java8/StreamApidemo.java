package com.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApidemo {
	public static void main(String[] args) {
		/*
		 * Stream<Integer> a=Stream.of(1,2,3,4,5); //Stream.of method //for printing we
		 * use for each method a.forEach((i)->System.out.println(i)); //for each and
		 * method reference a.forEach(System.out::println);
		 */
		//stream() method
		ArrayList<String>b=new ArrayList<>();
		b.add("jhon");
		b.add("alex");
		b.add("larry");

		Stream<String> c= b.stream();
		//using for each
		//c.forEach((i)->System.out.println(i));
		//using for each and method reference
		c.forEach(System.out::println);		
	}
}
