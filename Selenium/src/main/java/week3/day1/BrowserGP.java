package week3.day1;

public class BrowserGP {
String browsername="chrome";
int browserversion=120;
public void openURL()
{
System.out.println("Url opened");
}
public void closeBrowser()
{
System.out.println("Browser closed");
}
public void navigateBack()
{
System.out.println("Navigated back");
}
public static void main(String[] args)
{
	BrowserGP obj=new BrowserGP();
	
}
}
