package com.sample;

public class Call_Action {
	
	private String action;
	private boolean concluded;
	
	public Call_Action(String action, boolean concluded) {
		this.action = action;

	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public boolean isConcluded() {
		return concluded;
	}

	public void setConcluded(boolean concluded) {
		this.concluded = concluded;
	}
	
}
