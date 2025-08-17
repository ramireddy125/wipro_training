package day_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrome {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ponug\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 driver.get("https://www.google.com");
		 
		 Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		 
		 String name   = caps.getBrowserName();
		 String version = caps.getBrowserVersion();
		 
		 System.out.println(name);
		 System.out.println(version);
		 System.out.println(caps.getPlatformName());
		 
		 System.out.println(caps.getCapability(null));
		 
		 
		 System.out.println("Title: " + driver.getTitle());


	}

}
