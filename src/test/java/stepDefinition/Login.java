package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login
{
	
ChromeDriver driver;

	
	@Given("Launch Browser")
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    
	}

	@And("maximise browser")
	public void maximiseBrowser() 
	{
		driver.manage().window().maximize();
	    
	}

	@And("load url")
	public void loadUrl() 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	    
	}
	
	@And("set timeout")
	public void setTimeout()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("user enter the username")
	public void userEnterTheUsername() 
	{
		driver.findElementByName("userName").sendKeys("abc@we");
	}

	@And("user enter the password")
	public void userEnterThePassword() 
	{
		driver.findElementByName("password").sendKeys("password");
	}

	@And("user click on signIn button")
	public void userClickOnSignInButton()
	{
		driver.findElementByName("login").click();
	}

	@Then("login should be successful")
	public void loginShouldBeSuccessful()
	{
	    System.out.println("Login Successful...");
	}

}
