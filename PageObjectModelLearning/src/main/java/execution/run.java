package execution;

import org.testng.annotations.Test;

import Pages.LoginPage;
import base.ProjectSpecificMethods;

public class run extends ProjectSpecificMethods
{

	@Test
	public void runTestcases()
	{
	LoginPage lp=new LoginPage(Driver);
	lp.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.clickCRMSFALink();
	
	
	
	
}
	
}
