package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.dao.ReportDao;


@Service
public class ReportService {
	
	private ReportDao reportDao;
	
	/*
	 * public ReportService() {
	 * 
	 * 
	 * System.out.println(" Default constructor from Report Service class."); }
	 */
	
	public void gettingData() {
		String fetchData = reportDao.fetchData();
		System.out.println("Details from interface "+ fetchData);
		
	}

	public ReportDao getReportDao() {
		return reportDao;
	}

	@Autowired
	//@Qualifier("oracle")  // Here we are performing setter injection.
	// if we perform in the constructor then it is called constructor injection.

	@Qualifier("creditcard")
	public void setReportDao( ReportDao reportDao) {
		this.reportDao = reportDao;
	}
	
	

}
