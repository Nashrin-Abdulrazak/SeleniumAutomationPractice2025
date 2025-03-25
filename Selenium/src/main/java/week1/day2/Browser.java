package week1.day2;

public class Browser {
	
	public String launchBrowser(String name)
	{
return name;
	}
	protected String loadUrl(String url)
	{
		return url;
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
			Browser b=new Browser();
			System.out.println(b.launchBrowser("my browser is launched"));
			System.out.println(b.loadUrl("Protected url is loaded"));
			
			
		}
		
		

	}


