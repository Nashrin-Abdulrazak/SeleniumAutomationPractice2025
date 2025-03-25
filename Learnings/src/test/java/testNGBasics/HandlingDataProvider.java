package testNGBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HandlingDataProvider {
	@DataProvider(name="login")
	String[][] getdata()
		{
		String[][] data=new String[2][2];
		data[0][0]="Demosalesmanager";
		data[0][1]="crmsfa";
		data[1][0]="Nashrin";
		data[1][1]="sdfnlkdn";
		return data;
		}
	@Test(dataProvider="login")
	void receivedata(String uname,String pwd)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}
