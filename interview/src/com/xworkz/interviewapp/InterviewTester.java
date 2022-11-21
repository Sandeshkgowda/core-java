package com.xworkz.interviewapp;

public class InterviewTester {
	public static void reverse(String data) {
		char newData[] = data.toCharArray();
		
		  for (int i = 0; i < newData.length; i++) { 
			  System.out.println(newData[i] +" ");
			  	}
		 
		/*
		 * for (int i = newData.length -1; i >= 0; i--) { System.out.println(newData[i]+
		 * " "); }
		 */
	}
	public static void main(String arg[]) {
		reverse("sandesh");
	}

}
