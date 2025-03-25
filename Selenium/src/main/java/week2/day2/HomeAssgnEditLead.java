package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssgnEditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		Driver.findElement(By.linkText("Leads")).click();
		Driver.findElement(By.linkText("Create Lead")).click();
		Driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		Driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Nashrin");
		Driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Abdulrazak");
		Driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Test-User");
		Driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Sales");
		Driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("I'm learner in TestLeaf");
		Driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("nash2991@gmail.com");
		WebElement state = Driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select statedrp=new Select(state);
		statedrp.selectByVisibleText("New York");
		Driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		Driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("I'm a learner in Testleaf");
		Driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		System.out.println(Driver.getTitle());
		Thread.sleep(3000);
		Driver.close();
		
				
	
		
		
		
				
			
	}

}
