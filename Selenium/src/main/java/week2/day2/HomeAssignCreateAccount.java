package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignCreateAccount {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		Driver.findElement(By.linkText("Accounts")).click();
		Driver.findElement(By.linkText("Create Account")).click();
		Driver.findElement(By.id("accountName")).sendKeys("1901_test");
		WebElement industry=Driver.findElement(By.name("industryEnumId"));
		Select dropindustry=new Select(industry);
		dropindustry.selectByIndex(3);
		WebElement ownership=Driver.findElement(By.name("ownershipEnumId"));
		Select ownershipdrp=new Select(ownership);
		ownershipdrp.selectByVisibleText("S-Corporation");
		WebElement sourceid=Driver.findElement(By.id("dataSourceId"));
		Select sourcedrp=new Select(sourceid);
		sourcedrp.selectByValue("LEAD_EMPLOYEE");
		WebElement marketcamp=Driver.findElement(By.id("marketingCampaignId"));
		Select marketdrp=new Select(marketcamp);
		marketdrp.selectByIndex(6);
		WebElement stateprovince=Driver.findElement(By.id("generalStateProvinceGeoId"));
		Select statedrp=new Select(stateprovince);
		statedrp.selectByValue("TX");
		//Driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		Driver.findElement(By.linkText("Find Accounts")).click();
		Thread.sleep(6000);
		Driver.findElement(By.name("id")).sendKeys("13138");
		Driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();	
		Driver.close();
		
		
		

	}

}
