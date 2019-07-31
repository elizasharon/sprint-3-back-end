package com.pack.loginclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoginClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginClientApplication.class, args);
	}

}
