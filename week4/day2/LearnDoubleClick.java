package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick\r\n");

		WebElement f1 = driver.findElement(By.id("iframeResult"));
		
		//frame 
		driver.switchTo().frame(f1);
		
		//
		Actions act=new Actions(driver);
		
		
		act.doubleClick(driver.findElement(By.xpath("//p[contains(text(),'paragraph')]"))).perform();
	}

}
