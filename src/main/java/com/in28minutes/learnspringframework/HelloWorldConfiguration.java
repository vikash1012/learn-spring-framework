package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String firstLine, String City) {

}

record Person(String name, int age, Address address) {

}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Vikash";
	}

	@Bean
	public int age() {
		return 23;
	}

	// how to create a bean which is related to existing bean
	// 1. by using the method call
	@Bean
	public Person personUsingMethodCall() {
		return new Person(name(), age(), address());
	}

	// 2. using parameter
	@Bean
	public Person personUsingParameterCall(String name, int age, Address permanentAddress) {
		return new Person(name, age, permanentAddress);
	}

	@Bean(name = "permanentAddress") // The name attributes is used to set the custom name of the bean
	public Address address() {
		return new Address("Kolhachak", "Masaurhi");
	}
}
