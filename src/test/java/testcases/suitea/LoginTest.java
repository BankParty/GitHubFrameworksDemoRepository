package testcases.suitea;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void init() {
		System.out.println("----------@BeforeTest------------");
	}
	
	@AfterTest
	public void quit() {
		System.out.println("----------@AfterTest--------------");
		//close browser
	}
	@BeforeMethod
	public void beforeMeth() {
		System.out.println("**********@BeforeMethod******");
	}
	@AfterMethod
	public void afterMeth() {
		System.out.println("**********@AfterMethod******");
	}
	@Test
	public void loginTest() {
		String expectedResult="ABC";
		String actualResult="ABCX";
		System.out.println("Login Test");
		//System.out.println("After assertion");
		
		//Assert.assertEquals(actualResult,expectedResult);
		//Assert.assertTrue(5>12,"Error message");
		//Assert.fail();
		//System.out.println("-----------A-------");
		//Assert.fail("Custom Err message - 404 error");
		//System.out.println("After assertion");
		//System.out.println("-----------B-------");
	}
	@Test
	public void logout() {
		System.out.println("Logging out");
		
	}
	

}
