package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	

	
	public LoginPage(ChromeDriver driver)
	{
		this.Driver=driver;
	}
	public LoginPage enterUsername()
	{
		
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
			}
	public LoginPage enterPassword()
	{
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage clickLoginButton()
	{
		Driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(Driver);
	}
}
