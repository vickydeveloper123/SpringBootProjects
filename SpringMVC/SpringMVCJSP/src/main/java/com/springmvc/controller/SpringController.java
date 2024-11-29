package com.springmvc.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
@SpringBootApplication
public class SpringController {

	@GetMapping({ "/", "/hello" })
	public String hello(@RequestParam(value = "home", defaultValue = "World", required = true) String name,
			Model model) {
		model.addAttribute("name", name);
		return "Hello Welome to my company";
	}

}
