package com.xworkz.ascendingapp;

public class AscendingOrder {
	public static void main(String[] args) {

		int numbers[] = new int[] { 8, 55, 9, 32, 12, 19 };
		int index = 0;
		System.out.println("the original value");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					index = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = index;
				}
			}
		}
		System.out.println("the ascending value"); 
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");

		}
	}
}
