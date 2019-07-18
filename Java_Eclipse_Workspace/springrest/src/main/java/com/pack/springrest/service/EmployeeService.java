package com.pack.springrest.service;

import java.util.List;

import com.pack.springrest.model.Employee;

public interface EmployeeService {

	public int registerEmployee(Employee employee);
	public Employee loginEmployee(Employee employee);
	public List<Employee> listAllEmployees();
	public Employee findByIdEmployee(int id);
	public int deleteEmployee(int id);

}
