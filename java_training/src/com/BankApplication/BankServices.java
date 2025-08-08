package com.BankApplication;

public interface BankServices {
	void registerCustomer(Customer customer);
    void deposit(int customerId, double amount);
    void withdraw(int customerId, double amount);
}
