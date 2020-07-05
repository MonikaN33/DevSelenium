package testcases;

import org.testng.annotations.Test;

import base.Base;
import pages.Login;

public class TC002FlightFinder extends Base
{

	@Test
	public void flight()
	{
		 new Login()
			.enterUserName("abc@we")
			.password("password")
			.clickSignIn()
			.tripType()
			.passengerCount(2)
			.departure("London")
			.fromMonth(4)
			.fromDay("5")
			.arrival("Acapulco")
			.toMonth(5)
			.toDay("5")
			.preference()
			.airLine()
			.logoff();
	}
}
