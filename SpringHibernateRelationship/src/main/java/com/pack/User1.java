package com.pack;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class User1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_vehicle", joinColumns=@JoinColumn(name="id"), inverseJoinColumns=@JoinColumn(name="vehicle_id"))
	private List<Vehicle1> vehicle = new ArrayList<Vehicle1>();
	
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
	public List<Vehicle1> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<Vehicle1> vehicle) {
		this.vehicle = vehicle;
	}
	
}
