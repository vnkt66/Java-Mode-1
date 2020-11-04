package com.pack.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
   @NotEmpty
   @Size(min=6,max=12)
   private String name;
   @NotNull
   @Min(value=18)
   @Max(value=60)
   private Integer age;
   @NotEmpty
   private String address;
   @NotNull
   private Double salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
   
}
