package testNGBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandlingExplicitWait {
	
	
	@Test
	public void test() throws InterruptedException 
	{
	ChromeDriver driver = new ChromeDriver(); 
	
	
	driver.get("https://www.facebook.com/" );
	driver.manage().window().maximize() ;
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	Alert obj = wait.until(ExpectedConditions.alertIsPresent());
	System.out.println(obj.getText());
	obj.accept();
	//driver.switchTo().alert();
	}

}
