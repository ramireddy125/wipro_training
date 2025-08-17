package day_4;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("props.txt");
			prop.load(fis);
			
			String url = prop.getProperty("furl");
			String username = prop.getProperty("fusername");
			String pass = prop.getProperty("fpass");
			
			driver.get(url);
			Thread.sleep(2000);
			
			driver.findElement(By.id("email")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys(pass);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
