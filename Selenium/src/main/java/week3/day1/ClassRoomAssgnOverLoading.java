package week3.day1;

public class ClassRoomAssgnOverLoading {
	
	public void getBrowserVersion()
	{
		System.out.println("Browser Version is: 123.0");
	}
	public void getBrowserDetails(String browsername,double d)
	{
		System.out.println("Browser name"  +browsername +"  "+   "Version" +d);
		
	}
	public void getdriver(String name)
	{
		System.out.println("Browser name is:"+name);
	}
public void getBrowserDetails1(float version,String browsername1)
{
	System.out.println("Version Details" +" " +version +" "+ "Browsername" +browsername1);
}
	public static void main(String[] args) {
		ClassRoomAssgnOverLoading obj=new ClassRoomAssgnOverLoading();
		obj.getBrowserVersion();
		obj.getBrowserDetails("chrome",123.0);
		obj.getdriver("chromium");
		obj.getBrowserDetails1(123.0f, "Chrome");
			}

}
