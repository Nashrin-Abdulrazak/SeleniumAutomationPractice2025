package testNGBasics;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingTestNGFiles2 {
	
	@Test

	void openFireFoxBrowser()
	{
		FirefoxDriver Driver=new FirefoxDriver();
		Driver.get("https://google.co.in");
		System.out.println(Driver.getCurrentUrl());
		Driver.close();
		
		
	}
}
