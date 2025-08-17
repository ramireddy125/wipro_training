package day_4;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("props.txt");
			prop.load(fis);
			
			String url = prop.getProperty("iurl");
			String username = prop.getProperty("iusername");
			String pass = prop.getProperty("ipass");
			
			driver.get(url);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pass);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]")).click();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
