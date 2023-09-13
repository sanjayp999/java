package com.java8;

import java.util.Arrays;
import java.util.List;

public class Intermediatemethodsdemo {
	public static void main(String[] args) {
		//perform map
		List<String> vehicles = Arrays.asList("car","bike","jet");
		vehicles.stream().map(n->n.toUpperCase()).forEach(System.out::println);


		//performing map to int
		List<String> name = Arrays.asList("tree","sun","beach");
		name.stream().mapToInt(n->n.length()).forEach(System.out::println);

		//perform flatmap and map
		List<List<String>> join = Arrays.asList(name,vehicles);
		join.stream().flatMap(f->f.stream()).forEach(System.out::println);

		
		System.out.println("**********************************");
		
		//perform distinct()
		List<String> c = Arrays.asList("car","car","jet");
		c.stream().distinct().forEach(System.out::println);
		
		System.out.println("*********************************");

		//perform limit()
		List<String> v = Arrays.asList("car","bike","jet","aeroplane","rocket");
		v.stream().limit(2).forEach(System.out::println);
		
		
		System.out.println("********************************");
		//perform skip()
		List<String>s = Arrays.asList("car","bike","jet");
		s.stream().skip(1).forEach(System.out::println);

		
	}
		
	}


