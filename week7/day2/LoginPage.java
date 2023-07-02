package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BaseClassPOM{

	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//m1
		//LoginPage lp= new LoginPage();
		//return lp;
		
		//m2
		return this;
		
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		return this;
	}
	
	
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

		
		//m2
		return new HomePage(driver);
		
	}
}
