package com.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@Configuration
public class XmlConfig {
	@Bean
	public Employee emp() {
		return new Employee();
	}
	@Bean
	public Bike bk() {
		return new Bike();
	}
	@Bean
	@Primary
	public Bike bike() {
		return new Bike();
	}
}
