package day_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {
    public static void main(String[] args) throws InterruptedException {
        
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\ponug\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://www.youtube.com/");
        
        System.out.println("Title: " + driver.getTitle());
        
        Thread.sleep(2000);
        
        
        
        
        
      driver.quit();
    }
}