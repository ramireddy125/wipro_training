package wipro;
import java.util.Scanner;

public class ATM_tracker {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int balance = 0;
	        int choice;

	        do {
	            System.out.println("\n1. Add Balance");
	            System.out.println("2. View Balance");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            if (choice == 1) {
	                System.out.print("Enter amount to add: ");
	                int amt = sc.nextInt();
	                balance += amt;
	                System.out.println("₹" + amt + " added successfully.");
	            }

	            else if (choice == 2) {
	                System.out.println("Current Balance: ₹" + balance);
	            }
	            else if (choice == 3) {
	                System.out.print("Enter amount to withdraw: ");
	                int amt = sc.nextInt();
	                if (amt > balance) {
	                    System.out.println("Insufficient balance.");
	                } else {
	                    balance -= amt;
	                    System.out.println("Withdrawal successful: ₹" + amt);
	                    System.out.println("Available Balance: ₹" + balance);
	                }
	            }

	        } while (choice != 4);{

	        System.out.println("Thank you! ATM session ended.");
	        }
	        sc.close();



	}

}
