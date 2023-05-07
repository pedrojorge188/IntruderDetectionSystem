package com.sample;

public class Outsider extends Person{
	
	private boolean armed;

	public Outsider(HouseSection houseSection, boolean armed) {
		super(houseSection);
		this.armed = armed;
	}

	public boolean isArmed() {
		return armed;
	}

	public void setArmed(boolean armed) {
		this.armed = armed;
	}
	
}
