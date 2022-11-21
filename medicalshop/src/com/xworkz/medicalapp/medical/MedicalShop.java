package com.xworkz.medicalapp.medical;

public class MedicalShop {
	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long staffContactNo[];
	public String medicneNames[];
	public String cosmetics[];
	public int noOfSection[];
	public String billingMethods[];
	
	public MedicalShop() {
		System.out.println("medical constructer is invoked");
	}
	public void displayInfo() {
		System.out.println("medical name is " + name);
		System.out.println("##########################################");
		System.out.println("medical address is "+ address);
		System.out.println("##########################################");
		System.out.println("GSTNo is "+ gstNo);
		System.out.println("##########################################");
		for (int i = 0; i <staffNames.length; i++) {
			System.out.println("staffNmaes are "+ staffNames[i]);
		}
		System.out.println("##########################################");
		for (int i = 0; i <staffContactNo .length; i++) {
			System.out.println("staffContactNo are "+ staffContactNo[i]);
		}
		System.out.println("##########################################");
		for (int i = 0; i <medicneNames .length; i++) {
			System.out.println("medicnenames are "+ medicneNames[i]);
	}
		System.out.println("##########################################");
		

}
}
