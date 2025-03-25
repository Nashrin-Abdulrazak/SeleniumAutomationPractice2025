package testNGBasics;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingTestNGFiles1 {
	
	
@Test	
	void openChromeBrowser() throws InterruptedException
	
	{
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://google.co.in");
	System.out.println(Driver.getTitle());
	Thread.sleep(8000);
	Driver.close();
	}
	
	

}
