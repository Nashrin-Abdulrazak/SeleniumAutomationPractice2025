package sample1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
////import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HandlingParameters {
	public ChromeDriver Driver;
			
	@BeforeMethod
	
	public void precondition()
	{
	 Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("http://leaftaps.com/opentaps/control/main");
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Driver.findElement(By.id("username")).sendKeys("");
	Driver.findElement(By.id("password")).sendKeys("");
	Driver.findElement(By.className("decorativeSubmit")).click();
	Driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	public void postcondition()
	{
		Driver.quit();
	}
	
}
