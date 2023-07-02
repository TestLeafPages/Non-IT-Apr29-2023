package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLeads extends BaseClassPOM {

	
	public MyLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		
		return new CreateLeadPage(driver);
	}
	
	
	public FindLeadsPages clickOnFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPages(driver);
	}
	
	
}
