package com.pack.dbbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.dbbootdemo.dao.StudentDAO;
import com.pack.dbbootdemo.model.Student;

@Controller
public class MyController {
	
	@Autowired
	public StudentDAO obj;
	
	@RequestMapping("/")
	public String getPage() {
		return "register.jsp";
	}
	@PostMapping("/addStudent")
	public String add(Student student) {
		obj.save(student);
		return "register.jsp";
	}
}
