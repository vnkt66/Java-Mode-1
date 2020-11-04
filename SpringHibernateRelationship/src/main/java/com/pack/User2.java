package com.pack;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user2")
public class User2 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	@ManyToMany
	private List<Vehicle2> vehicle = new ArrayList<Vehicle2>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Vehicle2> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<Vehicle2> vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
}
