package com.pack.springdemo2.model;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

public class Employee {
	
	private  long id;
	private  String name;
	private int age;
	private double salary;
	
	public Employee( long id, String name) {
		this.name = name;
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


}
