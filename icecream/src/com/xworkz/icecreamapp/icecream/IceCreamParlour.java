package com.xworkz.icecreamapp.icecream;

public class IceCreamParlour {
	public String name;
	public String address;
	public String iceCreamType[];
	public String flavour[];
	public String size[];
	
	public IceCreamParlour(String name,String address,String iceCreamType[],String flavour[],String size[] ) {
		this.name = name;
		this.address = address;
		this.iceCreamType = iceCreamType;
		this.flavour = flavour;
		this.size = size;	
	}
	public void taste() {
		System.out.println("welome to the shop");
		System.out.println("the name of the shop "+ name);
		System.out.println("the address of the shop "+ address);
		System.out.println(" ");
		for (int i = 0; i < iceCreamType.length; i++) {
			System.out.println("the type of iceCream are "+ iceCreamType[i]);
		}
		System.out.println(" ");
		for (int i = 0; i < flavour.length; i++) {
			System.out.println("the flavour of iceCream are "+ flavour[i]);
		}
		System.out.println(" ");
		for (int i = 0; i < size.length; i++) {
			System.out.println("the size of iceCream are "+ size[i]);
		}
		System.out.println("thank u visit again");
	}

}
