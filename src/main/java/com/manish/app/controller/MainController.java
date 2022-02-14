package com.manish.app.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping("/")
	public String starter()
	{
		System.out.println("Application Started--->on 9090");
		return "Application has been started on port 9090;";
	}
}
