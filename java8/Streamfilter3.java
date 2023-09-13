package com.java8;

import java.util.Arrays;
import java.util.List;

public class Streamfilter3 {

	public static void main(String[] args) {

		List<Integer> a=Arrays.asList(1,22,30,11,40,50,88);

		List<Integer> b=Arrays.asList(3000,10000,20000,15000,40000,100000);

		//filter even numbers
		a.stream().filter(i->i%2==0).forEach(i->System.out.println(i));

		//filter odd numbers
		a.stream().filter(i->i%2==1).forEach(i->System.out.println(i));

		//filter whose salary is more than 20,000
		b.stream().filter(i->i>20000).forEach(i->System.out.println(i));
	}
}
