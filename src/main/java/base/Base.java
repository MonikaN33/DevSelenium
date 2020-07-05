package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	
protected static ChromeDriver driver;
	
	@BeforeMethod
	public void openchrome()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	}
	
	
	 @AfterMethod 
	 public void closechrome() 
	 { 
		 driver.quit(); 
	 }
	 

}
