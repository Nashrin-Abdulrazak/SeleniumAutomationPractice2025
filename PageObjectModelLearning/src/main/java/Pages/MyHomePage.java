package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage(ChromeDriver driver)
	{
		this.Driver=driver;
	}
	

	public MyLeadsPage clickLeadsLink()
	{
		Driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(Driver);
	}
	
	
}
