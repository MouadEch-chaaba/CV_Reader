package com.developech.businessClasses;

import java.util.ArrayList;

public class Cv {
	private String title;
	private Person owner;
	private ArrayList<Experience> experiences;
	private ArrayList<Language> languages;
	private ArrayList<SkillsDomain> skills;
	private ArrayList<Education> educations;
	private ArrayList<Certificate> certifications;
	private ArrayList<OtherInfosItem> otherInformations;
	
	public Cv(){
		System.out.println("hahahah");
		
	}
	public Cv(String title,Person owner,ArrayList<Experience> experiences,ArrayList<Language> languages,ArrayList<SkillsDomain> skills,ArrayList<Education> educations,ArrayList<Certificate> certifications,ArrayList<OtherInfosItem> otherInformations){
		this.title = title;
		this.owner = owner;
		this.experiences = experiences;
		this.languages = languages;
		this.skills = skills;
		this.educations = educations;
		this.certifications = certifications;
		this.otherInformations = otherInformations;
	}
	
	/* Getters And Setters */
	public String getTitle(){
		return this.title;
	}
	
	public Person getOwner(){
		return this.owner;
	}
	
	public ArrayList<Experience> getExperiences(){
		return this.experiences;
	}
	
	public  ArrayList<Language> getLanguages(){
		return this.languages;
	}
	
	public ArrayList<SkillsDomain> getSkills(){
		return this.skills;
	}
	
	public ArrayList<Education> getEducations(){
		return this.educations;
	}
	
	public ArrayList<Certificate> getCertifications(){
		return this.certifications;
	}
	
	public ArrayList<OtherInfosItem> getOtherInformations(){
		return this.otherInformations;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setOwner(Person owner){
		this.owner = owner;
	}
	
	public void setExperiences(ArrayList<Experience> experiences){
		this.experiences = experiences;
	}
	
	public void setLanguages(ArrayList<Language> languages){
		this.languages = languages;
	}
	
	public void setSkills(ArrayList<SkillsDomain> skills){
		this.skills = skills;
	}
	
	public void setEducations(ArrayList<Education> educations){
		this.educations = educations;
	}
	
	public void setCertifications(ArrayList<Certificate> certifications){
		this.certifications = certifications;
	}
	
	public void setOtherInformations(ArrayList<OtherInfosItem> otherInformations){
		this.otherInformations = otherInformations;
	}
}
