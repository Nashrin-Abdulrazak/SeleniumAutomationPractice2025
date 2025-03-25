package week3.day1;

public class ChromeP extends BrowserGP{
	public void openIncognito()
	{
System.out.println("Incognito tab opened");
}
	public void clearCache()
	{
		System.out.println("cache cleared");
	}
	public static void main(String[] args)
	{
		ChromeP cobj=new ChromeP();
		System.out.println(cobj.browsername);
		System.out.println(cobj.browsername);
cobj.openIncognito();
}
}
