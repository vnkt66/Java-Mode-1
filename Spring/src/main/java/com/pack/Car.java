package com.pack;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean, DisposableBean {
	private String name;
	private String model;
	public String getName() {
		return name;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am in Car");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + "]";
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I am destroyed");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I am initialized");
	}
	
	
}
