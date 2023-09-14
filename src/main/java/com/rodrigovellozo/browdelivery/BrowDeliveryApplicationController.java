package com.rodrigovellozo.browdelivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BrowDeliveryApplicationController {
	
	@GetMapping()
	public String greetings() {
		return "Hello brou!";
	}
}
