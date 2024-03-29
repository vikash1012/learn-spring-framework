package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1: Launch a Spring Context- application
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Configure the things that we want Spring to manage -
		//  HelloWorldConfigrationClass- @Configuration
		//name method- @Bean
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("permanentAddress")); //bean can we retrieve using bean name and type of the bean's class name as well
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("personUsingMethodCall"));
		System.out.println(context.getBean("personUsingParameterCall"));

	}

}
