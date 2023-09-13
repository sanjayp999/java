package com.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Datedemo {
	public static void main(String[] args) throws ParseException {
		/*
		 * Date d= new Date(); System.out.println(d);
		 * 
		 * //converting date object format to string obj format SimpleDateFormat a= new
		 * SimpleDateFormat("MM/dd/YYYY"); String format = a.format(d);
		 * System.out.println(format);
		 * 
		 * 
		 * //Converting string to daTe SimpleDateFormat s= new
		 * SimpleDateFormat("yyyy-MM-dd"); Date parse = s.parse("2023-08-26");
		 * System.out.println(parse);
		 */

		LocalDate date= LocalDate.now();
		System.out.println(date);
		//by using reference of LocalDate we can get any day,month,year
		int dayOfMonth = date.getDayOfMonth();
		System.out.println(dayOfMonth);

		//customizing our own date
		LocalDate of = LocalDate.of(1997, 07, 25);
		System.out.println(of);

		//for time
		LocalTime Time = LocalTime.now();
		System.out.println(Time);

		//by using reference of LocalTime we can get any hr,min,seconds
		int hour = Time.getHour();
		System.out.println(hour);

	}

}
