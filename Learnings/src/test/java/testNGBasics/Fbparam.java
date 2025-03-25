package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fbparam {
	@Parameters({"username","password","url"})
	@Test
	
	void login(String uname,String pwd,String url)
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.get(url);
		Driver.get("https://www.facebook.com");
		Driver.findElement(By.id("email")).sendKeys(uname);
		Driver.findElement(By.id("pass")).sendKeys(pwd);
	}

}
