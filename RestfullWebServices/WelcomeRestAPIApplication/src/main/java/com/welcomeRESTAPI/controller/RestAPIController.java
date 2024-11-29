package com.welcomeRESTAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
	
	
	@GetMapping("/welcome")
	public String message() {
		String msg="Hello software architect welcome to TCS Company.";
		return msg;
	}

}
