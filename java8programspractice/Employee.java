package com.java8programspractice;

public class Employee {
  int id;
  String name;
  int age;
  String gender;
  String Department;
  int Yearofjoining;
  double salary;
public Employee(int id, String name, int age, String gender, String department, int yearofjoining, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	Department = department;
	Yearofjoining = yearofjoining;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public int getYearofjoining() {
	return Yearofjoining;
}
public void setYearofjoining(int yearofjoining) {
	Yearofjoining = yearofjoining;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return  id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", Department="
			+ Department + ", Yearofjoining=" + Yearofjoining + ", salary=" + salary + "]";
}

  

}
