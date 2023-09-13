package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Groupingdemo1 {
	public static void main(String[] args) {
		//How to find count of individual elements in the given array

		List<Integer> list = Arrays.asList(1,1,1,3,3,3,1,4,5,6,7,3,3,4,4,5,5,1);
		Map<Integer, Long> count = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting() ));
		System.out.println(count);	
	}

}
