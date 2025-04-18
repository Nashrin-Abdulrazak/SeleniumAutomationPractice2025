
public class NumReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1213;
		int temp;
		int reminder=0;
		int reverse=0;
		
		temp=num;
		while(num>0)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
			

		}
		
		System.out.println(reverse);
		
		
		if(reverse==temp)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number not a palindrome");

		}
		
	}

}
