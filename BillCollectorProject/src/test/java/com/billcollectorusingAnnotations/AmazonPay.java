package com.billcollectorusingAnnotations;

import org.springframework.stereotype.Repository;

@Repository("AmazonPay")
public class AmazonPay  implements Payment{

	
	public AmazonPay() {
		
		System.out.println(" Default Amazon Pay Constructor .");
	}
	@Override
	public String pay() {
		// TODO Auto-generated method stub
		return "Transaction completed sucessfully through amazon pay .";
	}

}
