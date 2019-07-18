package com.pack.springaop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pack.springaop.model.Employee;

@Repository (value = "oracleemployeeDAO")
public class OracleEmployeeDAOImpl implements EmployeeDAO {

    private static List<Employee> employees = new ArrayList<Employee>();

	public Employee save(Employee employee) {

		employees.add(employee);
		System.out.println("Oracle DAO save method");
		return employee;
	}

}
