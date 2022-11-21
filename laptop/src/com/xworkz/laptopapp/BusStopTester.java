package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.BusStop;

public class BusStopTester {
	public static void main(String[] args) {
		BusStop bus = new BusStop();
		bus.type("district busstop");
		System.out.println(bus.name);
	}

}
