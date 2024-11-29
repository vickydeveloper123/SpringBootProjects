package com.dora.thankcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dora.client.WelcomeFeignApplication;

@RestController
public class ThankYouRESTController {
	
	@Autowired
	private WelcomeFeignApplication fiegnApplication;
	@GetMapping("/thankyou")
	public String getThankYou() {
		String message = "Thank you learning Microservices courses";
		String welcomeFeignApplication = fiegnApplication.getWelcomeFeignApplication();
		
		return message+welcomeFeignApplication;
	}

}
