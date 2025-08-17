package day_4;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("props.txt");
            prop.load(fis);

            String url = prop.getProperty("aurl");
            String username = prop.getProperty("ausername");
            String pass = prop.getProperty("apass");

            driver.get(url);
            Thread.sleep(2000);

            driver.findElement(By.id("nav-link-accountList")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("ap_email_login")).sendKeys(username);
            Thread.sleep(2000);
            driver.findElement(By.className("a-button-input")).click();

            driver.findElement(By.id("ap_password")).sendKeys(pass);
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[type='submit']")).click();
            Thread.sleep(2000);

            List<String> products = new ArrayList<>();
	        products.add("laptop");
	        products.add("headphones");
	        products.add("wireless mouse");

	        for (String product : products) {

	        	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        	searchBox.clear();
	        	searchBox.sendKeys(product);
	            driver.findElement(By.id("nav-search-submit-button")).click();
	            driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
	            Thread.sleep(3000);
               
                
            }
	        WebElement cart = driver.findElement(By.className("nav-button-cart"));
	        cart.click();
	        Thread.sleep(3000);
	        
	        

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
