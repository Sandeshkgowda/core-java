package com.xworkz.bankapp.bank;

import com.xworkz.bankapp.BankAccount;

public class BankAccountTester {
	public static void main(String[] args) {	
		BankAccount acc = new BankAccount();
		acc.deposit(5000.00);
		System.out.println("my account balance" + acc.balance);
		
		
		BankAccount friendAccount = new BankAccount();
		friendAccount.deposit(700);
		System.out.println("friend account balance is "+ friendAccount.balance);
		acc.transfer(700, friendAccount);
		System.out.println("my account balance is "+ acc.balance);
		System.out.println("friend account balance is " + friendAccount.balance);
		
		/*
		 * double withDrawAmount = acc.withDraw(400);
		 * System.out.println("thank u "+withDrawAmount);
		 */
		
		
	}

}
