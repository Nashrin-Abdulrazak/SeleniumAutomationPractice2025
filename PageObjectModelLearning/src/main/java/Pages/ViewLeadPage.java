package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;



public class ViewLeadPage extends ProjectSpecificMethods{ 
	
	public ViewLeadPage(ChromeDriver driver)
	{
		this.Driver=driver;
	}
	
	public ViewLeadPage verifyCreateLead() {
		String text = Driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;

	}

}