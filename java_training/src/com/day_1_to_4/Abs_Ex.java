package com.day_1_to_4;
import java.util.Scanner;
public class Abs_Ex {

	public static void main(String[] args) {
		
		System.out.println("====payment=====\n");
		
		Abs_Paymet payment;
		payment = new CreditCard();
		payment.pay(1500);
		
		payment = new UpiPayment();
		payment.pay(750);
		
		System.out.println("====area======\n");
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();

        Shape shape = new Circle(radius);

        System.out.println("Area of Circle: " + shape.area());

        sc.close();
       
        System.out.println("====vechile======\n");
        Abs_vechile vehicle1 = new Car();
        vehicle1.startEngine();
        Abs_vechile vehicle2 = new Bike();
        vehicle2.startEngine();
        
        
     
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Choose Notification Type:");
        System.out.println("1.Email");
        System.out.println("2.SMS");
        System.out.println("3.Push Notification");
        System.out.print("Enter your choice: ");
        int choice = sc1.nextInt();
        sc1.nextLine(); 

        System.out.print("Enter the message to send: ");
        String message = sc1.nextLine();

        Notification notification;
      
        switch (choice) {
        case 1:
            notification = new EmailNotification();
            break;
        case 2:
            notification = new SmsNotification();
            break;
        case 3:
            notification = new PushNotification();
            break;
        default:
            System.out.println("Invalid choice.");
            sc1.close();
            return;
        }
        notification.send(message);
        sc1.close();
     
        System.out.println("-------------------");
        
        Remote remote;
        remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
        
        System.out.println("-------------------");
        remote = new ACRemote();
        remote.turnOn();
        remote.turnOff();
        
        sc1.close();

	}

}
