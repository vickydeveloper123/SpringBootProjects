package com.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TableJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableJspApplication.class, args);
		System.out.println("-----Application has been sucessfully connected to the database.---------");
	}

}
