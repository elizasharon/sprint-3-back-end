package com.pack.springmvc.service;

import java.util.List;

import com.pack.springmvc.model.Employee;

public interface EmployeeService {

	public void insertEmployee(Employee employee);
	public int updateEmployee (Employee employee);
	public int deleteEmployee (int id);
	public List<Employee> listAllEmployee();
	public Employee findByIdEmployee(int id);
}
