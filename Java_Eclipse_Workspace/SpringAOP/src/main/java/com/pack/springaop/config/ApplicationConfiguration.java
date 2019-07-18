package com.pack.springaop.config;

import org.springframework.context.annotation.Bean;

import com.pack.springaop.dao.MySQLEmployeeDAOImpl;
import com.pack.springaop.dao.OracleEmployeeDAOImpl;
import com.pack.springaop.service.EmployeeService;
import com.pack.springaop.service.EmployeeServiceImpl;

public class ApplicationConfiguration {
	
	@Bean
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl(new MySQLEmployeeDAOImpl());
	}
	
}
