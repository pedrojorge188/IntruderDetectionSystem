package com.sample;

public class Security extends Person{
	
	private String badgedNumber;
	private boolean alerted;

	public Security(String nome, HouseSection houseSection, String badgedNumber, boolean alerted) {
		super(nome, houseSection);
		this.badgedNumber = badgedNumber;
		this.alerted = alerted;
	}

	public String getBadgedNumber() {
		return badgedNumber;
	}

	public void setBadgedNumber(String badgedNumber) {
		this.badgedNumber = badgedNumber;
	}

	public boolean isAlerted() {
		return alerted;
	}

	public void setAlerted(boolean alerted) {
		this.alerted = alerted;
	}
	
}
