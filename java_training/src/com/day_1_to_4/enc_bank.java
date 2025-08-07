package com.day_1_to_4;

public class enc_bank {
	
	 private double balance;
	 
	 public void setBalance(double balance)
	 {
		 this.balance= balance;
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
	 
	 public void deposit(double amount) 
	 {
	        if (amount > 0) 
	        {
	            setBalance(getBalance() + amount);
	        } 
	        else
	        {
	            System.out.println("Invalid deposit amount.");
	        }
	  }
	 
	 public void withdraw(double amount)
	 {
	        if (amount > 0 && amount <= getBalance()) 
	        {
	            setBalance(getBalance() - amount);
	        } 
	        else 
	        {
	            System.out.println("insufficient funds");
	        }
	    }
	 

	public static void main(String[] args) {
		

	}

}
