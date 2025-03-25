package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssgnDeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		Driver.findElement(By.linkText("Leads")).click();
		Driver.findElement(By.linkText("Find Leads")).click();
		Driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8056100692");
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		/*WebElement value = Driver.findElement(By.linkText("11613"));
		System.out.println(value.getText());*/
		
		Driver.findElement(By.xpath("//a[text()='11613']")).click();
		Driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11613");
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		
	}

}
