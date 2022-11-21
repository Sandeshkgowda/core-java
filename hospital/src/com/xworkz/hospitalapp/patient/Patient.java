package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

public class Patient {
	public String patientName;
	public String address;
	public Gender gender;
	public Patient(String patientName, String address, Gender gender) {
		super();
	this.patientName = patientName;
	this.address = address;
	this.gender = gender;
	}
	public void displayInfo() {
		System.out.println("patient name is " + patientName);
		System.out.println("patient address is " +address);
		System.out.println("patient gender is " +gender);
	}

}
