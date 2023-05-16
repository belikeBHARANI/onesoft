package com.onesoft.collections;

public class Employee {
	int id;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return getSalary;
	}
	public void setSalary(int salary) {
		this.getSalary = salary;
	}
	private String name;
	private int age;
	private char gender;
	private int getSalary;
	
	public Employee(int id,String name,int age,char gender,int salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.getSalary=salary;			
	}
	public String toString() {
		return "ID - "+id+", Name - "+name+", Age - "+age+", Gender - "+gender+", Salary - "+getSalary;
	}


}
