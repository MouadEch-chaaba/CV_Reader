package com.developech.businessClasses;

public enum EMaritalStatus {
	MARIED("maried"),
	SINGLE("single"),
	DIVORCED("divorced");
	
	private String maritalStatus;
	
	EMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	@Override
	public String toString(){
		return this.maritalStatus;
	}
}
