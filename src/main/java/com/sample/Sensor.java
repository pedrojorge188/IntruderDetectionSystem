package com.sample;

public class Sensor {
	
	private boolean connected;
	private HouseSection houseSection;
	
	public Sensor(boolean connected, HouseSection houseSection) {
		this.connected = connected;
		this.houseSection = houseSection;
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
