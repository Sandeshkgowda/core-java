package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.SearchEngine;

public class SearchEngineTester {
	public static void main(String[] args) {
		SearchEngine sea = new SearchEngine();
		sea.types("firefox");
		System.out.println(sea.app);
	}

}
