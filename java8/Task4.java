package com.java8;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {

		int arr[]= {1,-5,3,14,-2,17,19};

		int secondMin = Arrays.stream(arr).sorted().skip(1).findFirst().getAsInt();

		int secondMax = Arrays.stream(arr).sorted().skip(arr.length - 2).findFirst().getAsInt();

		int sum = secondMin+secondMax;

		System.out.println("secondMin:"+secondMin+"\nsecondMax:"+secondMax+"\nsum :"+sum);
		
	}
}
