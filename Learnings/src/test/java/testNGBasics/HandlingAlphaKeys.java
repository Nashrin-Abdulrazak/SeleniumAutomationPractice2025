package testNGBasics;

import org.testng.annotations.Test;

public class HandlingAlphaKeys {
	
	@Test
	void signup()
	{
		System.out.println("I'm signup method");
		
	}
	@Test
void login()
{
	System.out.println("I'm login method");

	
}
	@Test(dependsOnMethods ="testNGBasics.HandlingAlphaKeys.login")
	
void search()
{
	System.out.println("I'm search method");

}
}
