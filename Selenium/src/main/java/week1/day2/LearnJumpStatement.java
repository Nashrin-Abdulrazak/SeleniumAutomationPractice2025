package week1.day2;

public class LearnJumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var=6;
		for (int i=0;i<var;i++)
		{
			if(i==4)
			{
				System.out.println(i);
				break;
			}
			else
			{
				System.out.println(i);
				
			}
		}
		for(int i=0;i<10;i++)
		{
			if(i==4)
			{
				System.out.println("continue to next:"+i);
				continue;
				
			}
			else
			{
				System.out.println(i);
			}
			
			}
		}

	}


