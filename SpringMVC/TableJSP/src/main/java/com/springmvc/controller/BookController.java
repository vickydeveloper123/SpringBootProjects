package com.springmvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.entity.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView boookDetails() {
		ModelAndView view =new ModelAndView();
		
		Book b1=new Book(101,"Java",250.0);
		Book b2=new Book(102,"Java",200.0);
		Book b3=new Book(103,"Java",210.0);
		
		
		List<Book> asList = Arrays.asList(b1,b2,b3);
		
		
		view.addObject("books1", asList);
		view.setViewName("books");
		
		return view;
		
	}
	

}
