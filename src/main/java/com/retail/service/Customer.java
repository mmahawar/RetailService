package com.retail.service;

public class Customer {

	public Customer(int customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}

	private int customerId;
	private String name;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
