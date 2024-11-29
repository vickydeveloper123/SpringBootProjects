package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.BillCollector;


@SpringBootApplication
public class BillCollectorDem2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BillCollectorDem2Application.class, args);

        BillCollector bean = run.getBean(BillCollector.class);	
        bean.billPay(1000);
	}

}
