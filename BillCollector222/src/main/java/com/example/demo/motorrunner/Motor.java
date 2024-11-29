package com.example.demo.motorrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.Payment;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Motor  {
	
	public Motor() {
		
		System.out.println(" Default constructor running ...");
	}
	
	@Autowired
	private Payment payment;
	
	/*
	 * @PostConstruct public void postConstruct() {
	 * System.out.println(" DB Connection sucessfully got connected --->"+
	 * payment.pay()); }
	 */
	
	@PreDestroy
	public void preConstruct() {
		System.out.println("   DB connection sucessfully before bean creation ...");
	}

}
