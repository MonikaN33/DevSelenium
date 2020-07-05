package pages;

import base.Base;

public class Profile extends Base
{

	public void clickProfile()
	{
		driver.findElementByXPath("//a[text()='PROFILE']").click();
		
	}
	
	public Profile verifyProfilePage()
	{
		System.out.println("Profile Page opened...");
		return this;
	}
	
	public Profile firstName()
	{
		driver.findElementByName("firstName").sendKeys("Monika");
		return this;
	}
	
	public Profile lastName()
	{
		driver.findElementByName("lastName").sendKeys("Gupta");
		return this;
	}
	
	public Profile phoneNumber()
	{
		driver.findElementByName("phone").sendKeys("123456789");
		return this;
	}
	
	public void logoff() 
	{
		driver.findElementByXPath("//a[text()='SIGN-OFF']").click();
		
	}
	
	
	
}
