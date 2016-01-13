package com.developech.businessClasses;

public class Language {
	private String name;
	private ELevel level;
	
	public Language(){}
	public Language(String name,ELevel level){
		this.name = name;
		this.level = level;
	}
	
	/* Getters And Setters */
	public String getName(){
		return this.name;
	}
	
	public ELevel getLevel(){
		return this.level;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setLevel(ELevel level){
		this.level = level;
	}
}

