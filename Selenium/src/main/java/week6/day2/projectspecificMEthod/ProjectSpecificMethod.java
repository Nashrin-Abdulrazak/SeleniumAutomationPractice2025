package week6.day2.projectspecificMEthod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSpecificMethod {
	
	ChromeDriver Driver;
	public void precondition()
	{
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.manage().window().maximize();
	}
	
	public void postcondition()
	{
		
	}

}
