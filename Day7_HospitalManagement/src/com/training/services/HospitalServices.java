package com.training.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.training.models.Doctor;
import com.training.models.Patient;

public interface HospitalServices {
	
	HashSet<Doctor> doctors= new HashSet<>();
	HashMap<Doctor, HashSet<Patient>> appointments = new HashMap<>();
	
	void appointDoctor(Doctor doctor);
	HashSet<Doctor> getDoctors();
	void setAppointment(Doctor doctor, Patient patient);
	HashSet<Patient> cancelAppointment(Doctor doctor, Patient patient);
	HashSet<Patient> getPatients(String doctorName);

}
