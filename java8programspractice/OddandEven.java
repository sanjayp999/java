package com.java8programspractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OddandEven {
	public static void main(String[] args) {
		//String []a= {"alex","alan","jhon","ted","sam"};
		int []b= {1,2,3,4,5,6,7,8};
		//print even and odd positions elements
		
		//List<String> list = Arrays.asList(a);
		//IntStream.range(0,list.size()).filter(p->p%2==1).mapToObj(i->list.get(i)).forEach(i->System.out.println(i));
	      Arrays.asList(b);
		IntStream.of(b).filter(a->a%2==0).forEach(System.out::print);
		
		
		
		
	}

}
