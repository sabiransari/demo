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
	@Value("${name}")
	private String javaHome;
	
	@GetMapping("/test")
	public String test() {
		return "\nsame configuration: " + sameConfig + 
				"\nenv config: " + envConfig + 
				"\njava home: " + javaHome;
		
	}
}
