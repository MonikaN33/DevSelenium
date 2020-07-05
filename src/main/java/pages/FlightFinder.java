package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import base.Base;

public class FlightFinder extends Base
{
	
		
	
	public FlightFinder tripType()
	{
		
		driver.findElementByXPath("//input[@name='tripType' and @value='oneway' and @type='radio']").click();
		return this;
	}
	
	public FlightFinder passengerCount(int a)
	{
		WebElement passenger = driver.findElementByName("passCount");
		Select count = new Select(passenger);
		count.selectByIndex(a);
		return this;
	}
	
	public FlightFinder departure(String fromport)
	{
		WebElement depart = driver.findElementByName("fromPort");
		Select fromPort = new Select(depart);
		fromPort.selectByValue(fromport);
		return this;
	}
	
	public FlightFinder fromMonth(int b)
	{
		WebElement on = driver.findElementByName("fromMonth");
		Select month = new Select(on);
		month.selectByIndex(b);
		return this;
	}
	
	public FlightFinder fromDay(String c)
	{
		WebElement on1 = driver.findElementByName("fromDay");
		Select day = new Select(on1);
		day.selectByValue(c);
		return this;
	}
	
	
	public FlightFinder arrival(String toport)
	{
		WebElement arrive = driver.findElementByName("toPort");
		Select toPort = new Select(arrive);
		toPort.selectByValue(toport);
		return this;
	}
	
	public FlightFinder toMonth(int d)
	{
		WebElement dept = driver.findElementByName("toMonth");
		Select tomonth = new Select(dept);
		tomonth.selectByIndex(d);
		return this;
	}
	
	public FlightFinder toDay(String today)
	{
		WebElement on2 = driver.findElementByName("toDay");
		Select day2 = new Select(on2);
		day2.selectByValue(today);
		return this;
	}
	
	public FlightFinder preference()
	{
		driver.findElementByXPath("//input[@name='servClass' and @value='Business']").click();
		return this;
	}
	
	public FlightFinder airLine()
	{
		WebElement air = driver.findElementByName("airline");
		Select line = new Select(air);
		line.selectByVisibleText("Unified Airlines");
		return this;
	}
	
	public Profile clickProfile()
	{
		driver.findElementByXPath("//a[text()='PROFILE']").click();
		return new Profile();
		
	}
	
	public void logoff() 
	{
		driver.findElementByXPath("//a[text()='SIGN-OFF']").click();
		
	}

}
