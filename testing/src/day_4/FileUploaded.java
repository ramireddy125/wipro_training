package day_4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class FileUploaded {
 
	public static void main(String[] args)
	{
 
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Wipro\\SeleniumDemo\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		try
		{
			driver.get("http://the-internet.herokuapp.com/upload ");
			File uploadFile=new File("C:\\Users\\ponug\\Desktop\\resume\\Ponugoti Venkata RamiReddy resume.pdf");
			WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());
			driver.findElement(By.id("file-submit")).click();
			String resultText= driver.findElement(By.id("uploaded-files")).getText();
			
			System.out.println("Uploaded: " +resultText);
		}
		finally
		{
			driver.quit();
		}
		
	}
 
}
