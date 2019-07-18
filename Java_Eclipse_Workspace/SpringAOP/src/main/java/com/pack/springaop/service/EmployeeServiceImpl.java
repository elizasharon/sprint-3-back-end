package com.pack.springaop.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pack.springaop.dao.EmployeeDAO;
import com.pack.springaop.model.Employee;

@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Qualifier("mysqlemployeeDAO")
	private EmployeeDAO employeeDAO;

	public EmployeeServiceImpl(@Qualifier("mysqlemployeeDAO") EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public Employee saveEmployee(Employee employee) {
		System.out.println("Employee Service save method");
		return employeeDAO.save(employee);
	}

}
