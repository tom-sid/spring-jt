package com.example.didemo.controller;

import com.example.didemo.service.GreetingService;

public class SetterInjectionController {
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayGreeting() {
		return greetingService.sayGreeting();
	}

}
