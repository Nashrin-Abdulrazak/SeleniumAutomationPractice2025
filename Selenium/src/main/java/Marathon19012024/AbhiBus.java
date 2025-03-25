package Marathon19012024;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver Driver=new ChromeDriver();
Driver.get("https://www.abhibus.com/");
Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
Driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("chennai");
Driver.findElement(By.xpath("//div[text()='Chennai']")).click();



//Driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");


//Driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).sendKeys("26/01/2024");
	}

}
