package com.example.configuration;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class DataLoading implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("  Data connection sucessfully completed ...");
		
	}

}
