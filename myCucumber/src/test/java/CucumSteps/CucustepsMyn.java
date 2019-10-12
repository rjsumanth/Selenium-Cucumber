package CucumSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucustepsMyn 
{
	WebDriver driver;
	
	@Given("^Open browser and Login page$")
	public void open_browser_and_Login_page() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\seleniumwebdriver\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}
	
	@When("^Enter the (.*) and \"([^\"]*)\"$")
	public void enter_the_and(String une, String pwd) 
	{	
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(une);
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//input[@id='u_0_6']")).click();
	}
	
	@Then("^Successful Login$")
	public void successful_Login() 
	{

	}
	
}
