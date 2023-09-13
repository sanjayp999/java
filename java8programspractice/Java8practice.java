package com.java8programspractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8practice {
	public static void main(String[] args) {
	/*	//max value
		List<Integer> list = Arrays.asList(10,2,34,4,5,5,6);
		Optional<Integer> max = list.stream().max(Integer::compare);
		System.out.println(max.get());
	
	//concat two strings
		String s1="hello";
		String s2="hi";
		
		List<String> list2 = Arrays.asList(s1,s2);
		List<String> list3 = Arrays.asList(s2);
		 Stream.concat(list2.stream(), list3.stream()).forEach(System.out::print);
	//perform cube and filter greater than 50?
		 
		 List<Integer> asList = Arrays.asList(2,3,4,5,6,6,3);
		 asList.stream().map(s->s*s*s).filter(a->a>50).forEach(System.out::println);
	
		 
		 //How to use map to convert object into Uppercase in Java 8?
		 List<String> names = Arrays.asList("sanjay","alex");
		 List<String> nameList = names.stream()
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());
System.out.println(nameList);*/
//How to count each element/word from the String ArrayList in Java8?
  List<String> list = Arrays.asList("acda","ccc","d");

Map<String, Long> collect = list.stream()
.collect(Collectors.groupingBy(Function.identity(),
		Collectors.counting()));
System.out.println(collect);


	
	}
		 
	}
	


