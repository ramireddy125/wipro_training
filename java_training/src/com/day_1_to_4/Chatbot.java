package com.day_1_to_4;
import java.util.Scanner;

public class Chatbot {
	
	String getResponse(String msg) 
	{
		if (msg.equals("hi") || msg.equals("hello")) {
            return "Hello venkat!";
        } 
		else if (msg.equals("what is your name")) 
		{
            return "I’m ChatBot";
        } 
		else if (msg.equals("help"))
		{
            return "how can help you";
        } 
		else
		{
            return "Sorry, I didn’t understand that.";
        }
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Chatbot b = new Chatbot();
		 String userinput;
		 
		 System.out.println("bot: Hello this is chat bot");
		 do 
		 {
	            System.out.print("You: ");
	            userinput = sc.nextLine();
	            String reply = b.getResponse(userinput);
	            System.out.println("ChatBot: " + reply);
	       
		 } 
		 while (!userinput.equals("bye"));
		 sc.close();
		 

	}

}
