package com.developech.businessClasses;

public abstract class Experience {
	protected String title,startDate,endDate;
	
	public Experience(String title,String startDate,String endDate){
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	/* Getters And Setters */
	public String getTitle(){
		return this.title;
	}
	
	public String getStartDate(){
		return this.startDate;
	}
	
	public String getEndDate(){
		return this.endDate;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
	
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
}
