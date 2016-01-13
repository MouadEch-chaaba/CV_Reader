package com.developech.businessClasses;

public abstract class Item {
	protected String content;
	
	public Item(String content){
		this.content = content;
	}
	
	/* Getters And Setters */
	public String getContent(){
		return this.content;
	}
	
	public void setContent(String content){
		this.content = content;
	}

}
