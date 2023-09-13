package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsDemo {
	public static void main(String[] args) {
		
		Carsdemo e1=new Carsdemo(1,"BMW",200.00);
		Carsdemo e2=new Carsdemo(2,"BENZ",250.00);
		Carsdemo e3=new Carsdemo(4,"Mc Laren",300.00);
		Carsdemo e4=new Carsdemo(4,"Buggati",450.00);
		Carsdemo e5=new Carsdemo(3,"Ferrari",450.00);

		List<Carsdemo> carslist = Arrays.asList(e1,e2,e3,e4,e5);
		//what are the names of the  cars with MAX speed
		Optional<Carsdemo> list1 = carslist.stream().collect(Collectors.minBy(Comparator.comparing(c->c.speed)));
		if(list1.isPresent()) {
			System.out.println(list1.get());
		}
		System.out.println("*********************************************************");
		//what are the names of the  cars with MAX speed
Optional<Carsdemo> list2 = carslist.stream().collect(Collectors.maxBy(Comparator.comparing(c->c.speed)));
		if(list2.isPresent()) {
			System.out.println(list2.get());
		}
		System.out.println("************************************************************");
		//what are the names of the  cars with AVG speed
Double averagespeed = carslist.stream().collect(Collectors.averagingDouble(c->c.speed));
		System.out.println(averagespeed);
		System.out.println("***********************************************************");
		//Grouping by car names
			Map<Object, List<Carsdemo>> map = carslist.stream().collect(Collectors.groupingBy(c->c.speed));
		System.out.println(map);
		
		
	}

}
