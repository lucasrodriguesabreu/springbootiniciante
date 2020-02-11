package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String hello() {
		
		System.out.println("Entrei nesse método!");
		
		return "Hello World";
	}

}
