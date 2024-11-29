package com.dora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRESTController {
	
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		
		String message="Welcome to learn Microservices!!!!";
		return message;
	}

}
