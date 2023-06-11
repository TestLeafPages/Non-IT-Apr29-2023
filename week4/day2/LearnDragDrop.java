package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement scr = driver.findElement(By.id("form:drag_content"));
		
		WebElement des = driver.findElement(By.id("form:drop_header"));
		
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(scr, des).perform();
		
		
		//draganddropby
		
		WebElement ddby = driver.findElement(By.id("form:conpnl_header"));
		
		Actions act1=new Actions(driver);
		
		act1.dragAndDropBy(ddby, 50, 0).perform();

	}

}
