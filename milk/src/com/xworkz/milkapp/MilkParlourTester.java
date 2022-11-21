package com.xworkz.milkapp;

import com.xworkz.milkapp.milk.MilkParlour;

public class MilkParlourTester {
	public static void main(String[] args) {
		String types[] = new String [4];
		types[0] = "special types";
		types[1] = "blue packet";
		types[2] = "organe pack";
		types[3] = "yellow pack";
		String sweet[] = new String[4];
		sweet[0] = "peda";
		sweet[1] = "kaju";
		sweet[2] = "mysore pak";
		sweet[3] = "dry fruits sweet ";
		String products[] = new String [3];
		products[0] = "panner";
		products[1] = "butter";
		products[2] = "cheese";
		
		MilkParlour milk = new MilkParlour("nandini" , "bangalore", types,sweet,products);
		milk.market();
		

		/*
		 * MilkParlour milk = new MilkParlour(); milk.name = "nandini"; milk.address =
		 * "bangalore"; milk.types = new String[5]; milk.types[0] = "blue packet";
		 * milk.types[1] = "orange"; milk.types[2] = "special"; milk.types[3] =
		 * "tetra pack"; milk.types[4] = "yellow pack"; milk.sweet = new String[4];
		 * milk.sweet[0] = "peda"; milk.sweet[1] = "mixed fruit"; milk.sweet[2] =
		 * "mysore pak"; milk.sweet[3] = "kaju"; milk.products = new String[4];
		 * milk.products[0] = "panner"; milk.products[1] = "milk powder";
		 * milk.products[2] = "cheese"; milk.products[3] = "butter"; milk.market();
		 */
       
		
	}

}
