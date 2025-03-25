package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomActWindowHandling {

	public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.irctc.co.in/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.getWindowHandle();
			Thread.sleep(5000);
			System.out.println("parent window:"+driver.getTitle());
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> childwindow=new ArrayList<>(windowHandles);
			driver.switchTo().window(childwindow.get(1));
			Thread.sleep(6000);
			System.out.println("Child window:"+driver.getTitle());
			//switching to parent window
			driver.switchTo().window(childwindow.get(0));
			System.out.println("Parent window:"+driver.getTitle());
			driver.close();
			

			
			
			
					
			
	}

}
