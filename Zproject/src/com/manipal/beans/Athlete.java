package com.manipal.beans;

import java.util.Random;

public class Athlete {

	int randnum; 
	String name,gender,category;
	String mobile;
	String email;
	public  int getRandomNumberInts(int min, int max){
	    Random random = new Random();
	    return random.ints(min,(max+1)).findFirst().getAsInt();
	}

	public int getRandnum() {
		return randnum;
	}

	public void setRandnum(int randnum) {
		this.randnum = randnum;
	}

	@Override
	public String toString() {
		return "Athlete [name=" + name + ", gender=" + gender + ", category=" + category + ", mobile=" + mobile
				+ ", email=" + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
