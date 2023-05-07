package com.sample;

public abstract class Person {
	
	protected HouseSection houseSection;
	
	public Person(HouseSection houseSection) {
		this.houseSection = houseSection;
	}

	public HouseSection getHouseSection() {
		return houseSection;
	}

	public void setHouseSection(HouseSection houseSection) {
		this.houseSection = houseSection;
	}
	
}
