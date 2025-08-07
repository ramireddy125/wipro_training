package com.day_1_to_4;

import java.util.Scanner;

public class poly_Ex {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter message to send:");
        String message = scanner.nextLine();

        System.out.println("Choose message type (1 - Email, 2 - SMS):");
        int choice = scanner.nextInt();

        MessageSender sender;
        if (choice == 1) 
        {
            sender = new EmailSender();
        } else if (choice == 2)
        {
            sender = new SMSSender();
        } else 
        {
            System.out.println("Invalid");
            sender = new MessageSender();
        }

        sender.sendMessage(message);

        scanner.close();
	}

}
