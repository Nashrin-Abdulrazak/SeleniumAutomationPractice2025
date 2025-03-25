
public class programThisKeyword {

	int a=10;
	int b=5;

	
	/*
	 * public void add(int a,int b) { System.out.println(a+b);//this will print the
	 * output 7 and not 15 }
	 */
	
	
	public programThisKeyword add(int a,int b)
	{
		System.out.println(this.a+this.b);//this will print the output 15 and not 7
		return null;
	}
	
	public static void main(String[] args) {
		programThisKeyword obj=new programThisKeyword();
		obj.add(2, 5);
		
	}
}


