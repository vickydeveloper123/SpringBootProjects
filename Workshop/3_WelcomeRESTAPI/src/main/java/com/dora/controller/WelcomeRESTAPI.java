package com.dora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRESTAPI {

	@Autowired // Here autowired is used to perform dependency injection.
	private Environment environment;

	@GetMapping("/welcome")
	public String getMessageInformation() {

		String property = environment.getProperty("server.port");
		String message = "Welcome to the Microservices Architecture...(" + property + ")";
		return message;
	}

}
