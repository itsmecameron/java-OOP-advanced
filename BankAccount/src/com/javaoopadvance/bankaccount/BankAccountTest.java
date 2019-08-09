package com.javaoopadvance.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.println(b.getAccountNumber());
		
		b.deposit("checking", 500.0);
		b.deposit("savings", 10.0);
		
		System.out.println(b.getChecking());
		System.out.println(b.getSavings());		
		System.out.println(BankAccount.getTotal());		
		System.out.println(BankAccount.getNumberOfAccounts());		
	}
}
