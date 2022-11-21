package com.xworkz.medicalapp.medical;

public class MedicalShop1 {
		public String gstNo;
		public String address;
		public String name;
		public String staffNames[];
		public long staffContactNo[];
		public String medicneNames[];
		public String cosmetics[];
		public int noOfSection;
		public String billingMethods[];
		
		public MedicalShop1() {
			
			System.out.println("AAAA");
		}
		public MedicalShop1(String gstNo,String address,String name,String staffNames[], long staffContactNo[],  String medicneNames[],String cosmetics[],int noOfSection,String billingMethods[] ) {
			this.gstNo = gstNo;
			this.address = address;
			this.name = name;
			this.staffNames = staffNames;
			this.staffContactNo = staffContactNo;
			this.medicneNames = medicneNames;
			this.cosmetics = cosmetics;
			this.noOfSection = noOfSection;
			this.billingMethods = billingMethods;
		}
		public void displayInfo() {
			System.out.println("banni medicine tagole");
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


