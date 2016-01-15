package com.developech.businessClasses;

import java.util.ArrayList;

public class SkillsDomain {
	private String domainName;
	private ArrayList<SkillsDomainItem> items; 
	
	public SkillsDomain(){
		this.items = new ArrayList<SkillsDomainItem>();
	}
	public SkillsDomain(String domainName,ArrayList<SkillsDomainItem> items){
		this.domainName = domainName;
		this.items = items;
	}
	
	/* Getters And Setters */
	public String getDomainName(){
		return this.domainName;
	}
	
	public ArrayList<SkillsDomainItem> getItems(){
		return this.items;
	}
	
	public void setDomainName(String domainName){
		this.domainName = domainName;
	}
	
	public void setItems(ArrayList<SkillsDomainItem> items){
		this.items = items;
	}
	
	public void addItem(SkillsDomainItem item){
		this.items.add(item);
	}
}
