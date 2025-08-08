package com.day_6;

public class ATMService
{

    public static Users authenticate(Users[] users, int enteredPin)
    	throws InvalidPinException 
    {
        for (Users user : users)
        {
            if (user != null && user.pin == enteredPin)
            {
                return user;
            }
        }
        throw new InvalidPinException("invalid PIN!");
    }

    public static void withdraw(Users user, double amount)
    		throws InsufficientBalanceException  {
        if (amount > user.balance) 
        {
            throw new InsufficientBalanceException("Not enough balance.");
        }
        user.balance -= amount;
        System.out.println("Withdrawal successful. New Balance: ₹" + user.balance);
    }

    public static void deposit(Users user, double amount)
    {
        user.balance += amount;
        System.out.println("Deposit successful. New Balance: ₹" + user.balance);
    }
}
