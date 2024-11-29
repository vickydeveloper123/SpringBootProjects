package com.example.dao;

import org.springframework.stereotype.Repository;


@Repository("creditcard")  // Here repos annotation we can use when we can implement interface class then this annotation performed to perfoerm setter injection.
public class CreditCard implements Payment{

	
	public CreditCard() {
		
		System.out.println(" Default Credit card constructor ");
	}
	@Override
	public String pay() {
		// TODO Auto-generated method stub
		return "Transaction sucessfully completed through Credit card .";
	}

}
