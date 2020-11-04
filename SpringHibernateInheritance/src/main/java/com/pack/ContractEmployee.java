package com.pack;

public class ContractEmployee extends Employee {
	private double pay_per_hour;
	private String duration;
	public double getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(double pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
