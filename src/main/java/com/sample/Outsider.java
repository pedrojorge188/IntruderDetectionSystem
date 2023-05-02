package com.sample;

public class Outsider extends Person{
	
	private boolean armed;

	public Outsider(String nome, HouseSection houseSection, boolean armed) {
		super(nome, houseSection);
		this.armed = armed;
	}

	public boolean isArmed() {
		return armed;
	}

	public void setArmed(boolean armed) {
		this.armed = armed;
	}
	
}
