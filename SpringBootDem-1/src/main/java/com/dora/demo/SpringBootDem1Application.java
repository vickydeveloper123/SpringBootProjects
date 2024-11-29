package com.dora.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dora.demo.service.ReportService;


@SpringBootApplication
public class SpringBootDem1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDem1Application.class, args);
		
		ReportService bean = run.getBean(ReportService.class);
		bean.gettingData();
		
	}

}
