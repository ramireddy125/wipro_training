package com.BankApplication;

public class BankServicelmpl implements BankServices {
	private Customer[] customers = new Customer[10];
    private int count = 0;

    public void registerCustomer(Customer customer) {
    	
        if (count < customers.length) 
        {
            customers[count++] = customer;
            System.out.println("Customer registered successfully.");
        } else 
        {
            System.out.println("Customer list full. Cannot register more.");
        }
    }
    
    public void deposit(int customerId, double amount) 
    {
        boolean found = false;
        for (int i = 0; i < count; i++)
        {
            if (customers[i].getId() == customerId)
            {
                customers[i].getAccount().deposit(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Customer not found.");
        }
    }
    
    public void withdraw(int customerId, double amount)
    {
        boolean found = false;
        for (int i = 0; i < count; i++) 
        {
            if (customers[i].getId() == customerId) 
            {
                customers[i].getAccount().withdraw(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Customer not found.");
        }
    }

    public void showAllCustomers() 
    {
        for (int i = 0; i < count; i++) 
        {
            customers[i].displayDetails();
        }
    }

    
    

}
