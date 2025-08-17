package day_2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://360homedecor.uk/");
			
//			WebElement serchBox = driver.findElement(By.name("q"));
//			
//			serchBox.sendKeys("360");
//			
//			serchBox.sendKeys(Keys.RETURN);
			
			WebElement Login = driver.findElement(By.id("check_login"));
			
			Login.click();
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
