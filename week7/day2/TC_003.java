package week7.day2;

import org.testng.annotations.Test;

public class TC_003 extends BaseClassPOM{


	@Test
	public void editLead() {
		
LoginPage lp=new LoginPage(driver);
		
System.out.println(driver);
		lp.enterUserName().enterPassword().clickOnLogin()
		.clickOnCrmsfa().clickOnLeads().clickOnFindLeads();
	}
}
