package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medical.MedicalShop1;

public class MedicalShop1Tester {
	public static void main(String[] args) {
		
		String staffNames[] = new String [3];
		staffNames[0] = "prashanth ";
		staffNames[1] = "sandesh ";
		staffNames[2]= " anusha";
		long staffContactNo []= new long[3];
		staffContactNo[0] = 876974846l;
		staffContactNo[1] = 648745648l;
		staffContactNo[2] = 745384956l;
		String medicneNames[] = new String[3];
        medicneNames[0] = " ciritzen ";
		medicneNames[1] = "dolo ";
		medicneNames[2] = " cough srup";
		String cosmetics[] = new String[3];
		cosmetics[0] = "soap ";
		cosmetics[1] = "shampoo ";
		cosmetics[2] = "setwet ";
		String billingMethods[] = new String[3];
		billingMethods[0] = "upi";
		billingMethods[1] = "cash";
		billingMethods[2] = "card";
		MedicalShop1 med =new  MedicalShop1("asdhflhj76345347465499", "banglore","shashi med shop",staffNames,staffContactNo,medicneNames, cosmetics,3,billingMethods);
		med.displayInfo();
	}

}
