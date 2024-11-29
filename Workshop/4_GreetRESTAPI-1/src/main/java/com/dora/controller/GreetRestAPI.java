package com.dora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestAPI {
	
	@GetMapping("/greetmessage")
	public String getGreetMessage() {
		String message="Have A GREAT SUBJECT MICROSERVICES";
		return message;
	}

}
