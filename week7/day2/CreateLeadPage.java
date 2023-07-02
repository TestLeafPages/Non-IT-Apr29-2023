package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadPage extends BaseClassPOM{

	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public CreateLeadPage enterComName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		
		return this;

	}

	public CreateLeadPage enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;

	}

	public CreateLeadPage enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;

	}

	public ViewPage clickOnButton() {
		driver.findElement(By.name("submitButton")).click();
return new ViewPage(driver);
	}
}
