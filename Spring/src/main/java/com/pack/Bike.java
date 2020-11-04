package com.pack;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
@Lazy
@Component
public class Bike {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	@PostConstruct
//	public void init() {
//		System.out.println("I am in Bike Init");
//	}
//	@PreDestroy
//	public void destroy() {
//		System.out.println("I am in Bike destroy");
//	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am in Bike");
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + "]";
	}
	
}
