package com.dora.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImplementation implements ReportDao {

	
	public ReportDaoImplementation() {
		
		System.out.println("  ReportDaoImplementation got invoked sucessfully .. ");
	}
	@Override
	public String fetchData() {
		System.out.println("   Details got sucessfully  ... ");
		return "Getting all details from the data base sucessfully";
	}
	

}
