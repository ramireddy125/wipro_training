package day_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ponug\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.youtube.com/");
        
        System.out.println("Title: " + driver.getTitle());
        Thread.sleep(2000);       
        driver.quit();
    }
}
