package com.developech.businessClasses;

public class Certificate {
	private String date,description;
	
	public Certificate(){}
	public Certificate(String date,String description){
		this.date = date;
		this.description = description;
	}
	
	/* Getters And Setters */
	public String getDate(){
		return this.date;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
}
