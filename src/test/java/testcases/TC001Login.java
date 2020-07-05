package testcases;

import org.testng.annotations.Test;

import base.Base;
import pages.Login;

public class TC001Login extends Base
{

	@Test
	public void login()
	{
		new Login()
		.enterUserName("abc@we")
		.password("password")
		.clickSignIn();
	}
	
}
