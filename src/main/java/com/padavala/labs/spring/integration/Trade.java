package com.padavala.labs.spring.integration;

public class Trade {
	
	int id;
	
	public Trade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trade(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Trade [id=" + id + "]";
	}
	
}
