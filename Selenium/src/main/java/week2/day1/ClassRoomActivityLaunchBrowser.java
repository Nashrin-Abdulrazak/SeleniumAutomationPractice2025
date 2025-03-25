package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomActivityLaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver Driver=new ChromeDriver();
Driver.manage().window().maximize();
Driver.get("http://leaftaps.com/opentaps/control/login");
Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
Driver.findElement(By.id("password")).sendKeys("crmsfa");
Driver.findElement(By.className("decorativeSubmit")).click();
Thread.sleep(10000);
Driver.close();



	}

}
