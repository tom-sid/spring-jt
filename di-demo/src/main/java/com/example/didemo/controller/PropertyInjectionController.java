package com.example.didemo.controller;

import com.example.didemo.service.GreetingServiceImpl;

public class PropertyInjectionController {
	public GreetingServiceImpl greetingService;

	public String sayGreeting() {
		return greetingService.sayGreeting();
	}
}
