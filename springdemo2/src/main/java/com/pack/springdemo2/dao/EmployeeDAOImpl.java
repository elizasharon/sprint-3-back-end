package com.pack.springdemo2.dao;

import java.util.ArrayList;

import com.pack.springdemo2.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	

	public Employee save(Employee employee) {
		employeeList.add(employee);
		System.out.println("Inside saveEmployee in employeeDAO");
		System.out.println("Saved : "+ employee.getName());
		return employee;
	}

	public ArrayList<Employee> fetchAllEmployee() {
		System.out.println("Inside fetchAllEmployee in employeeDAO");
		return null;
	}

	public Employee findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		
	}

}
