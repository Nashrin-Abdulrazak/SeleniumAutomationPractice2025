package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class redbus {

	public static void main(String[] args) {
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");*/
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.redbus.in/");
driver.findElement(By.xpath("//span[text()='Train Tickets']")).click();
//Assert.assertEquals(true, false);
String title=driver.getTitle();
String t="Train Ticket Booking, Book IRCTC Train Tickets Online";
if(title.equals(t))
System.out.println(title);
//driver.close();

	}

}
