package com.developech.businessClasses;

public class OtherInfosItem extends Item {
	private String informationName;

	public OtherInfosItem(String content,String informationName) {
		super(content);
		this.informationName = informationName;
	}
	
	/* Getters And Setters */
	public String getInformationName(){
		return this.informationName;
	}
	
	public void setInformationName(String informationName){
		this.informationName = informationName;
	}

}
