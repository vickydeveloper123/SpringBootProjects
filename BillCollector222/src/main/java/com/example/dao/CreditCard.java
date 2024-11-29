package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository("credit")
public class CreditCard implements Payment{

	
	public CreditCard() {
		
		System.out.println("  Default constructor is running ...");
	}
	@Override
	public String pay() {
		// TODO Auto-generated method stub
		return "Payment sucessfully generated through CreditCard Pay ...";
	}

}
