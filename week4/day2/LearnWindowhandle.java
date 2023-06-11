package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowhandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		String parentwindow = driver.getTitle();
		System.out.println(parentwindow);
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getwindowhandle- handle one window id
		String c = driver.getWindowHandle();
		System.out.println(c);
		
		//getwindowHandles-
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		//System.out.println(windowHandles);
		
		//need switch to particular window 
		//set into list
		
		List<String> handle= new ArrayList<String>(windowHandles);
		//i can able use get()
		//syntax
		driver.switchTo().window(handle.get(1));
		
		String childwindow = driver.getTitle();
		System.out.println(childwindow);
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		driver.close();
		
		driver.switchTo().window(handle.get(0));
		
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
	}

}
