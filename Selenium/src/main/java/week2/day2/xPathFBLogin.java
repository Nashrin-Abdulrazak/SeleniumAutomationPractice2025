package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class xPathFBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		 
	}

}
