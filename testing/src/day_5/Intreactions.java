package day_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PageMargin;
import org.openqa.selenium.print.PageSize;
import org.openqa.selenium.print.PrintOptions;

public class Intreactions {

	public static void main(String[] args) {

		 WebDriver driver = new ChromeDriver();
		
		try {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ponug\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 driver.navigate().to("https://www.google.com");
		 driver.navigate().to("https://www.selenium.dev/");
		
		 Thread.sleep(3000);
	      driver.navigate().back();
	      Thread.sleep(3000);
	      
	      driver.navigate().forward();
	      Thread.sleep(3000);
	      
	      driver.navigate().refresh();
	      Thread.sleep(3000);
	      
	      
		 //title
	      String title = driver.getTitle();
	      System.out.println(title);
	     //url
	      String url = driver.getCurrentUrl();
	      System.out.println(url);
	      
	     
	      
//	     PrintOptions printOptions = new PrintOptions();
//	     printOptions.setOrientation(PrintOptions.Orientation.PORTRAIT);
//	     System.out.println("current_orientation : " + printOptions.getOrientation());
//     
//	        printOptions.setPageRanges("1-2");
//	        System.out.println("current_range : " + printOptions.getPageRanges());
//	        
//	        printOptions.setPageSize(new PageSize(27.94, 21.59)); 
//	        System.out.println("currentHeight : " + printOptions.getPageSize());
//	        
//	        PageMargin margins = new PageMargin(1.0,1.2,6,1.6);
//	        printOptions.setPageMargin(margins);
//	        System.out.println("top: " + printOptions.getPageMargin().getTop()+ "bottom" + printOptions.getPageMargin().getBottom() + "left" + printOptions.getPageMargin().getLeft() +"right"+ printOptions.getPageMargin().getRight());
//	        
//	        printOptions.setScale(.50);
//	        System.out.println("current_scale : " + printOptions.getScale());
//		 
//		 Thread.sleep(20000);
//		 
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}


