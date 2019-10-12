package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps2 
{
    WebDriver dr;
    
	
	@Given("^Open browser and Login page$")
	public void open_browser_and_Login_page() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumwebdriver\\driver\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.facebook.com"); 
	}

	@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String arg1, String arg2)
	{
	  dr.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
	  dr.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg2);
	  dr.findElement(By.xpath("//input[@id='u_0_6']")).click();
	}

	@Then("^Successfully login$")
	public void successfully_login() 
	{

	}

}
