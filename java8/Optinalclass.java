package com.java8;
import java.util.Optional;
public class Optinalclass {
	public static void main(String[] args) {
		
	
	Optionaldemo2 d= new Optionaldemo2(123,"sanjay",null);
	String email = d.getEmail();//for return type
	System.out.println(email);
	/*
	 * //if there is never null then go for of method -100%value is present
	 * Optional<String> optionamail = Optional.of(d.getEmail());
	 * System.out.println(optionamail);
	 * 
	 * //if object is null or not null 50-50 chance //if we null that object it does
	 * not throw any exception and shows empty Optional<String>email2 =
	 * Optional.ofNullable(d.getEmail()); System.out.println(email2);
	 */
      
     //if there is 50-50 chances of of object 
     //To return our own statement
     Optional<String> email3 = Optional.ofNullable(d.getEmail());
     if(email3.isPresent()) {
     System.out.println(email3.isPresent());
	}
	else {
		System.out.println("no email found");
	}
     //using supplier interface we can get it
System.out.println(email3.orElseGet(()->"no data found"));
	
	//throws illegalArgumentexception
System.out.println(email3.orElseThrow(()-> new IllegalArgumentException("no data found")));

//use map and we also use uppercase,hashcode,lowercase or if not found we can write our own implementation 
System.out.println(email3.map(String :: toUpperCase).orElseGet(()->"no data found plz check.."));
	
	}
}
