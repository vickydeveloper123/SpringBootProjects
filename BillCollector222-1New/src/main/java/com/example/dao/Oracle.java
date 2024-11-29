package com.example.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
@Primary
public class Oracle implements ReportDao {

	
	public Oracle() {
	System.out.println(" Oracle default constructor in invoked .");
	}
	@Override
	public String fetchData() {
		return "Details got fetched sucessfully from Oracle class ";
	}

}
