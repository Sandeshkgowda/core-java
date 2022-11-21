package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.Human;

public class HumanTester {
	public static void main(String[] args) {
		Human hu = new Human();
		hu.being("homo sapines");
		System.out.println(hu.type);
	}

}
