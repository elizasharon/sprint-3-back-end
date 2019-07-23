package com.pack.myclientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ClientServiceController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/test")
	public String invoke() {
		return "JUST FOR FUN";
	}
	
	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping("/")
	public String invokeService() {
		String url = "http://MY-SERVICE:8888";
		return restTemplate.getForObject(url, String.class);
	}
	
	public String fallback() {
		
		return "<h1>SERVICE DOWN... TRY AGAIN LATER!</h1>";
	}

}
