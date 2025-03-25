package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HomeAssgnButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://leafground.com/button.xhtml");
		Driver.manage().window().maximize();
	Driver.findElement(By.xpath("//span[text()=\"Click\"]")).click();
		Thread.sleep(3000);
		Driver.navigate().back();
		boolean v=Driver.findElement(By.className("card")).isSelected();
		System.out.println(v);
		
		Thread.sleep(3000);
		WebElement pos=Driver.findElement(By.xpath("(//span[text()=\"Submit\"])[1]"));
		System.out.println(pos.getLocation());
			
		WebElement color=Driver.findElement(By.xpath("//span[text()=\"Save\"]"));
		System.out.println(color.getCssValue("background-color"));
		
		WebElement hgtwth=Driver.findElement(By.xpath("(//span[text()=\"Submit\"])[2]"));
		System.out.println(hgtwth.getSize());
		System.out.println(hgtwth.getRect());
				
		//System.out.println(Driver.getTitle());
		
		//System.out.println(title);
		
		//Driver.close();
		

	}

}
