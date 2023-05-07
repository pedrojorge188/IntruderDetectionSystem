package com.sample;

public class Security extends Person{
	
	private boolean alerted;

	public Security(HouseSection houseSection, boolean alerted) {
		super(houseSection);
		this.alerted = alerted;
	}

	public boolean isAlerted() {
		return alerted;
	}

	public void setAlerted(boolean alerted) {
		this.alerted = alerted;
	}
	
}
