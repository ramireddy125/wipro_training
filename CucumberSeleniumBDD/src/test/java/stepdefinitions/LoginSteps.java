package stepdefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

	WebDriver driver;

	@Given("I open Amazon login page")
	public void i_open_amazon_login_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	}

	@When("I enter UserName and password")
    public void user_enters_valid_credentials() {
        driver.findElement(By.name("email")).sendKeys("ponugoti1122@gmail.com");  
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Venkat1122@"); 
    }

	@When("I click on login button")
	public void i_click_on_login_button() 
	{
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("I redirected to the HomePage")
	public void i_should_be_redirected_to_the_homepage() 
	{
		String title = driver.getTitle();
		if (title.contains("Amazon")) {
			System.out.println("login successful");
		} else {
			System.out.println("login failed");
		}
		driver.quit();
	}

}
