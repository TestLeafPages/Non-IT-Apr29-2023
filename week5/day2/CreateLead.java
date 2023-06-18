package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	//step-3
	@DataProvider(name="getData")
	//step-1
	public String[][] fetchData(){
		
		//step-2
		String[][] data=new String[3][4];
		//index-0
		data[0][0]="TestLeaf";
		data[0][1]="gokul";
		data[0][2]="s";
		data[0][3]="98";
		
		data[1][0]="TestLeaf";
		data[1][1]="ranjini";
		data[1][2]="r";
		data[1][3]="99";
		
		data[2][0]="TestLeaf";
		data[2][1]="vinoth";
		data[2][2]="s";
		data[2][3]="97";
		
		//return null
		return data;
		
	}
	
//step4
	@Test(dataProvider ="getData")
	public  void runCreateLead(String cname,String fname,String lname,String phNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		
	}
	
	
}
