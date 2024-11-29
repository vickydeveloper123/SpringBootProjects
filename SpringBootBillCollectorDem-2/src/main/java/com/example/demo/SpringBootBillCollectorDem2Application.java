package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.BillCollectorPayment;


@SpringBootApplication
public class SpringBootBillCollectorDem2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootBillCollectorDem2Application.class, args);
		BillCollectorPayment bean = run.getBean(BillCollectorPayment.class);
		bean.billPay(1000);
	}

}
