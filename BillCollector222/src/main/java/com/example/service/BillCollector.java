package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.dao.Payment;

@Service
public class BillCollector {

	private Payment payment;
	/*
	 * public Payment getPayment() { return payment; }
	 */

	@Autowired
	@Qualifier("credit")
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void billingConnection(double amount) {
		String payments = payment.pay();
		System.out.println("   Payment happened sucessfully  " + payments+" Amount =>"+amount);
	}

}
