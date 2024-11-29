package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/Vignesh")
	public ModelAndView model() {
		ModelAndView view=new ModelAndView();
		view.addObject("Mahesh", "Mahesh and vignesh are good software developers....");
		view.setViewName("index");
		
		return view;
	}

}