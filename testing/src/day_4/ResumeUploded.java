package day_4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ResumeUploded {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
				try
				{
					Properties prop = new Properties();
					FileInputStream fis = new FileInputStream("props.txt");
					prop.load(fis);
					
					String url = prop.getProperty("url");
					String username = prop.getProperty("username");
					String password = prop.getProperty("password");
					String resumePath = prop.getProperty("resume");
					
					driver.get(url);
					Thread.sleep(2000);
					
					driver.findElement(By.id("usernameField")).sendKeys(username);;
				    driver.findElement(By.id("passwordField")).sendKeys(password);
				    driver.findElement(By.cssSelector("button[type='submit']")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.className("nI-gNb-drawer__icon")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.className("nI-gNb-info__sub-link")).click();
					Thread.sleep(2000);
					
					WebElement resumebtn = driver.findElement(By.className("secondary-content"));

					File resume = new File(resumePath);
					resumebtn.sendKeys(resume.getAbsolutePath());
					Thread.sleep(3000);
					 
					 
					System.out.println("file name:" + resume.getName());
					Thread.sleep(2000);
					
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				finally
				{
					driver.quit();
				}
				
		 }
}

