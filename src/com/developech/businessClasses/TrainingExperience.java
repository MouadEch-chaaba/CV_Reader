package com.developech.businessClasses;

public class TrainingExperience extends Experience {
	private String organization;

	public TrainingExperience(String title, String startDate, String endDate,String organizatoin) {
		super(title, startDate, endDate);
		this.organization = organizatoin;
	}
	
	/* Getters And Setters */
	public String getOrganization(){
		return this.organization;
	}
	
	public void setOrganization(String organization){
		this.organization = organization;
	}

}
