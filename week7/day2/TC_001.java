package week7.day2;

import org.testng.annotations.Test;

public class TC_001 extends BaseClassPOM{

	@Test
	public void loginData() {
		
		System.out.println(driver);
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUserName().enterPassword().clickOnLogin();
		
	}
	
}
