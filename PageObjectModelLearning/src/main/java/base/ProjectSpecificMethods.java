package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	
	public  ChromeDriver Driver;
	@BeforeMethod
	public void precondition()
	{
		Driver=new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void postcondition()
	{
		Driver.close();
		Driver.close();

		Driver.close();

		Driver.quit();
	
	}
}

	
	