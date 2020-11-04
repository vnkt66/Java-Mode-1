package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Scan {
	private String scan;
	
	@Autowired
	@Lazy
	private Bike bike;

	public String getScan() {
		return scan;
	}
	
	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}



	public Scan() {
		super();
		System.out.println("I am Scan");
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Scan [scan=" + scan + ", bike=" + bike + "]";
	}



	public void setScan(String scan) {
		this.scan = scan;
	}
	
}
