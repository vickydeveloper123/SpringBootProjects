package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingManyToManyCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingManyToManyCrudApplication.class, args);
		
		System.out.println(" Spring boot application sucessfully connected to our database..........");
	}

}
