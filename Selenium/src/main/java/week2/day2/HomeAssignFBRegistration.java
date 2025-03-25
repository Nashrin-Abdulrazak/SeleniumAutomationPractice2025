package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignFBRegistration {

	public static void main(String[] args) {
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://en-gb.facebook.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.findElement(By.partialLinkText("Create new account")).click();
		Driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("TestUser");
		Driver.findElement(By.name("lastname")).sendKeys("Nash");
		Driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
		Driver.findElement(By.id("password_step_input")).sendKeys("010188");
		WebElement day=Driver.findElement(By.id("day"));
		Select daydrop=new Select(day);
		daydrop.selectByVisibleText("29");
		WebElement month=Driver.findElement(By.id("month"));
		Select monthdrp=new Select(month);
		monthdrp.selectByVisibleText("Nov");
		WebElement year=Driver.findElement(By.id("year"));
		Select yeardrp=new Select(year);
		yeardrp.selectByVisibleText("1991");
		Driver.findElement(By.xpath("//label[text()='Female']")).click();
		Driver.findElement(By.name("websubmit")).click();
		
		
		//Driver.close();
		
		

	}

}
