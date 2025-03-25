package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLeafTapsLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://leaftaps.com/opentaps/control/login");
		Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		Driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		Driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		
		
	}

}
