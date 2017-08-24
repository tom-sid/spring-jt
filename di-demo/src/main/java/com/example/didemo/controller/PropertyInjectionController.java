package com.example.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.didemo.service.GreetingServiceImpl;

@Controller
public class PropertyInjectionController {
	@Autowired
	public GreetingServiceImpl greetingService;

	public String sayGreeting() {
		return greetingService.sayGreeting();
	}
}
