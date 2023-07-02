package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyHomePage extends BaseClassPOM{

	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public MyLeads clickOnLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads(driver);
	}
}
