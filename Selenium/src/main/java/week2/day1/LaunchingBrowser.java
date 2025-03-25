package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/search?q=selenium");
		Thread.sleep(10000);
		driver.close();


	}

}

