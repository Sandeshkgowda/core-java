package com.xworkz.carromapp.carrom;

public class CarromBoard {
	public int id;
	public String name;
	public String size;
	public int pans[] = new int[9];
	
	public CarromBoard() {
		System.out.println("the comstructer is invoked");
	}
	
	public CarromBoard(int pans[]) {
		this(333,"winner","26 inch",pans);
		System.out.println("one parameterized contructer is called");
	}
	
	public CarromBoard(int id, String name,String size,int[] pans) {
		this();
		System.out.println("calling 4 parameter contructer");
		this.name=name;
		this.id=id;
		this.size=size;
		this.pans=pans;
	}
	
	public void gaming() {
		System.out.println("banni adona");
	}
	
	public void didplayInfo() {
		System.out.println("display info is invoked");
		System.out.println(this.id+" "+ this.name+" "+this.size);
		for (int i = 0; i < pans.length; i++) {
			System.out.println(pans[i]);
		}
	}

}
