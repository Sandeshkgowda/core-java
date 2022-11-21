package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital {
	 Patient patient;
	public boolean isEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient patient) {
		boolean isAdmitted = false;
		if(isTreatmentRequired == true) {
		if(isEmergency == true) {
			this.patient = patient;
			this.patient.displayInfo();
			System.out.println("patient can be allowed to take to ICU");
		}
		else {
			System.out.println("add patient to general ward");
		}
	}
		else {
			System.out.println("no treatment required");
		}
		return isAdmitted;
		
}
}


