package BankApplication;

public interface BankServices {
	void registerCustomer(Customer customer);
    void deposit(int customerId, double amount);
    void withdraw(int customerId, double amount);
    void showBalance(int customerId);
    void showCustomerDetails(int customerId);
}
