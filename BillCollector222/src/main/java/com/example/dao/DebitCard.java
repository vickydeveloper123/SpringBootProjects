package com.example.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository("debit")
public class DebitCard implements Payment{

	@Override
	public String pay() {
		return "Payment sucessfully generated through Debit Pay ...";
	}

}
