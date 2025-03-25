package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods
{
	public WelcomePage(ChromeDriver driver)
	{
		this.Driver=driver;
	}
	
public WelcomePage verfiyWelcomePage()
{
	String getvalue = Driver.findElement(By.tagName("h2")).getText();
	if(getvalue.contains("Welcome"))
	{
		System.out.println("HomePage is diplayed");
		
	}
	else
	{
		System.out.println("HomePage is not diplayed");
		
	}
	return this;
	

}
public MyHomePage clickCRMSFALink()
{
	Driver.findElement(By.partialLinkText("CRM/SFA")).click();
	return new MyHomePage(Driver);
}
}
