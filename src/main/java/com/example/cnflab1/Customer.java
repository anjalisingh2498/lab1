package com.example.cnflab1;

public class Customer {
	String name,address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Ticket getTick() {
		return tick;
	}
	public void setTick(Ticket tick) {
		this.tick = tick;
	}
	Ticket tick;

}
