package com.sample;

public class Sensor {
	
	private String type;
	private boolean connected;
	private HouseSection houseSection;
	
	public Sensor(String type, boolean connected, HouseSection houseSection) {
		this.type = type;
		this.connected = connected;
		this.houseSection = houseSection;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isConnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	public HouseSection getHouseSection() {
		return houseSection;
	}

	public void setHouseSection(HouseSection houseSection) {
		this.houseSection = houseSection;
	}
	
}
