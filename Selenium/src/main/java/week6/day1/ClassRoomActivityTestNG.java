package week6.day1;

import org.testng.annotations.Test;

public class ClassRoomActivityTestNG {
	
	
	@Test(invocationCount=5,timeOut=1000)
	public void add()
	{
		System.out.println("the method is add");
	}
	@Test(priority=1)
public void sub()
{
	System.out.println("The method is subtract");
	
}
	@Test(priority=2,enabled=false)
public void multiply()
{
	System.out.println("the method will multiply");
}
	@Test(priority=4)
public void divide()
{
	System.out.println("The method will do division");
}
}
