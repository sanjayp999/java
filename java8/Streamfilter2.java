package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamfilter2 {
	public static void main(String[] args) {


		List<String> a=Arrays.asList("justin","alex","alan","jhon","walker","wiz");

		/*
		 * Stream<String> stream = a.stream(); Stream<String> filterednames =
		 * stream.filter(i->i.startsWith("a"));
		 * filterednames.forEach(i->System.out.println(i));
		 */
		//filter using suffix of name
		a.stream().filter(i->i.startsWith("a")).forEach(i->System.out.println(i));

		//filter using prefix of name
		a.stream().filter(i->i.endsWith("z")).forEach(i->System.out.println(i));	
	}
}