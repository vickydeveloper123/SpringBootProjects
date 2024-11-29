package com.example.configuration;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoading implements DisposableBean,InitializingBean{

	public DataLoading() {
		
		System.out.println("  Data loading constructor running .... ");
	}
	/*
	 * @Override public void run(ApplicationArguments args) throws Exception {
	 * 
	 * System.out.println("    Data loading connection sucessfully...    "); }
	 */

	@Override
	public void destroy() throws Exception {
		
		System.out.println("  Bean has been destroyed after bean creation ......");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("  Bean has been created before bean creation .....");
		
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * System.out.println("  Data loading through Command line interface  ..."); }
	 */
	
	
	
}
