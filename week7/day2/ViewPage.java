package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewPage extends BaseClassPOM{
	
	
	public ViewPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ViewPage viewLead() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Testleaf")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
	}
	return this;

	}
}
