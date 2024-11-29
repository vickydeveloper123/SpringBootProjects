package com.dora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Application Eureka has been started sucessfully[8761]default port number for servive registry......");
	}

	
	// Whenever we use the above annotation the  application act as EurekaServer.

}
