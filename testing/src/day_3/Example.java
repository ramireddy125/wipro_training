package day_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example {

		public static void main(String[] args) {
			
			 WebDriver driver = new ChromeDriver();
			
			try {

			 driver.get("https://www.google.com");
			 Thread.sleep(2000);
			 
			 driver.get("https://www.youtube.com");
			 Thread.sleep(2000);
			 
			 driver.get("https://www.facebook.com");
			 Thread.sleep(2000);
			 
			 driver.get("https://www.instagram.com");
			 Thread.sleep(2000);
			 
			 driver.quit();
			 
			 
			 
			}catch(Exception e) {
				e.printStackTrace();
			}

		}

}



