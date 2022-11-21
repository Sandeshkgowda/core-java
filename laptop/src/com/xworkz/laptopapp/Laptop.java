package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.ElectronicDevice;

public class Laptop extends ElectronicDevice {
	public static void main(String[] args) {
		Laptop lap = new Laptop();
		lap.device("hp");
		System.out.println(lap.name);
	}

}
