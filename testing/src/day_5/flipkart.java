package day_5;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
        	Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("props.txt");
            prop.load(fis);

            String url = prop.getProperty("furl");
            String username = prop.getProperty("fusername");
         
        	driver.get(url);
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[2]/div[2]/div/div/div[1]/div/a/span")).click();
        	driver.findElement(By.className("r4vIwl")).sendKeys(username);
        	driver.findElement(By.className("QqFHMw")).click();
        	Thread.sleep(10000);
        	
//        	driver.get("https://www.flipkart.com/");
        	
            List<String> products = new ArrayList<>();
 	        products.add("laptop");
 	        products.add("headphones");
 	        products.add("wireless mouse");
 	        
 	       for (String product : products) {

 	    	  WebElement searchBox = driver.findElement(By.className("q"));
              searchBox.clear();
              searchBox.sendKeys(product);
              searchBox.submit();
              Thread.sleep(4000);
              
              WebElement firstProduct = driver.findElement(By.className("_75nlfW"));
              firstProduct.click();
              Thread.sleep(3000);
              
              WebElement addToCart = driver.findElement(By.className("QqFHMw"));
              addToCart.click();
              Thread.sleep(3000);

              driver.get(url);
              Thread.sleep(3000);
               
           }
 	       
 	      WebElement cart = driver.findElement(By.className("_9Wy27C"));
          cart.click();
          Thread.sleep(3000);

        	
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
