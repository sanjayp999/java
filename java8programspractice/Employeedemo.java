package com.java8programspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employeedemo {
	public static void main(String[] args) {

		List<Employee> list1= new ArrayList<>();
		Employee e1= new Employee(1,"alex",24,"male","hr",2005,25000.0);
		Employee e2= new Employee(2,"stewart",25,"female","sales",2006,22000.0);
		Employee e3= new Employee(3,"jhon",27,"male","marketing",2007,30000.0);
		Employee e4= new Employee(4,"emma",31,"female","sales",2008,25000.0);
		Employee e5= new Employee(5,"ted",30,"male","admin",2009,10000.0);
		Employee e6= new Employee(6,"lizy",29,"female","hr",2012,15000.0);
		Employee e7= new Employee(7,"max",28,"male","development",2019,65000.0);
		Employee e8= new Employee(1,"peter",27,"male","development",2023,55000.0);
		Employee e9= new Employee(1,"rex",28,"male","admin",2015,25000.0);
		Employee e10= new Employee(1,"bradd",29,"male","sales",2020,25000.0);

		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);

		//1)how many males and female employees are there in your organization?

		Map<String, Long> map  = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(map);

		System.out.println("******************************************************");
		//2)write a java code to print all departments in the organization?
		list.stream().map(Employee::getDepartment).distinct().forEach(System.out::print);

		System.out.println("******************************************************");
		//3)write a java code to print average age of male and female employees?
		Map<String, Double> map2 = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(map2);

		System.out.println("******************************************************");
		//4)write a java code to print highest paid employee in the organization?
		Optional<Employee> optional = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(optional.get().name);

		System.out.println("******************************************************");

		//5) write a java code get all employees who joined after 2010?
		list.stream().filter(i->i.Yearofjoining>2010).map(Employee::getName).forEach(System.out::println);


		System.out.println("******************************************************");

		//6) Count the number of employees in each department?

		Map<String, Long> map3 = list.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.counting()));
		System.out.println(map3);

		System.out.println("******************************************************");

		//7) What is the average salary of each department?
		Map<String, Double> map4 = list.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map4);

		System.out.println("******************************************************");

		//8) Get the details of youngest male employee in organization?

		Optional<Employee> optional2 = list.stream().filter(i->i.gender=="male").collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		System.out.println(optional2.get().name);


		System.out.println("******************************************************");

		//9) Who has the most working experience in the organization?
		Optional<Employee> optional3 = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearofjoining)));

		System.out.println(optional3.get().name);

		System.out.println("******************************************************");

		//10)How many male and female employees are there in the sales team?
		Map<String, Long> map6 = list.stream().filter(e->e.getDepartment()=="sales").collect(Collectors.groupingBy((Employee::getGender),Collectors.counting()));
		System.out.println(map6);

		System.out.println("******************************************************");

		//11)what is the average salary of male and female employees?
		Map<String, Double> map7 = list.stream().collect(Collectors.groupingBy((Employee::getGender),Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map7);

		System.out.println("******************************************************");
		//12)List down the names of all employees in each department
		//list.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.mapping(Employee::getName),Collectors.toList()));
				         
							             
System.out.println("******************************************************");

		//13) What is the average salary and total salary of the whole organization?

		DoubleSummaryStatistics Avg = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(	"Average salary"+ Avg.getAverage());
		System.out.println("sum of whole salary"+Avg.getSum());
		System.out.println("******************************************************");

		//14) Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.

	
		List<String> collect = list.stream().filter(i->i.getAge()<=25).map(i->i.getName()).collect(Collectors.toList());
		
		System.out.println(collect);
		
		System.out.println("_____________________________________________________________--");
list.stream().filter(i->i.getAge()>25).map(i->i.getName()).forEach(System.out::println);
		System.out.println("******************************************************");

		//15) Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Optional<Employee> oldest = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		System.out.println(oldest.get().name);

		System.out.println("******************************************************");
		//16)who is the second highest salary employee
		list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).forEach(System.out::print);
	}
}