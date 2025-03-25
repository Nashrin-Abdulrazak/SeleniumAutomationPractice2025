package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		
Driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
Driver.findElement(By.id("pass")).sendKeys("Tuna@123");
Driver.findElement(By.name("login")).click();
	}

}
