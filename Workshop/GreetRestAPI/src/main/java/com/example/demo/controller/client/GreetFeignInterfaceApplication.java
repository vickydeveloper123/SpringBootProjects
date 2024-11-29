package com.example.demo.controller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOMERESTAPI")
public interface GreetFeignInterfaceApplication {

	@GetMapping("/welcome")
	public  String getMessageInformation();
}
