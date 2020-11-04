package com.pack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeOne")
@IdClass(EmployeeId.class)
public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", branch=" + branch + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", salary=" + salary + "]";
	}
	@Id
	private int id;
	@Id
	private String branch;
	private String firstname;
	private String lastname;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
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
