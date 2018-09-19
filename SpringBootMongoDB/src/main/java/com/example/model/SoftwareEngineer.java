package com.example.model;

public class SoftwareEngineer {
	
	public String name;
	public int age;
	public boolean isHavingGF;
	public SoftwareEngineer(String name,int age,boolean isHavingGF) {
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}
	public String toString() {
		return name;
	}

}
