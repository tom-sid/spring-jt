package com.example.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.didemo.service.GreetingService;

@Controller
public class ConstructorInjectionController {
	private GreetingService greetingService;

	@Autowired //optional
	public ConstructorInjectionController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayGreeting() {
		return greetingService.sayGreeting();
	}

}
