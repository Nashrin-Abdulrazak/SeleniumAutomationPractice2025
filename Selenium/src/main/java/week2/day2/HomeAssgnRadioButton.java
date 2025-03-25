package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssgnRadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.leafground.com/radio.xhtml");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Driver.manage().window().maximize();
			
		//Driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")).click();
		Driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		Driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		

		

	}

}
