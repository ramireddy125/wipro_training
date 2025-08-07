package wipro;

public class Book_Details {
	String title;
    String author;
    double price;
    
    
    void addBook(String bookTitle, String bookAuthor, double bookPrice)
    {
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
    }
    
    void displayBook()
    {
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }

	public static void main(String[] args) {
		Book_Details b=new Book_Details();
		b.addBook("java", "venkat", 110);
		b.displayBook();
	}

}
