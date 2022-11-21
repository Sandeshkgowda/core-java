package com.xworkz.milkapp.milk;

public class MilkParlour {
	public String name;
	public String address;
	public String types[];
	public String sweet[];
	public String products[];
	public MilkParlour(String name, String address,String types[],String sweet[],String products[]) {
		this.name = name;
		this.address = address;
		this.types = types;
		this.sweet = sweet;
		this.products = products;
	}
	public void market() {
		System.out.println("the name of parlour is "+ name);
		System.out.println(" ");
		System.out.println("the address of parlour is "+ address);
		System.out.println(" ");
		for (int i = 0; i < types.length; i++) {
			System.out.println("the milk types are "+types[i]);
		}
		System.out.println(" ");
		for (int i = 0; i < sweet.length; i++) {
			System.out.println("the types of sweets are "+sweet[i]);
		}
		System.out.println(" ");
		for (int i = 0; i < products.length; i++) {
			System.out.println("the milk products are "+products[i]);
		}
		System.out.println("thank u visit again- ");
	
	}

}
