package day_5;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
        	Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("props.txt");
            prop.load(fis);

            String url = prop.getProperty("myurl");
            String username = prop.getProperty("myusername");
            String pass = prop.getProperty("mypass");

        	driver.get(url);
        	Thread.sleep(2000);
        	
        	driver.findElement(By.className("mobileNumberInput")).sendKeys(username);
        	driver.findElement(By.className("consentCheckbox")).click();
        	driver.findElement(By.className("submitBottomOption")).click();
        	
        	
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }

	}

}
