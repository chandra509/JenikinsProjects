package com.example.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servicecontroller {
	
	@GetMapping("/app")
	public String getDetails() {
		return "Hello world welcome to the app";


	}

}
