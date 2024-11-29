package com.billcollectorusingAnnotations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.billcollectorusingAnnotations.Payment;

@Service
public class BillCollectorService {
	
	private Payment payment;
	
	public BillCollectorService() {
		System.out.println("  Default constructor Bill Collector service . ");
	}

	public BillCollectorService(Payment payment) {
		super();
		this.payment = payment;
	}

	public Payment getPayment() {
		return payment;
	}

	
	@Autowired
	@Qualifier("creditcard")
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void billPay(double amount) {
		String pay = payment.pay();
		System.out.println(" Transction happened sucesfully ..."+pay+"Amount ->"+amount);
	}
	
	

}
