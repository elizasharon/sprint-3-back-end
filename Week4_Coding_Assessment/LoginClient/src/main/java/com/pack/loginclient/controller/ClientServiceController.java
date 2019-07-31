package com.pack.loginclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.pack.loginclient.model.User;


@Controller
public class ClientServiceController {


	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/")
	public String invoke() {
		return "Login";
	}

	@PostMapping("/")
	public String invokeService(@RequestParam String username, @RequestParam String password) {

		User user = new User(username, password);
		//System.out.println(user);
		
		boolean check = restTemplate.postForObject("http://MY-SERVICE:8888",user,Boolean.class);
		
		if(check) {
			return "Hello";
		}else {
			return "Error";
		}
	}

}