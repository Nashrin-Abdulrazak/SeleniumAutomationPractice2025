package sample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HandlingDataProvider {

	
	@Test(dataProvider="Login")
	public void orangeHRMlogin(String uname,String pwd)
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	//driver.findElement(By.id("username")).sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	//driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	@DataProvider(name="Login")
	public Object[][] loginOrangeHrm() throws InterruptedException
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="Admin";
		obj[0][1]="admin123";
	Thread.sleep(3000);
		obj[1][0]="Admin";
		obj[1][1]="pass123";
		return obj;
	}
	
}
