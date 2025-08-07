package BankApplication;

public class Account 
{
	private int accNo;
	private double balance;
	
	public Account (int accNo, double balance)
	{
		this.accNo = accNo;
		this.balance= balance;
	}
	
	public void deposit(double amount) 
	{
        balance += amount;
        System.out.println("₹" + amount + " deposited.");
    }
	 public void withdraw(double amount)
	 {
	     if (amount <= balance) 
	     {
	          balance -= amount;
	          System.out.println("₹" + amount + " withdrawn.");
	      } else 
	      {
	          System.out.println("Insufficient balance.");
	      }
	 }
	 public void showBalance()
	 {
	     System.out.println("Account Number: " + accNo + "Balance: ₹" + balance);
	 }
	 public int getAccNo() {
		 return accNo;
	 }
	 public double getBalance() {
		 return balance;
	 }
	

}
