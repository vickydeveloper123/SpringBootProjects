package com.embedded.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmbeddedApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedApplication1Application.class, args);
		System.out.println("Application has been sucessfully connected....");
	}

}
