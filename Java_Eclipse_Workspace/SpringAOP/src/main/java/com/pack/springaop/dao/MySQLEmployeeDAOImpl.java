package com.pack.springaop.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.pack.springaop.model.Employee;

@Repository (value = "mysqlemployeeDAO")
public class MySQLEmployeeDAOImpl implements EmployeeDAO{
	
    private static List<Employee> employees = new ArrayList<Employee>();

    public Employee save(Employee employee) {
        employees.add(employee);
        System.out.println("MySQL DAO save method");
        return employee;
    }

}
