package com.sample;

public class Animal {
	
	private String species;
	private boolean domestic;
	private HouseSection houseSection;
	
	public Animal(String species, boolean domestic, HouseSection houseSection) {
		this.species = species;
		this.domestic = domestic;
		this.houseSection = houseSection;
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public boolean isDomestic() {
		return domestic;
	}
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
	public HouseSection getHouseSection() {
		return houseSection;
	}
	public void setHouseSection(HouseSection houseSection) {
		this.houseSection = houseSection;
	}
	
}
