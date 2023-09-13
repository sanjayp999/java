package com.java8;

import java.util.Arrays;
import java.util.List;

public class Intermediateoperation2 {
	public static void main(String[] args) {
		Vehicle a=new Vehicle("porsche",250,10);
		Vehicle b=new Vehicle("BMW",200,7);
		Vehicle c=new Vehicle("Mustang",30,13);

		//performing filter and map
		List<Vehicle> names = Arrays.asList(a,b,c);
		names.stream().filter(v->v.mileage>=10).map(p->p.name).forEach(System.out::println);

		System.out.println("*************************************");

		//anymatch()
		boolean anycar = names.stream().anyMatch(s->s.name.equals("porsche"));
		System.out.println("Is there any car named with porsche"+":"+anycar);

		System.out.println("*************************************");

		//perform all match()
		boolean d = names.stream().allMatch(s->s.name.equals("BMW"));
		System.out.println("Does our all cars are eqaul"+":"+d);

		System.out.println("*************************************");


		//perform nonematch()

		boolean noneMatch = names.stream().noneMatch(s->s.name.equals("AUDI"));
		System.out.println("we dont have Audii is it right"+":"+noneMatch);


	}

}
