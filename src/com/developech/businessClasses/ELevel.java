package com.developech.businessClasses;

public enum ELevel {
	MOTHER("mother"),
	EXCELLENT("excellent"),
	INTERMIDIATE("intermidiate"),
	MINIMAL("minimal");
	
	private String level;
	
	ELevel(String level){
		this.level = level;
	}
	
	@Override
	public String toString(){
		return this.level;
	}
}
