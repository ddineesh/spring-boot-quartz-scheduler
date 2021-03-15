package com.dinesh.springquartzdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	@GetMapping(value="/")
	public String greetings()
	{
		 return " Hello !!! This application is up & running";
	}
}
