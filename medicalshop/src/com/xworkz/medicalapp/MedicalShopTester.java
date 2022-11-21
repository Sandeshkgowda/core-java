package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medical.MedicalShop;

public class MedicalShopTester {
	public static void main(String[] args) {
		MedicalShop med = new MedicalShop();
		med.gstNo = "asdhflhj76345347465499";
		med.address = "banglore";
		med.name = "shashi med shop";
		med.staffNames = new String [3];
		med.staffNames[0] = "prashanth ";
		med.staffNames[1] = "sandesh ";
		med.staffNames[2]= " anusha";
		med.staffContactNo = new long[3];
		med.staffContactNo[0] = 876974846l;
		med.staffContactNo[1] = 648745648l;
		med.staffContactNo[2] = 745384956l;
		med.medicneNames = new String[3];
		med.medicneNames[0] = " ciritzen ";
		med.medicneNames[1] = "dolo ";
		med.medicneNames[2] = " cough srup";
		med.cosmetics = new String[3];
		med.cosmetics[0] = "soap ";
		med.cosmetics[1] = "shampoo ";
		med.cosmetics[2] = "setwet ";
		med.noOfSection = new int[3];
		med.noOfSection[0] = 1;
		med.noOfSection[1] = 2;
		med.noOfSection[2] = 3;
		med.billingMethods = new String[3];
		med.billingMethods[0] = "upi";
		med.billingMethods[1] = "cash";
		med.billingMethods[2] = "card";
		med.displayInfo();
		
		
		
		
		
	}

}
