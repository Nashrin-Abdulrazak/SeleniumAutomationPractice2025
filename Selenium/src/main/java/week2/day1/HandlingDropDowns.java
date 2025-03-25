package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) {
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();		
		Driver.findElement(By.linkText("Leads")).click();	
		Driver.findElement(By.linkText("Create Lead")).click();
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nashrin");
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Abdulrazak");
		WebElement camp= Driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select obj=new Select(camp);
		obj.selectByVisibleText("Automobile");
		WebElement camp1= Driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select obj1=new Select(camp1);
		obj1.selectByIndex(3);
		WebElement camp2= Driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select obj2=new Select(camp2);
		obj2.selectByValue("LEAD_EMPLOYEE");
		
		
	}

}
