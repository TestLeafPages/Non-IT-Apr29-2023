package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//simple alert
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();

		//syntax -driver focus transfer to alert
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		//action-performed
	    alert.accept();
		
		String text2 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text2);
		
		Thread.sleep(3000);
		
		//confirm alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		String text3 = alert2.getText();
		System.out.println(text3);
		
		alert2.accept();
		//alert2.dismiss();
		
		Thread.sleep(2000);
		
		//sweet alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

		
		
		
		
		
		
		
		
		
		
		
	}

}
