package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LreanFrame {

	public static void main(String[] args) {
		// //button[@id='Click']
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		//need to handle frame
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		//need control to main page
		driver.switchTo().defaultContent();
		
		//1st handle
		driver.switchTo().frame(2);
		
		//second handle
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		//parenframe immediate frame
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();

	}

}
