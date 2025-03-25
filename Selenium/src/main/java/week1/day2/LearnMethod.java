package week1.day2;

public class LearnMethod {
	public void browserName()
	{
		System.out.println("This is chrome browser");
		
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public String regDetails(String name, int rollNo)
	{
		return name +""+rollNo;
		
	}
	private void pinNo()
	{
		System.out.println("My pin no is XXXX");
	}
	void browserVersion()
	{
		System.out.println("Default chrome browser");
	}
	protected void name()
	{
		System.out.println("My pin no is protected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethod lm=new LearnMethod();
		System.out.println(lm.add(10,20));
		System.out.println(lm.regDetails("Nashrin",12226));
lm.pinNo();
lm.browserVersion();
lm.name();

	}

}
