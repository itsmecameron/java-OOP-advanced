package com.javaoopadvance.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double savings;
	private double checking;
	//static variable exist in the class level
	private static int numberOfAccounts = 0;
	private static double total = 0;
	
	public BankAccount() {
		this.accountNumber = this.generateAccountNumber();
		numberOfAccounts++;
	}
	public double deposit(String accountType, double amount) {
		if (accountType.equals("checking")) {
			this.checking += amount;
			total += amount;
			return this.checking;
		}else {
			this.savings += amount;
			total += amount;
			return this.savings;
		}
	}
	
	public double withdraw(String accountType, double amount) {
		if (accountType.equals("checking")) {
			if(amount <= this.checking) {
				this.checking -= amount;
				total -= amount;
				return this.checking;
			}else {
				return this.checking;
			}
		}else {
			if(amount <= this.savings) {
				this.savings -= amount;
				total -= amount;
				return this.savings;
			}else {
				return this.savings;				
			}
		}
	}
	//getter and setters
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getSavings() {
		return savings;
	}

	public double getChecking() {
		return checking;
	}
 
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static double getTotal() {
		return total;
	}
	
	private String generateAccountNumber() {
		String acc ="";
		Random r =new Random();
		
		for (int i = 0; i< 10; i++) {
			//valueOf changes a int to a string
			acc += String.valueOf(r.nextInt(9));
		}
		return acc;
	}
}
