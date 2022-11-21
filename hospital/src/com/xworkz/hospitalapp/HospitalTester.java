package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the patient name ");
		String patientName = sc.next();
		System.out.println("enter the address ");
		String address = sc.next();
		Patient pat = new Patient(patientName , address ,Gender.male);
		Hospital hos = new Hospital();
		hos.isEmergency = true;
		hos.isTreatmentRequired = true;
		hos.admit(pat);
		sc.close();



}
}
