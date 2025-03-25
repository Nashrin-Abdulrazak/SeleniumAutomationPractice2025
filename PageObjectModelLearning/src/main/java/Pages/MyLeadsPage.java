package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage(ChromeDriver driver)
	{
		this.Driver=driver;
	}
	public CreateLeadPage clickCreateLeadLink() {
		Driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(Driver);

	}

}


