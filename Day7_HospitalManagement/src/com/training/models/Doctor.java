package com.training.models;

public class Doctor {

	private String doctorName;
	private String speciality;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctorName, String speciality) {
		super();
		this.doctorName = doctorName;
		this.speciality = speciality;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", speciality=" + speciality + "]";
	}
	
	
}
