package com.pack.springdemo2.dao;

import java.util.ArrayList;

import com.pack.springdemo2.model.Employee;

public interface EmployeeDAO {

	public Employee save(Employee employee);

	public ArrayList<Employee> fetchAllEmployee();

	public Employee findById(long id);

	public void deleteEmployee(long id);
}
