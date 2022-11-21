package com.xworkz.bankapp;

public class BankAccount {
	public String name;
	public String ifsc;
	public String brachName;
	public String accountNo;
	public double balance;
	
	public double withDraw(double balance) {
		this.balance =this.balance-balance;
		return this.balance;
		
	}
	public double deposit(double balance) {
		this.balance =this.balance+balance;
		return this.balance;
	}
	
	public void transfer(double amount , BankAccount friendAccount) {
		System.out.println("transfering is started");
		withDraw(amount);
		friendAccount.deposit(amount);
		System.out.println("transfering is done ");
	}

}
