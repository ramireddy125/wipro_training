package com.day_6;
import java.util.Scanner;

public class ATMCard {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        final int correctPIN = 1234;
        
        System.out.println("Insert atm card");
        
        try 
        {
        	System.out.println("enter 4-digit pin");
        	int EnterPin= scanner.nextInt();
        	if(EnterPin != correctPIN)
        	{
        		throw new Exception("incrt pin");
             }
        	System.out.println("Welcom!");
        }
        catch(Exception e) 
        {
        	System.out.println(e.getMessage());
        }
        finally 
        {
        	System.out.println("trantion logged.Thank you!");
        	scanner.close();
        }

	}

}
