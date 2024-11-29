package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.dao.Payment;

@Service
@Component
public class BillCollectorPayment {
	
	private Payment payment;
	
	/*
	 * public BillCollectorPayment() {
	 * 
	 * System.out.println("Default constructor BillCollectorPayment is running "); }
	 */
	/*
	 * public Payment getPay() { return payment; }
	 */

	@Autowired
	@Qualifier("creditcard")
	public void setPay(Payment pay) {
		this.payment = pay;
	}
	
	public void billPay(double d) {
		String result=payment.pay();
		System.out.println("Payment sucessfully fetched the data ->"+ result+"Amount ===>"+d);
	}

}
