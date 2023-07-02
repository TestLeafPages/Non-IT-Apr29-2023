package week7.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_002 extends BaseClassPOM {


	@BeforeTest
	public void setData() {
		fileName="Create";	
	}
	
	
	@Test(dataProvider ="getData")
	public void createLead(String companyName,String fName,String lName) {
		
LoginPage lp=new LoginPage(driver);
		
System.out.println(driver);
		lp.enterUserName().enterPassword().clickOnLogin()
		.clickOnCrmsfa().clickOnLeads().clickOnCreateLead()
		.enterComName(companyName).enterFirstName(fName).enterLastName(lName)
		.clickOnButton().viewLead();
	}
}
