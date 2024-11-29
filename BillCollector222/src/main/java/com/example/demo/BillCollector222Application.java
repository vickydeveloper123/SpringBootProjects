package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.service.BillCollector;


@SpringBootApplication
@ComponentScan(basePackages = { "com.example.service", "com.example.demo","com.example.dao","com.example.configuration"} )
public class BillCollector222Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BillCollector222Application.class, args);
	
		BillCollector bean = run.getBean(BillCollector.class);
		bean.billingConnection(1000);
	}

}
