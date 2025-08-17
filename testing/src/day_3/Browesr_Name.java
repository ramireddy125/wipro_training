package day_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Browesr_Name {
	
	    public static void main(String[] args) throws InterruptedException {
	        
	    	System.setProperty("webdriver.edge.driver", "C:\\Users\\ponug\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	        EdgeOptions options = new EdgeOptions();
	        options.addArguments("--start-maximized");
	        
	        WebDriver driver = new EdgeDriver(options);
	        
	        driver.get("https://www.youtube.com/");
	        
	        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
	        String name   = caps.getBrowserName();
			String version = caps.getBrowserVersion();
			 
			System.out.println(name);
			System.out.println(version);
	        
	        System.out.println("Title: " + driver.getTitle());
	        
	        Thread.sleep(2000);
	     
	        
	        driver.quit();
	    }
}


