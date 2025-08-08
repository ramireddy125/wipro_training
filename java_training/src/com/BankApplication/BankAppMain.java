package com.BankApplication;

public class BankAppMain {
	
	 public static void main(String[] args) {

	        BankServices bankService = new BankServicelmpl();

	        Account acc1 = new Account(101, 5000);
	        Account acc2 = new Account(102, 10000);

	        Customer c1 = new Customer(1, "Venkat", acc1);
	        Customer c2 = new Customer(2, "Ram", acc2);

	        bankService.registerCustomer(c1);
	        bankService.registerCustomer(c2);

	        System.out.println("\n--- Initial Details ---");
	        c1.displayDetails();
	        c2.displayDetails();

	        System.out.println("\n--- Depositing ---");
	        bankService.deposit(1, 2000);
	        bankService.deposit(2, 500);

	        System.out.println("\n--- Withdrawing ---");
	        bankService.withdraw(1, 3000);
	        bankService.withdraw(2, 12000);

	        System.out.println("\n--- Final Details ---");
	        c1.displayDetails();
	        c2.displayDetails();
	    }

}
