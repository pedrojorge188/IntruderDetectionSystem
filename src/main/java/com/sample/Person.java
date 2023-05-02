package com.sample;

public abstract class Person {
	
	private String nome;
	private HouseSection houseSection;
	
	public Person(String nome, HouseSection houseSection) {
		this.nome = nome;
		this.houseSection = houseSection;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public HouseSection getHouseSection() {
		return houseSection;
	}

	public void setHouseSection(HouseSection houseSection) {
		this.houseSection = houseSection;
	}
	
}
