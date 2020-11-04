package com.pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="contractemployee")
public class ContractEmployee1 extends Employee1 {
	private double pay_per_hour;
	private String contract_duration;
	public double getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(double pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
}
