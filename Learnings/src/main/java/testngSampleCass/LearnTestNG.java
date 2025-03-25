package testngSampleCass;

import org.testng.annotations.Test;

public class LearnTestNG {

	@Test(priority=1)
	public void firstmethod()
	{
		System.out.println("This is my first method");
	}
	@Test(priority=2)
	public void secondmethod()
	{
		System.out.println("This is my second method");
	}
	@Test(priority=3)
	public void thirdmethod()
	{
		System.out.println("This is my Third method");
	}
	@Test(priority=4)
	public void fourthmethod()
	{
		System.out.println("This is my fourth method");
	}
}
