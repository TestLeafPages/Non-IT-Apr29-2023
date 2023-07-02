package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseClassPOM{

	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHomePage clickOnCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new MyHomePage(driver);
	}
}
