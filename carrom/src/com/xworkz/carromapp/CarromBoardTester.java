package com.xworkz.carromapp;

import com.xworkz.carromapp.carrom.CarromBoard;

public class CarromBoardTester {
		public static void main(String[] args) {
			int pans[] = {1,2,3,4,5,6,7,8};
			/*
			 * PetrolBunk pet = new PetrolBunk(345,"pallive","ramanagara",workerName);
			 * System.out.println(pet.id+" "+ pet.name+" "+pet.place+" "+ workerName);
			 */
			CarromBoard carr = new CarromBoard(pans);
			carr.didplayInfo();
			}


}

