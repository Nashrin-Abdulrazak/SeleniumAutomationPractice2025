import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Interview {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver1=new EdgeDriver();
		driver.get("https://demoqa.com/login");
		//System.exit(0);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("tl@0054");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tuna@123");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.id("login")).click();
		
		
		driver.findElement(By.xpath("(//div[@class='header-text'])[3]")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[text()='Frames']"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
	}

}
