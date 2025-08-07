package com.day_1_to_4;

class MessageSender 
{
	void sendMessage(String message) 
	{
        System.out.println("Sending message: " + message);
    }

}
class EmailSender extends MessageSender
{
    void sendMessage(String message) 
    {
        System.out.println("Sending Email: " + message);
    }
}
class SMSSender extends MessageSender 
{
    void sendMessage(String message) 
    {
        System.out.println("Sending SMS: " + message);
    }
}



