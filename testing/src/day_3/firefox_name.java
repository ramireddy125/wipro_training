package day_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class firefox_name {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ponug\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
        
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.youtube.com/");
        
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        
        System.out.println("Browser Name: " + caps.getBrowserName());
        System.out.println("Browser Version: " + caps.getBrowserVersion());
        
        System.out.println("Title: " + driver.getTitle());
        Thread.sleep(2000);       
        driver.quit();
    }
}
