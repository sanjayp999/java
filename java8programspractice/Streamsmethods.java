package com.java8programspractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.HashMap;
import java.util.IntSummaryStatistics;

public class Streamsmethods {
	public static void main(String[] args) throws IOException {
		//1)print integers 1-10 using intStream?
		
		IntStream.range(0, 10).forEach(System.out::println);
		
		System.out.println("*********************************************");
		
		//2)print integers and use stream with skip method to skip 5 numbers?
		
		
		IntStream.range(0, 10).skip(5).forEach(System.out::println);
		
		
		System.out.println("*********************************************");

		//3)print 1-10 numbers use stream with sum and add them?
		int sum = IntStream.range(0, 10).sum();
		System.out.println(sum);
		System.out.println("*********************************************");

		//4)print using stream.of,sorted,find  first?
		
		Optional<String> findFirst = Stream.of("anil","ALberto","Apple").sorted().findFirst();
		if(findFirst.isPresent()) {
		System.out.println(findFirst.get());
		
		System.out.println("*********************************************");
            		
		//5)Stream from arraysort ,filter and print?
		
		String names[]= {"sanjay","stanley","sam","krish","rog","ben"};
			Arrays.stream(names)
			                   .filter(i->i.startsWith("s"))
			                   .sorted()
			                   .forEach(System.out::println);
			System.out.println("*********************************************");
           
			//6)Average of squares of int?
			int a[]= {1,2,3,4,5};
			 Arrays.stream(a).map(i->i*i).average().ifPresent(System.out::println);
		
				System.out.println("*********************************************");

				//7)Stream from list and map, filter and print?
				
				List<String> list = Arrays.asList("Sam","Albert","luca","Austin");
		        list.stream().map(String::toLowerCase).filter(i->i.startsWith("a")).forEach(System.out::println);
		        
				System.out.println("*********************************************");
 
				//8)Stream rows from a text file sort, filter,print?
		
				
				  Stream<String> stream = Files.lines(Paths.get("hero1.txt"));
				 stream.sorted().filter(i->i.length()>3).forEach(System.out::println);
				 stream.close();
		System.out.println("*********************************************");
             //9)Stream rows from a text file and save to list?
		
				
				   List<String> collect = Files.lines(Paths.get("hero1.txt")).filter(i->i.contains("bh")).collect(Collectors.toList());
				  System.out.println(collect);
				 
				System.out.println("*********************************************");

		//10)stream rows from csv file (file1.txt) and count?
				long count = Files.lines(Paths.get("number.txt")).map(c->c.split(",")).filter(i->i.length==4).count();
		        System.out.println(count);
		         
				System.out.println("*********************************************");
        //11)Stream rows from csv file and parse data from rows?
				Stream<String> lines1 = Files.lines(Paths.get("one.txt"));
				lines1.map(i->i.split(",")).filter(i->i.length>3).filter(i->Integer.parseInt(i[1])>5).forEach(k->System.out.println(k[0]+""+k[1]+""+k[2]));
		        lines1.close();
				System.out.println("*********************************************");

        //12)Stream rows from csv file and store  fields in a hashmap?
		/*
		 * Stream<String> lines2 = Files.lines(Paths.get("one.txt"));
		 * 
		 * Map<String, Integer> mapes=new HashMap<>();
		 * lines2.map(i->i.split(",")).filter(i->i.length==3).filter(i->Integer.parseInt
		 * (i[1])>5)
		 * 
		 * .collect(Collectors.toMap(x->x[0],x->Integer.parseInt(x[1]))).forEach(x->
		 * System.out.println(x[1]+""+x[2]+""+x[3])); lines2.close();
		 */
		System.out.println("*********************************************");
//13)reduce---sum
		
Integer reduce = Stream.of(1,2,3,4,5).reduce(1,(Integer c,Integer b)->c+b);		
		System.out.println(reduce);
		
		System.out.println("*********************************************");
//14)reduce---summarystatistics?
		IntSummaryStatistics summaryStatistics = IntStream.of(1,2,3,4,5).summaryStatistics();
		System.out.println(summaryStatistics);
		
		}

}}
