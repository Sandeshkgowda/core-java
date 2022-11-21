package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.ElectronicDevice;

public class ElectronicDeviceTester {
	public static void main(String[] args) {
		ElectronicDevice ele = new ElectronicDevice();
		ele.device("Laptop");
		System.out.println("the name of the electronic device is "+ ele.name);
		
	}

}
