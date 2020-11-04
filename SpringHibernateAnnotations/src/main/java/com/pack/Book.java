package com.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(
			name="findBook",
			query="from Book b where b.id=:bid"
			),
	@NamedQuery(
			name="findBookProce",
			query="select b.price from Book b where b.id=:bid"
			)
})
@NamedNativeQueries(value = {
	@NamedNativeQuery(
			name="findAll",
			query="select * from Book",
			resultClass=Book.class
			),
	@NamedNativeQuery(
			name="findById",
			query="select * from Book b where b.id=:bid",
			resultClass=Book.class
			)
})
public class Book {
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
