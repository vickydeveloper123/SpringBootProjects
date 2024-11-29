package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.ReportService;

@SpringBootApplication
public class BillCollector2221NewApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BillCollector2221NewApplication.class, args);
	
	
		ReportService bean = run.getBean(ReportService.class);
		
		bean.gettingData();
	}

}
