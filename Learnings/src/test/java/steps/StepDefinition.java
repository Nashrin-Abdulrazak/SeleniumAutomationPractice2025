package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	public ChromeDriver Driver;

	@Given("User should navigate to Leaftaps application  by loading the url")
	public void loadUrl()
	{
		Driver=new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("User enters DemoSalesManager")
	public void  enterUsername()
	{
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	@And("User enters password as crmsfa")
	public void enterPassword()
	{
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("User click the login button")
	public void clickLogin()
	{
		Driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("login should be success")
	public void verifyHomepage()
	{
		System.out.println("Login Successfull");
	}
}
