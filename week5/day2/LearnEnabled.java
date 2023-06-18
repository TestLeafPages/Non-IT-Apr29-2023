package week5.day2;

import org.testng.annotations.Test;

public class LearnEnabled {

	@Test()
	public void createLead() {
		System.out.println("createLead");
	}
	
	@Test()
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	
	@Test(priority =1,enabled = false)
	public void editLead() {
		System.out.println("editLead");
	}
	
	@Test
	public void duplicateLead() {
		System.out.println("duplicateLead");
	}
}
