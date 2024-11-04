package suitea;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import reports.ExtentManager;

public class TestA {
	

	
	@BeforeMethod
	public void init() {

		
	}
	
	@AfterMethod
	public void quit() {
		
	}
	@Test
	public void testA() throws InterruptedException {
		System.out.println("Starting A");
		Thread.sleep(2000);
		System.out.println("Ending A");
	}

}
