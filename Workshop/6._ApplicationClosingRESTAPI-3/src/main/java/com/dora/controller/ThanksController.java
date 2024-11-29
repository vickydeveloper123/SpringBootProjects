package com.dora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dora.client.WelcomeFiegnClient;

@RestController
public class ThanksController {
	
	@Autowired
	private WelcomeFiegnClient welcomeFeign;
	
	@GetMapping("/thanks")
	public String getThanksMessage() {
		String message="Thank you for joining microservices workshop";
		String welcomeFiegnClientInformation = welcomeFeign.getWelcomeFiegnClientInformation();
		return message+welcomeFiegnClientInformation;
	}

}
