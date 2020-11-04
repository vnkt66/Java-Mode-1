package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

public class Employee {
	private String name;
	private String code;
//	private Car car;
	private Bike bike;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am in Employee");
	}
	
	public String getName() {
		return name;
	}
//	@Autowired
	public Employee(String name, String code, Bike bike) {
		super();
		this.name = name;
		this.code = code;
		this.bike = bike;
	}
//	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
@Override
	public String toString() {
		return "Employee [name=" + name + ", code=" + code + ", bike=" + bike + "]";
	}
	//	public Car getCar() {
//		return car;
//	}
//	public void setCar(Car car) {
//		this.car = car;
//	}
	public Bike getBike() {
		return bike;
	}
//	@Autowired
//	@Qualifier("bk")
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
//	@PostConstruct
//	public void init() {
//		System.out.println("I am in Employee Init");
//	}
//	@PreDestroy
//	public void destroy() {
//		System.out.println("I am in Employee destroy");
//	}
	
}
