package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.Fruit;

public class FruitTester {
	public static void main(String[] args) {
		Fruit fru = new Fruit();
		fru.toEat("yellow");
		System.out.println(fru.colour);
	}

}
