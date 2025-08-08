package com.day_1_to_4;

abstract class Abs_Paymet 
{
	abstract void pay(double amount);
}

class CreditCard extends Abs_Paymet
{
	void pay(double amount) 
	{
		System.out.println("Paid" + amount + "using Credit Card.");
	}
}
class UpiPayment extends Abs_Paymet
{
	void pay(double amount) 
	{
		System.out.println("Paid ₹" + amount + " using UPI.");
	}
}
