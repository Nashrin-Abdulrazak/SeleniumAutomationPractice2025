package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;



public class CreateLeadPage extends ProjectSpecificMethods
{ 
public CreateLeadPage(ChromeDriver driver)
{
	this.Driver=driver;
}
		
	public CreateLeadPage enterCompanyName() {
       Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
       return this;

	}

	public CreateLeadPage enterFirstName() {
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		return this;

	}
	public CreateLeadPage enterLastName() {
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		return this;

	}
	public ViewLeadPage clickSubmitButton() {
       Driver.findElement(By.name("submitButton")).click();
       return new ViewLeadPage(Driver);

	}



}
