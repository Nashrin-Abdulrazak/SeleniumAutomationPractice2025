package Marathon201022024;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingTatacliq {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver=new ChromeDriver();
				Driver.manage().window().maximize();
		Driver.get("https://www.tatacliq.com/");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//handling sweet Alert
		Driver.findElement(By.xpath("//button[text()='Ask me later']")).click();
		WebElement brands = Driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions brandsact=new Actions(Driver);
		brandsact.moveToElement(brands).perform();
		WebElement watch = Driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions watchact=new Actions(Driver);
		watchact.moveToElement(watch).perform();
		Driver.findElement(By.xpath("//div[text()='Casio']")).click();
		//choose radio button
		Driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		//choose sort by
		WebElement filter = Driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select drpdown=new Select(filter);
		drpdown.selectByVisibleText("New Arrivals");
		List<WebElement> findElements = Driver.findElements(By.xpath("//h3[@class='ProductDescription__boldText']"));
		for (WebElement price : findElements) {
		//	Thread.sleep(6000);
			System.out.println(price.getText());
		}
		
		
		
		
		

	}

}
