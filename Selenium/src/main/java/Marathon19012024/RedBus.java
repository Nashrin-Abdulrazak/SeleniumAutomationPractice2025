package Marathon19012024;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		ChromeDriver Driver=new ChromeDriver();
		
	Driver.get("https://www.redbus.in/");
	Driver.manage().window().maximize();
	Driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chennai");
	Driver.findElement(By.xpath("//text[text()=' Chennai']")).click();
	}
}
