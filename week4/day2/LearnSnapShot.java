package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {

	public static void main(String[] args) throws IOException  {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		//for snapshot
		
		File scr = login.getScreenshotAs(OutputType.FILE);
		//path
		File des=new File("./snaps/shot.png");
		//3rd step
		FileUtils.copyFile(scr, des);
		
	}

}
