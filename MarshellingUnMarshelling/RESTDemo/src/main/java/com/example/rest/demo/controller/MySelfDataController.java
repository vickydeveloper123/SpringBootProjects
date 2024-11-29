package com.example.rest.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.demo.binding.MySelf;

@RestController
public class MySelfDataController {

	@GetMapping(value = "/myself", produces = { "application/xml", "application/json" })
	public ResponseEntity<MySelf> getMySelf() {
		MySelf myself = new MySelf();
		myself.setMyName("Rachamalli Dora Sri Vignesh");
		myself.setMyAge(28);
		myself.setJobName("SeniorSoftware Architect[WIPRO Company.]");
		myself.setLocation("Nellore[Andhra Pradesh.]");

		return new ResponseEntity<MySelf>(myself, HttpStatus.OK);

	}

}
