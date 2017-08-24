package com.example.didemo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.didemo.service.GreetingServiceImpl;

public class PropertyInjectionControllerTest {
	private PropertyInjectionController propertyInjectionController;

	@Before
	public void setup() throws Exception {
		this.propertyInjectionController = new PropertyInjectionController();
		this.propertyInjectionController.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals("hello", propertyInjectionController.sayGreeting());
	}
}
