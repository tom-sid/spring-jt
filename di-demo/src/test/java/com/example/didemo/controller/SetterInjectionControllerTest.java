package com.example.didemo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.didemo.service.GreetingServiceImpl;

public class SetterInjectionControllerTest {
	private SetterInjectionController setterInjectionController;

	@Before
	public void setup() throws Exception {
		this.setterInjectionController = new SetterInjectionController();
		this.setterInjectionController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals("hello", setterInjectionController.sayGreeting());
	}
}
