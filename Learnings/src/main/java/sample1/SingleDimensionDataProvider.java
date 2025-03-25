package sample1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleDimensionDataProvider {

	@Test(dataProvider="Familynames")
	public void printUserData(String names)
	{
		System.out.println(names);
	}
	//using Indices
	@DataProvider(name="Familynames", indices = {2,4})
	public String[] getUserData()
	{
		String [] obj=new String[] {"Nashrin","Imran","Umar","Begam","Sherif"};
		return obj;
	}
}
