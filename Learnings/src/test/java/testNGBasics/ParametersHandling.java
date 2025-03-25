package testNGBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersHandling {
	RemoteWebDriver driver;

	@Parameters({"username","paswword","browser"})
	@Test
	
	void openleaftaps(String uname,String pwd,String browser)
	{
		
		switch (browser) {
		case "Chrome":
			driver=new ChromeDriver();

			break;
		case "FireFox":
			driver=new FirefoxDriver();

			break;
		default:
			System.err.println();
			break;
		}
	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
}
