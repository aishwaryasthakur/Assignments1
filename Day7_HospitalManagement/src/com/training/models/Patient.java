package com.training.models;

public class Patient {
	
	private String patientName;
	private int age;
	private String gender;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String patientName, int age, String gender) {
		super();
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
