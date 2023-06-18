package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocationCount {

	@Test(invocationCount=5,invocationTimeOut=500)
	public void createLead() {
		System.out.println("createlead");
	}
	
	@Test(invocationCount=4,threadPoolSize = 2)
	public void editLead() {
		System.out.println("editlead");
	}
	
}
