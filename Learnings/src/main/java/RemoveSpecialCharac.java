import java.util.HashSet;
import java.util.Set;

public class RemoveSpecialCharac {

	public static void main(String[] args) {

		//Remove special characters from string
		/*String str="M@@a$$cb0123oo%%k";
		String str1=str.replaceAll("[^a-z,A-Z,0-9]", "");
		System.out.println(str1);*/

		//Remove duplicates from Array
		/*int[] nums= {1,2,2,3,7,3,10,9};
		Set<Integer> s=new HashSet<>();
		for (int num:nums)
		{
			s.add(num);
		}
		System.out.println(s);*/

		
		//print largest element from array
		/*int[] arr= {5,1,8,2,10,10,10};
		
		int max=arr[0];
		for (int num:arr)
		{
		if (num>max)
		{
			max=num;
		}
		
		}System.out.println(max);*/
		
		
		
//program to find prime numbers 
	    int num = 9;
	    boolean flag = false;

	    // 0 and 1 are not prime numbers
	    if (num == 0 || num == 1) {
	        flag = true;
	    }

	    for (int i = 2; i <= num/2 ; i++) {

	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	       // break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	    
	    //program to print fibonacci series
	    
	    //int num=10;
		/*int first=0;
		int second=1;
		int result=0;
		System.out.println(first);
		System.out.println(second);

		for(int i=1;i<=10;i++)
		{
		result=first+second;

		first=second;
		second=result;
		System.out.println(result);
		}*/
	    
	    
	  }

	
	

}
