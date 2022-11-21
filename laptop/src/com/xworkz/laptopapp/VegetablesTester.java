package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.Vegetables;

public class VegetablesTester {
	public static void main(String[] args) {
		Vegetables veg = new Vegetables();
		veg.eat("carrort");
		System.out.println(veg.name);
	}

}
