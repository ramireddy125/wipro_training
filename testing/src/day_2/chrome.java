package day_2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chrome {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		
		try {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ponug\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		 driver.get("https://www.google.com");
	     
		 System.out.println("Title: " + driver.getTitle());
		 
		 Thread.sleep(20000);
		 
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
