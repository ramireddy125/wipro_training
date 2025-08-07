package wipro;

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



