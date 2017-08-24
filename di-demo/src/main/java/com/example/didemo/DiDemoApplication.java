package com.example.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.didemo.controller.ConstructorInjectionController;
import com.example.didemo.controller.PropertyInjectionController;
import com.example.didemo.controller.SetterInjectionController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		PropertyInjectionController bean1 = ctx.getBean(PropertyInjectionController.class);
		System.out.println(bean1.sayGreeting());
		
		SetterInjectionController bean2 = ctx.getBean(SetterInjectionController.class);
		System.out.println(bean2.sayGreeting());
		
		ConstructorInjectionController bean3 = ctx.getBean(ConstructorInjectionController.class);
		System.out.println(bean3.sayGreeting());
		
		
	}
}
