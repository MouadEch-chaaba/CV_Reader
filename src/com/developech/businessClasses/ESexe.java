package com.developech.businessClasses;

public enum ESexe {
	MALE("male"),
	FEMALE("female");
	
	private String sexe;
	
	ESexe(String sexe){
		this.sexe = sexe;
	}
	
	@Override
	public String toString(){
		return this.sexe;
	}
}
