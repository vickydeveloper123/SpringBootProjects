package com.example.dao;

import org.springframework.stereotype.Repository;


@Repository("upipay")

public class UPIpay implements Payment {

	
	public UPIpay() {
		System.out.println("  Default UPI pay constructor ");
	}
	@Override
	public String pay() {
		// TODO Auto-generated method stub
		return "Transaction sucessfully completed through pay ...";
	}

}
