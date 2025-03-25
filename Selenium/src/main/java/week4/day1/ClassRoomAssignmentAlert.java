package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomAssignmentAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//switching to Alert
		 Alert promptmsg = driver.switchTo().alert();
		 System.out.println(promptmsg.getText());
		 promptmsg.sendKeys("Hello Nashrin");
		promptmsg.accept();
		String acceptmsg1 = driver.findElement(By.id("confirm_result")).getText();
		 System.out.println(acceptmsg1);
		 
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();

		promptmsg.dismiss();
		 String dismsg2 = driver.findElement(By.xpath("//span[text()='User cancelled the prompt.']")).getText();
		 
		System.out.println(dismsg2);
		
		
	}

}
