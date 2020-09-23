package com.training.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.training.models.Doctor;
import com.training.models.Patient;

public interface HospitalServices {
	
	HashSet<Doctor> doctors= new HashSet<>();
	HashMap<Doctor, HashSet<Patient>> appointments = new HashMap<>();
	
	void appointDoctor(String doctorName, String speciality);
	HashSet<Doctor> getDoctors();
	void setAppointment(Doctor doctor, Patient patient);
	HashSet<Patient> cancelAppointment(Doctor doctor, Patient patient);
	HashSet<Patient> get_patients(String doctorName);

}
