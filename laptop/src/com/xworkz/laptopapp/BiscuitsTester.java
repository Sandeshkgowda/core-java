package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.Biscuits;

public class BiscuitsTester {
	public static void main(String[] args) {
		Biscuits bis = new Biscuits();
		bis.toEat("mari");
		System.out.println(bis.type);
	}

}
