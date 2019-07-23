package com.pack.myclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class ClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/demo")
	public String invoke() {
		return "JUST FOR CLIENT DEMO";
	}
	
	@GetMapping("/callservice")
	public String invokeService() {
		
		String url = "http://MY-SERVICE:8888";
		return restTemplate.getForObject(url, String.class);
	}

}
