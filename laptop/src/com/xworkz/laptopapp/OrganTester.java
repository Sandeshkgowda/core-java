package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.Eyes;
import com.xworkz.laptopapp.laptop.Organ;

public class OrganTester {
	public static void main(String[] args) {
		Organ org = new Organ();
		org.toSenseThings();

		Eyes eyes = new Eyes();
		eyes.toSenseThings();
	}
}
