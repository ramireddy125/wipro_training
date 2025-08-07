package BankApplication;

public class Customer {
    private String name;
    private int id;
    private Account account;

    public Customer(int id, String name, Account account) {
        this.name = name;
        this.id = id;
        this.account = account;
    }

    public void displayDetails() {
        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        account.showBalance();
    }

    public int getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }
}