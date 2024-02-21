package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String firstLine, String City) {
	
}
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Vikash";
	}

	@Bean
	public Address address() {
		return new Address("Kolhachak", "Masaurhi");
	}
}
