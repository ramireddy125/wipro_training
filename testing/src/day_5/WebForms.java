package day_5;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebForms {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://360homedecor.uk/book-appointment");
		Thread.sleep(2000);
	
		WebElement Dropdowns = driver.findElement(By.id("choose_branch"));
		Select dropdown = new Select(Dropdowns);
		dropdown.selectByVisibleText("Veneer");
		Thread.sleep(2000);
		
		WebElement styles = driver.findElement(By.id("choose_style"));
		Select style = new Select(styles);
		style.selectByVisibleText("Luxury");
		Thread.sleep(2000);
		
		driver.findElement(By.id("first_name")).sendKeys("Venkat");
		Thread.sleep(2000);
		driver.findElement(By.id("last_name")).sendKeys("ram");
		Thread.sleep(2000);
		driver.findElement(By.id("apt_city")).sendKeys("Hyd");
		Thread.sleep(2000);
		driver.findElement(By.id("phone_number")).sendKeys("8074474298");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("vvss143227@gmail.com");
		Thread.sleep(2000);
		
		WebElement file = driver.findElement(By.id("layoutFiles"));
		File files = new File("C:\\Users\\ponug\\Downloads\\intern project report[1].docx");
		file.sendKeys(files.getAbsolutePath());
		Thread.sleep(3000);
		
		WebElement checkbox= driver.findElement(By.id("privacyPolicy"));
		
		  if (!checkbox.isSelected())
		  {
              checkbox.click();
          }
		
		driver.findElement(By.cssSelector("button[type = submit]")).submit();
		
		Thread.sleep(4000);
		
		System.out.println("submitted");

	
		driver.quit();
	}

}
