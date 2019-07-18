package com.pack.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pack.springrest.model.Employee;
import com.pack.springrest.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
    @GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> displayAllEmployees(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Sheldon Cooper", "aaa", "email", 46, 45000, "admin"));
        //model.addAttribute("empList", empList);
        return empList;
    }

	

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("employee", new Employee());
		return "register";
	}

	
	@PostMapping(value = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseStatus(HttpStatus.CREATED)
	public void registerEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
        System.out.println("Came inside the post method of register employee ....");
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginEmployee(HttpServletRequest request, HttpServletResponse response, Model model) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		Employee employee = new Employee();
		employee.setName(name);
		employee.setPassword(password);

		employee = employeeService.loginEmployee(employee);

		if (employee != null) {

			if (employee.getRole().equals("admin")) {
				model.addAttribute("emplist", employeeService.listAllEmployees());
				return "admin";

			} else {
				model.addAttribute("employee", employee);
				return "employee";
			}

		} else {
			return "error";
		}

	}

	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}

	@PostMapping("/delete")
	public String deleteEmployee(@ModelAttribute("employee") Employee emp,Model model) {

		int id = emp.getId();

		if (employeeService.deleteEmployee(id) == 1) {
			return "success";

		} else {
			return "error";
		}

	}
	
	@GetMapping("/findbyid")
	public String findByIdEmployee() {
		return "delete";
	}

	@PostMapping("/findbyid")
	public String findByIdEmployee(@ModelAttribute("employee") Employee emp, HttpServletRequest request, Model model) {
		
		int id = Integer.parseInt(request.getParameter("id"));
		emp.setId(id);

		Employee employee = employeeService.findByIdEmployee(id);

		if (employee != null) {

			model.addAttribute("employee", employee);
			return "findById";

		} else {
			return "error";
		}

	}

}
