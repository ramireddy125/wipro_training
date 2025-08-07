package com.day_6;
import java.util.Scanner;

public class ExamRegistreation {
	public static void Age(int age) throws Exception
	{
        if (age < 18) 
        {
            throw new Exception("Age must be 18 or above to register.");
        }
    }
	public static void Email(String email) throws Exception
	{
        if (!email.contains("@")) 
        {
            throw new Exception("invalid email");
        }
    }
	public static void Fee(double pay) throws Exception
	{
        if (pay!=500) 
        {
            throw new Exception("res fee is 500");
        }
    }
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("=====Exam Registration =====");
			System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter registration fee (₹): ");
            double fee = scanner.nextDouble();
            
            Age(age);
            Email(email);
            Fee(fee);
            
            System.out.println("Registration Successful! Welcome" + name);
		} catch (Exception e) {
            System.out.println("Registration Failed: " + e.getMessage());
        } finally {
            System.out.println("Registration process completed.");
            scanner.close();
        }

	}

}
