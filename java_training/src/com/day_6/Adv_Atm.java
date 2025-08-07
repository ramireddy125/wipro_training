package com.day_6;

import java.util.Scanner;

public class Adv_Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Users[] users = new Users[3];
        users[0] = new Users(1234, 5000);
        users[1] = new Users(5678, 8000);
        users[2] = new Users(9999, 10000);

        boolean run = true;

        while (run) 
        {
            System.out.println("Please insert your card (Y/N): ");
            String insert = sc.next().toUpperCase();

            if (!insert.equals("Y")) 
            {
                System.out.println("Card not inserted. Try again.");
                continue;
            }

            int attempts = 3;
            Users currentUser = null;

            while (attempts > 0)
            {
                System.out.print("Enter your PIN: ");
                int enteredPin = sc.nextInt();

                try 
                {
                    currentUser = ATMService.authenticate(users, enteredPin);
                    break;
                } catch (InvalidPinException e) 
                {
                    attempts--;
                    System.out.println(e.getMessage() + " Attempts left: " + attempts);
                }
            }

            if (currentUser == null) 
            {
                System.out.println("Card blocked.");
                continue;
            }

            boolean session = true;
            while (session) {
                System.out.println("\n--- ATM Services ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: ₹" + currentUser.balance);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wAmt = sc.nextDouble();
                        try {
                            ATMService.withdraw(currentUser, wAmt);
                        } catch (InsufficientBalanceException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double dAmt = sc.nextDouble();
                        ATMService.deposit(currentUser, dAmt);
                        break;
                    case 4:
                        System.out.println("Thank you!");
                        session = false;
                        break;
                    default:
                        System.out.println("invalid choice.");
                }
            }

            System.out.println("Session ended.\n");
        }

        sc.close();
    }
}
