package execution;

import org.testng.annotations.Test;

import Pages.LoginPage;
import base.ProjectSpecificMethods;

public class RunCreateLead extends ProjectSpecificMethods{

	
	@Test
public void runCreateLead1()
{
	LoginPage lp=new LoginPage(Driver);
	lp.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.verfiyWelcomePage()
	.clickCRMSFALink()
	.clickLeadsLink()
	.clickCreateLeadLink()
	.enterCompanyName()
	.enterFirstName()
	.enterLastName()
	.clickSubmitButton();
	
	
}
}
