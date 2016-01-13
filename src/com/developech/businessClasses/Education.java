package com.developech.businessClasses;

public class Education {
	private int startYear,endYear;
	private String description;
	
	public Education(){}
	public Education(int startYear,int endYear,String description){
		this.startYear = startYear;
		this.endYear = endYear;
		this.description = description;
	}
	
	/* Getters And Setters */
	public int getStartYear(){
		return this.startYear;
	}
	
	public int getEndYear(){
		return this.endYear;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setStartYear(int startYear){
		this.startYear = startYear;
	}
	
	public void setEndYear(int endYear){
		this.endYear = endYear;
	}
	
	public void setDescription(String description){
		this.description = description;
	}

}
