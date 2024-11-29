package com.example.dao;

import org.springframework.stereotype.Repository;


@Repository("debitcard")
public class DebitCard implements Payment{

	public DebitCard() {
		System.out.println("  Defaut debit card constructor .");
	}
	@Override
	public String pay() {
		// TODO Auto-generated method stub
		return "Transaction sucessfully completed through Debit card...";
	}

}
