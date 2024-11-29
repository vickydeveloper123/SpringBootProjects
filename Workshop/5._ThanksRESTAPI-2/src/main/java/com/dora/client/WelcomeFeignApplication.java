package com.dora.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WelcomeRESTAPI")

public interface WelcomeFeignApplication {
	
	@GetMapping("/thanks")
	public String getWelcomeFeignApplication();

}
