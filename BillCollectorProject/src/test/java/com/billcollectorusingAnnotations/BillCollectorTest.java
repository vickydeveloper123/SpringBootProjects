package com.billcollectorusingAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BillCollectorTest {
	
	public static void main(String[] args) {
		
		ApplicationContext contect=new ClassPathXmlApplicationContext("springdata-beans.xml");
		
		  BillCollectorPayment
		  bcp=contect.getBean("billcollector",BillCollectorPayment.class); bcp.billPay(2000);
		 
	}

}


