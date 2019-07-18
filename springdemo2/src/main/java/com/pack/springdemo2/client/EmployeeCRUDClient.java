package com.pack.springdemo2.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.springdemo2.model.Employee;
import com.pack.springdemo2.service.EmployeeService;

public class EmployeeCRUDClient {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeService employeeService =  context.getBean("employeeService", EmployeeService.class);
		
		Employee sheldon = new Employee(23, "Sheldon");
		employeeService.saveEmployee(sheldon);
		
 	}
}
