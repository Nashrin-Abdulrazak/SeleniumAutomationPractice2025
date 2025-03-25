package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class browserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mvnrepository.com/search?q=selenium");
driver.close();


	}

}
