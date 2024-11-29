package com.billcollectorusingAnnotations;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.ConfigurableApplicationContext;

import com.billcollectorusingAnnotations.service.BillCollectorService;

	@SpringBootApplication
	public class BillCollectorProjectApplication {

		public static void main(String[] args) {
			ConfigurableApplicationContext run = SpringApplication.run(BillCollectorProjectApplication.class, args);
			BillCollectorService bean = run.getBean(BillCollectorService.class);
			bean.getPayment();
			System.out.println("------------------- Acssing method in the service class -------");
			bean.billPay(5000);
		}


}
