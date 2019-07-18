package com.pack.springdemo2.service;

import java.util.ArrayList;

import com.pack.springdemo2.dao.EmployeeDAO;
import com.pack.springdemo2.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

		private EmployeeDAO employeeDAO;
		
		public EmployeeServiceImpl (EmployeeDAO employeeDAO) {
			this.employeeDAO = employeeDAO;
		}

		public Employee saveEmployee(Employee employee) {
			
			return employeeDAO.save(employee);
		}

		public ArrayList<Employee> fetchAllEmployee() {
			
			System.out.println("Inside fetchAllEmployee in employeeservice");
			return null;
		}

		public Employee findById(long id) {
			System.out.println("Inside findById in employeeservice");

			return null;
		}

		public void deleteEmployee(long id) {

			System.out.println("Inside deleteEmployee in employeeservice");

		}
}
