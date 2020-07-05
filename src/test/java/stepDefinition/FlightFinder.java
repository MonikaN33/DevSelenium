package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightFinder
{
	
	ChromeDriver driver;
	
	@Given("Launch Browser1")
	public void launchBrowser1() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    
	}

	@And("maximise browser1")
	public void maximiseBrowser1() 
	{
		driver.manage().window().maximize();
	    
	}

	@And("load url1")
	public void loadUrl1() 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	    
	}
	
	@And("set timeout1")
	public void setTimeout1()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("user enter the username1")
	public void userEnterTheUsername1() 
	{
		driver.findElementByName("userName").sendKeys("abc@we");
	}

	@And("user enter the password1")
	public void userEnterThePassword1() 
	{
		driver.findElementByName("password").sendKeys("password");
	}

	@And("user click on signIn button1")
	public void userClickOnSignInButton1()
	{
		driver.findElementByName("login").click();
	}

	@Then("login should be successful")
	public void loginShouldBeSuccessful()
	{
	    System.out.println("Login Successful...");
	}
	

	@Then("user should be on search page")
	public void userShouldBeOnSearchPage()
	{
	   System.out.println("On flight search page...");
	}

	@And("user should be able to select trip type")
	public void userShouldBeAbleToSelectTripType()
	{
		driver.findElementByXPath("//input[@name='tripType' and @value='oneway' and @type='radio']").click();
	}

	@And("user should be able to select passenger count")
	public void userShouldBeAbleToSelectPassengerCount()
	{
		WebElement passenger = driver.findElementByName("passCount");
		Select count = new Select(passenger);
		count.selectByIndex(2);
	}

	@And("user should be able to select departing from")
	public void userShouldBeAbleToSelectDepartingFrom() 
	{
		WebElement depart = driver.findElementByName("fromPort");
		Select fromPort = new Select(depart);
		fromPort.selectByValue("London");
	}

	@And("user should be able to select departing on month")
	public void userShouldBeAbleToSelectDepartingOnMonth()
	{
		WebElement on = driver.findElementByName("fromMonth");
		Select month = new Select(on);
		month.selectByIndex(4);
	}
	
	@And("user should be able to select departing on day")
	public void userShouldBeAbleToSelectDepartingOnDay()
	{
		WebElement on1 = driver.findElementByName("fromDay");
		Select day = new Select(on1);
		day.selectByValue("5");
	}

	@And("user should be able to select arriving in")
	public void userShouldBeAbleToSelectArrivingIn()
	{
		WebElement arrive = driver.findElementByName("toPort");
		Select toPort = new Select(arrive);
		toPort.selectByValue("Acapulco");
	}

	@And("user should be able to select returning on month")
	public void userShouldBeAbleToSelectReturningOnMonth() 
	{
		WebElement dept = driver.findElementByName("toMonth");
		Select tomonth = new Select(dept);
		tomonth.selectByIndex(5);
	}
	
	@And("user should be able to select returning on day")
	public void userShouldBeAbleToSelectReturningOnDay()
	{
		WebElement on2 = driver.findElementByName("toDay");
		Select day2 = new Select(on2);
		day2.selectByValue("5");
	}

	@And("user should be able to select service class")
	public void userShouldBeAbleToSelectServiceClass()
	{
		driver.findElementByXPath("//input[@name='servClass' and @value='Business']").click();
	}

	@And("user should be able to select airline")
	public void userShouldBeAbleToSelectAirline()
	{
		WebElement air = driver.findElementByName("airline");
		Select line = new Select(air);
		line.selectByVisibleText("Unified Airlines");
	}

	@And("user should be able to click signoff")
	public void userShouldBeAbleToClickSignoff() 
	{
		driver.findElementByXPath("//a[text()='SIGN-OFF']").click();
	}
}
