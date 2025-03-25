package week3.day1;

public class methodOverloading {
	
	public void reportStep(String msg,String status)
	{
		System.out.println("reported step");
	}
	public void reportStep(String msg,String status,boolean snap)
	{
}
	public static void main(String[] args)
	{
		methodOverloading obj=new methodOverloading();
		obj.reportStep("Hi","status passed");
		obj.reportStep("Hello","Status failed",false);
	}
}
