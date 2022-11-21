package com.xworkz.hospitalapp;

public class Hospital {
	String patientNames[] = new String[5];
	int index;
	public Hospital() {
		System.out.println("hospital constructer is called");
	}
	public boolean savePatientNames(String patientName) {
		System.out.println("inside savePatientNames");
		if(patientName != null && patientNames.length > index) {
		  patientNames [index++] = patientName;
		  return true;
		}
		else {
			System.out.println("bed is full");
		}
		System.out.println("end of patient");
	    return false;
		
	}
	public void getPatientNames() {
		for(int i=0; i<patientNames.length; i++) {
			System.out.println(patientNames[i] + " ");
		}
	}
	public boolean updatePatientNames(String oldPatientName , String newPatientName) {
		for(int i=0; i<patientNames.length;i++) {
			if(patientNames[i] == oldPatientName) {
				patientNames[i] = newPatientName;
				return true;
			}
		}
		return false;
	}
}
