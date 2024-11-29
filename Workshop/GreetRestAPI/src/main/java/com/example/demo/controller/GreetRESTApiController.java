package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.client.GreetFeignInterfaceApplication;

@RestController
public class GreetRESTApiController {
	@Autowired
	private GreetFeignInterfaceApplication controllerFeignnn;

	@GetMapping("/greet")
	public String greetingStudents() {
		String message = "Good Morning everyone how is ur day students....";
		String messageInformation = controllerFeignnn.getMessageInformation();
		String messssge="ThankYou all";
		String fiegn="Fiegn Application has been sucessfully connected";
		String finalMessage="I am so happy to learn Spring boot with microservices from Ashok IT...";
		return message + messageInformation+messssge+finalMessage;
	}

}
