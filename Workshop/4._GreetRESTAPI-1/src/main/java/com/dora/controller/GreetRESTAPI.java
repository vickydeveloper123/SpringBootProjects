package com.dora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetRESTAPI {
	
	@GetMapping("/greetmessage")
	public String getGreetMessage() {
		
		String message="you are great to learn this microservices ";
		return message;
	}

}
