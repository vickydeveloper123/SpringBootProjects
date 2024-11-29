package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository("amazon")
public class AmazonPay implements Payment {

	@Override
	public String pay() {
		return "    Payment sucessfully generated through Amazon Pay ....";
	}

}
