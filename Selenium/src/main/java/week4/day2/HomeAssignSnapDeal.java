package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeAssignSnapDeal {

	public static void main(String[] args) {
		
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.snapdeal.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mens=Driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions act=new Actions(Driver);
		act.moveToElement(mens).perform();
		Driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String shoecount = Driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Total shoes are:"+shoecount);
		Driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Driver.findElement(By.xpath("////div[@class='sort-selected']']")).click();
		
		
		
		
		
		

	}

}
