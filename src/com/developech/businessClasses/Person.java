package com.developech.businessClasses;

public class Person {
	private String firstName,
				   lastName,
				   address,
				   nationality,
				   telephone,
				   email,
				   personalImageUrl;
	private ESexe sexe;
	private EMaritalStatus maritalStatus;
	private float age;
	
	public Person(){}
	
	public Person(String fname,String lname,String address,String nationality,String tel,String email,String personalImgUrl,ESexe sexe,EMaritalStatus maritalStatus,float age){
		this.firstName = fname;
		this.lastName = lname;
		this.address = address;
		this.nationality = nationality;
		this.telephone = tel;
		this.email = email;
		this.personalImageUrl = personalImgUrl;
		this.sexe = sexe;
		this.maritalStatus = maritalStatus;
		this.age = age;
	}
	
	/* Getters And Setters */
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public String getNationality(){
		return this.nationality;
	}
	
	public String getTelephone(){
		return this.telephone;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getPersonalImageUrl(){
		return this.personalImageUrl;
	}
	
	public ESexe getSexe(){
		return this.sexe;
	}
	
	public EMaritalStatus getMaritalStatus(){
		return this.maritalStatus;
	}
	
	public float getAge(){
		return this.age;
	}
	
	public void setFirstName(String fname){
		this.firstName = fname;
	}
	
	public void setLastName(String lname){
		this.lastName = lname;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setNationality(String nationality){
		this.nationality = nationality;
	}
	
	public void setTelephone(String tel){
		this.telephone = tel;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPersonalImageUrl(String imageUrl){
		this.personalImageUrl = imageUrl;
	}
	
	public void setSexe(ESexe sexe){
		this.sexe = sexe;
	}
	
	public void setMaritalStatus(EMaritalStatus maritalStatus){
		this.maritalStatus = maritalStatus;
	}
	
	public void setAge(float age){
		this.age = age;
	}
}
