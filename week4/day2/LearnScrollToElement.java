package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollToElement {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		WebElement scroll = driver.findElement(By.linkText("Mobiles Accessories:"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(scroll).perform();
		
		scroll.click();

	}

}
