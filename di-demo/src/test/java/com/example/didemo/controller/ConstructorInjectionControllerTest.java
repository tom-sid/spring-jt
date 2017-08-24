package com.example.didemo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.didemo.service.GreetingServiceImpl;

public class ConstructorInjectionControllerTest {
	private ConstructorInjectionController constructorInjectionController;

	@Before
	public void setup() throws Exception {
		this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals("hello", constructorInjectionController.sayGreeting());
	}
}
