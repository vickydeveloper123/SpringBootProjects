package com.dora.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MySql implements ReportDao{

	public MySql() {

		System.out.println(" Default constructor from MySql Class...");
	
	}
	@Override
	public String fetchData() {
		return "Details fetched sucessfully from mysql.....";
	}

}
