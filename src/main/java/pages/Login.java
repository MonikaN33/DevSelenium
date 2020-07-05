package pages;

import base.Base;


public class Login extends Base
{
	
	public Login enterUserName(String username)
	{
		driver.findElementByName("userName").sendKeys(username);
		return this;
	}
	
	public Login password(String password)
	{
		driver.findElementByName("password").sendKeys(password);
		return this;
	}
	
	public FlightFinder clickSignIn()
	{
		driver.findElementByName("login").click();
		return new FlightFinder();
	}

}
