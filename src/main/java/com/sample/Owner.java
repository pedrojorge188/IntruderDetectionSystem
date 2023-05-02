package com.sample;

public class Owner extends Person {
	
	private String telefone;
	private String contract;
	
	public Owner(String nome, HouseSection houseSection, String telefone, String contract) {
		super(nome, houseSection);
		this.telefone = telefone;
		this.contract = contract;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}
	
}
