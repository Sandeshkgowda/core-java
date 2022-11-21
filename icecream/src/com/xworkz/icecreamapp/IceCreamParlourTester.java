package com.xworkz.icecreamapp;

import com.xworkz.icecreamapp.icecream.IceCreamParlour;

public class IceCreamParlourTester {
	public static void main(String[] args) {
		String iceCreamType[] = new String [4];
		iceCreamType[0] = "cone type";
		iceCreamType[1] = "family pack";
		iceCreamType[2] = "chocho bar";
		iceCreamType[3] = "cup cake";
		String flavour[] = new String[6];
		flavour[0] = "butterscoh";
		flavour[1] = "blackcurrent";
		flavour[2] = "mixed fruit";
		flavour[3] = "pista";
		flavour[4] = "choclate";
		flavour[5] = "rajbhog";
		String size[] = new String[3];
		size[0] = "small";
		size[1] = "large";
		size[2] = "medium";
		IceCreamParlour ice = new IceCreamParlour("meraki","channapatana", iceCreamType,flavour,size);
		ice.taste();
	}
	
}
