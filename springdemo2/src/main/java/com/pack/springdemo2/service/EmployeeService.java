package com.pack.springdemo2.service;

import java.util.ArrayList;

import com.pack.springdemo2.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public ArrayList<Employee> fetchAllEmployee();
	
	public Employee findById(long id);
	
	public void deleteEmployee(long id);
}
