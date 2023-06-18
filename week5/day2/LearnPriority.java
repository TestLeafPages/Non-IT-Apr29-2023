package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {

	/*
	 * default value=0
	 * with lowest 
	 * accpect -ve value
	 * 
	 */
	@Test(priority=1)
	public void createLead() {
		System.out.println("createLead");
	}
	
	@Test(priority=-4)
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	@Test(priority=2)
	public void editLead() {
		System.out.println("editLead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("duplicateLead");
	}
}
