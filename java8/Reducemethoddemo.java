package com.java8;

import java.util.Arrays;

public class Reducemethoddemo {
	public static void main(String[] args) {
		int c[]= {1,2,3,4,5};
		
	int reduce = Arrays.stream(c).reduce(0, (e,v)->e+v);
	System.out.println(reduce);
	}

}
