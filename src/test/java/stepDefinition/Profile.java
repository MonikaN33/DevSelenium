package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Profile 
{

	ChromeDriver driver;
	
	@Given("Launch Browser2")
	public void launchBrowser2() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    
	}

	@And("maximise browser2")
	public void maximiseBrowser2() 
	{
		driver.manage().window().maximize();
	    
	}

	@And("load url2")
	public void loadUrl2() 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	    
	}
	
	@And("set timeout2")
	public void setTimeout2()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("user enter the username2")
	public void userEnterTheUsername2() 
	{
		driver.findElementByName("userName").sendKeys("abc@we");
	}

	@And("user enter the password2")
	public void userEnterThePassword2() 
	{
		driver.findElementByName("password").sendKeys("password");
	}

	@And("user click on signIn button2")
	public void userClickOnSignInButton2()
	{
		driver.findElementByName("login").click();
	}

	@Then("login should be successful")
	public void loginShouldBeSuccessful()
	{
	    System.out.println("Login Successful...");
	}
	
	@Then("user should be able to click profile option")
	public void userShouldBeAbleToClickProfileOption()
	{
	    System.out.println("Currently on profile page...");
	}

	@And("user should be able to give first name")
	public void userShouldBeAbleToGiveFirstName() 
	{
		driver.findElementByName("firstName").sendKeys("Monika");
	}

	@And("user should be able to give last name")
	public void userShouldBeAbleToGiveLastName()
	{
		driver.findElementByName("lastName").sendKeys("Gupta");
	}

	@And("user should be able to give phone number")
	public void userShouldBeAbleToGivePhoneNumber()
	{
		driver.findElementByName("phone").sendKeys("123456789");
	}
}
