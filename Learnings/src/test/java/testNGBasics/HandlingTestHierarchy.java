package testNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingTestHierarchy {
	
	@BeforeSuite
	void launchBrowser()
	{
		System.out.println("Launch Browser successfully");

	}
	@BeforeTest
	void amazonloadUrl()
	{
		System.out.println("amazon Url loaded successfully");
	}
	@BeforeClass
	void amazonSignup()
	{
		System.out.println("signup successfull");
	}
	@BeforeMethod
	void loginPage()
	{
		System.out.println("welcome to amazon");
	}
	@Test(priority=1)
	void searchProducts()
	{
		System.out.println("Products are searched");
	}
	@Test(priority=2)
		void addTocart()
	{
		System.out.println("Products added to cart");
	}
	@AfterMethod
	
	void checkout()
	{
		System.out.println("Items checked out success");
	}
	@AfterClass
	void logout()
	{
		System.out.println("Logout successfull");
	}
	@AfterTest
	void closecurrentBrowser()
	{
		System.out.println("Close current Browser");
	}
	@AfterSuite
	void quit()
	{
		System.out.println("All Broser closed");
	}
	
}
