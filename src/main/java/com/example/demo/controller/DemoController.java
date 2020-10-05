package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value("${test.config}")
	private String sameConfig;
	@Value("${env.config}")
	private String envConfig;
	
	@GetMapping("/test")
	public String test() {
		return "same configuration: " + sameConfig + "\nenv config" + envConfig;
	}
}
