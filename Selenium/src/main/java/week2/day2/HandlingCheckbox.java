package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://leafground.com/checkbox.xhtml");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		Driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[2]")).click();
		Driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div)[2]")).click();
		Driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']/div)[2]")).click();
		Driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		WebElement obj=Driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']"));
		System.out.println(obj.isSelected());
		if(obj.isSelected()==true)
		System.out.println("Checkbox Enabled");
		else
			System.out.println("Checkbox Disabled");
	Thread.sleep(30);
	//Driver.close();
		
		
		
		
	}

}
