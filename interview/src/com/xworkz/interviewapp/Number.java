package com.xworkz.interviewapp;

public class Number {
	public static void findLargestAndSmallestNumber(int a[]) {
		int smallest = a[0];
		int largest = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}
				else if (a[i] <smallest) {
					smallest = a[i];
				}
			}
			System.out.println("the largest number is "+ largest);
			System.out.println("the smallest number is "+smallest);
			
		}
	public static void main(String arg[]) {
		int a[] = {33,66,44,345,8,3,7};
		findLargestAndSmallestNumber(a);
	}
	}


