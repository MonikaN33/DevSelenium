package testcases;

import org.testng.annotations.Test;

import base.Base;
import pages.Login;

public class TC003Profile extends Base
{

	@Test
	public void profile()
	{
		new Login()
		.enterUserName("abc@we")
		.password("password")
		.clickSignIn()
		.clickProfile()
		.firstName()
		.lastName()
		.phoneNumber()
		.logoff();
	}
	
}
