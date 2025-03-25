package week3.day1;

public class VehicleGP {
	
	public void horn()
{
	System.out.println("Horn Applied");
}
	public void brake()
	{
		System.out.println("break is applied");
	}
	
public static void main(String[] args)
{
	VehicleGP obj=new VehicleGP();
	obj.horn();
	obj.brake();
	
}
}
