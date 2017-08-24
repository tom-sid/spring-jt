package com.example.didemo.controller;

import com.example.didemo.service.GreetingService;

public class ConstructorInjectionController {
	private GreetingService greetingService;

	public ConstructorInjectionController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayGreeting() {
		return greetingService.sayGreeting();
	}

}
