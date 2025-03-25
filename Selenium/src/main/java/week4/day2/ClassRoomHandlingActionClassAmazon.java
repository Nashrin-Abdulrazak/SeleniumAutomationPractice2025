package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassRoomHandlingActionClassAmazon {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
Actions act=new Actions(driver);
act.scrollToElement(scrolldown).perform();
Thread.sleep(2000);
System.out.println(scrolldown.getText());
//scrolldown.getScreenshotAs(outputype.)
//scrolldown.click();	



	}

}
