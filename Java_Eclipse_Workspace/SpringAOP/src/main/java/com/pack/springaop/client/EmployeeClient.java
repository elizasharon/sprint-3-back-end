package com.pack.springaop.client;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.springaop.config.ApplicationConfiguration;
import com.pack.springaop.model.Employee;
import com.pack.springaop.service.EmployeeService;

public class EmployeeClient {
	public static void main(String[] args) {
		
//		Method - 1
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//		EmployeeService employeeService = context.getBean(EmployeeService.class);
		
//		Method - 2
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

		
		Employee cooper = new Employee(21, "Cooper");
		employeeService.saveEmployee(cooper);
		
		
		((AbstractApplicationContext) context).close();
		
	}
}
