package week1.day2;

import java.util.Arrays;

public class FindDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] age= {20,30,20,45,30,56};
		Arrays.sort(age);
		for (int i=0;i<age.length;i++)
		{
			for(int j=i+1;j<age.length;j++)
			{
				if(age[i]==age[j]) {
					System.out.println("duplicate age found:"+age[j]);
					
				}
			}
		}
		System.out.println("******");
		for(int i=0;i<age.length;i++)
		{
			if(age[i]==age[i+1])
			{
				System.out.println("duplicate age found:"+age[i]);
				
			}
		}
	}

}
