package day_4;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class GmaiLogin {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("props.txt");
            prop.load(fis);

            String url = prop.getProperty("gurl");
            String username = prop.getProperty("gusername");
            String pass = prop.getProperty("gpass");

            driver.get(url);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.findElement(By.id("identifierId")).sendKeys(username);
            driver.findElement(By.id("identifierNext")).click();


            WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='password']")));
            password.sendKeys(pass);
            driver.findElement(By.id("passwordNext")).click();

         

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
