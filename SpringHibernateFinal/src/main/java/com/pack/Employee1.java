package com.pack;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeTwo")
public class Employee1 {
	@EmbeddedId
	private EmployeeIdOne id;
	private String firstname;
	private String lastname;
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ "]";
	}
	private int salary;
	public EmployeeIdOne getId() {
		return id;
	}
	public void setId(EmployeeIdOne id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
