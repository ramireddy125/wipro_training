package day_4;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("props.txt");
			prop.load(fis);
			
			String url = prop.getProperty("yurl");
			String username = prop.getProperty("yusername");
			String pass = prop.getProperty("ypass");
			
			driver.get(url);
			Thread.sleep(2000);
			
			driver.findElement(By.id("login-username")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			
			driver.findElement(By.id("login-passwd")).sendKeys(pass);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			
		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


}


