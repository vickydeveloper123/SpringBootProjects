package com.dora.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOMERESTAPI")
public interface WelcomeFiegnClient {
	
	@GetMapping("/thanks")
	public String getWelcomeFiegnClientInformation();

}
