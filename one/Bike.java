package com.ty.one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	private int id;
	private String name;
	private double cost;
	@OneToOne
	@JoinColumn
	private Charcy charcy;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Charcy getCharcy() {
		return charcy;
	}
	public void setCharcy(Charcy charcy) {
		this.charcy = charcy;
	}
	
	
}
