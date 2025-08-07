package wipro;
import java.util.Scanner;

public class Methods_usecases {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double balance =0;
		
		int choice;
		do {
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Check Balance");
            System.out.println("4 Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice) 
            {
            case 1:
            	 System.out.print("Enter amount to deposit:");
                 double depositAmount = sc.nextDouble();
                 balance += depositAmount;
                 System.out.println("₹" + depositAmount + " deposited successfully.");
                 break;
                 
            case 2:
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount <= balance) 
                {
                    balance -= withdrawAmount;
                    System.out.println( withdrawAmount + " withdrawn successfully.");
                }
                else 
                {
                    System.out.println("Insufficient balance!");
                }
                
                break;
                
            case 3:
            	
                System.out.println("Current Balance: ₹" + balance);
                break;

            default:
            	
                System.out.println("Invalid choice! Please select correct option.");
            
            }
		}while(choice!=4); {
			System.out.println("seassion time out! try again!");
			
		}
		sc.close();
		

	}

}
