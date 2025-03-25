package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomAssgFrame {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
driver.manage().window().maximize();
driver.switchTo().frame(0);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//button[text()='Try it']")).click();
Alert msg = driver.switchTo().alert();
msg.accept();
String msg1 = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
System.out.println(msg1);


	}

}
