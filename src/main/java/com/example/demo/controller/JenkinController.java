package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/res")
public class JenkinController {

	@GetMapping("/response")
	public String testJenkins()
	{
		return "Welcome to jenkins World";
		
	}
	
}
