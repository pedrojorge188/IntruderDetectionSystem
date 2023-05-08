package com.sample;

public class Outsider{
	
	private boolean armed;
	private HouseSection houseSection;

	public Outsider(HouseSection houseSection, boolean armed) {
		this.houseSection = houseSection;
		this.armed = armed;
	}

	public boolean isArmed() {
		return armed;
	}

	public void setArmed(boolean armed) {
		this.armed = armed;
	}
	
	public HouseSection getHouseSection() {
		return houseSection;
	}
	
	public void setHouseSection(HouseSection houseSection) {
		this.houseSection = houseSection;
	}
	
}
