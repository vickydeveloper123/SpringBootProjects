package com.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springmvc.controller." )
public class SpringMvcjspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcjspApplication.class, args);
	}

}
