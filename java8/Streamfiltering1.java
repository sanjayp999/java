package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamfiltering1 {
	public static void main(String[] args) {
		List<Integer>a=Arrays.asList(1,23,3,44,54,6);
		
		//now filter from stream with our condition 
		//add return type to each step
		Stream<Integer> stream = a.stream();
		Stream<Integer> filteredstream = stream.filter(i->i>20);		
		//using for each iterate and add return type
		filteredstream.forEach(i->System.out.println(i));
		
		//using method chaining bring all the methods
		//stream,filtered stream,foreach statement in one line
		a.stream().filter(i->i>20).forEach(i->System.out.println(i));		
		
		
		
	}

}
