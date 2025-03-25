package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignAmazon {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("(//div[text()='oneplus 9 pro'])[1]")).click();
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("price of first product is:" +price);
		String rating = driver.findElement(By.xpath("//span[text()='2.9 out of 5 stars']")).getText();
		System.out.println("Customer Rating for this product:" +rating);
		/*File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./phonesnap/click.png");
		FileUtils.copyFile(src, dest);*/
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childwindow=new ArrayList<>(windowHandles);
		driver.switchTo().window(childwindow.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();	
		
		
		

	}

}
