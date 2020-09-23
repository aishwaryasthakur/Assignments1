package com.training.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.training.services.HospitalServices;

public class Hospital implements HospitalServices {

	private String hospitalName;
	private String address;
	private long phoneNumber;
	
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hospital(String hospitalName, String address, long phoneNumber) {
		super();
		this.hospitalName = hospitalName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void appointDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctors.add(doctor);
	}
	
	@Override
	public HashSet<Doctor> getDoctors() {
		return doctors;
	}
	
	@Override
	public HashSet<Patient> getPatients(String doctorName) {
		// TODO Auto-generated method stub
		HashSet<Patient> patients = new HashSet<>(); 

		for (Entry<Doctor, HashSet<Patient>> entry : appointments.entrySet()) {
	        //System.out.print(entry.getKey().getDoctorName());
	        for(Patient patient : entry.getValue()){
	            //System.out.print(patient.getPatientName()+" ");
	            patients.add(patient);
	        }
	    }
		return patients;
	}
	
	@Override
	public void setAppointment(Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
		if (appointments.get(doctor) == null) {
		    appointments.put(doctor, new HashSet<Patient>());
		}
		appointments.get(doctor).add(patient);
	}
	
	@Override
	public HashSet<Patient> cancelAppointment(Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
		HashSet<Patient> patients = appointments.get(doctor);
		patients.remove(patient);
		return patients;	        
	    }
}
