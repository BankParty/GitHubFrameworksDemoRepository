package testcases.suiteb;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndPurchasePhoneTest {
	
	boolean flag = false;// json, xls
	
	@Test(priority = 1)
	public void search(ITestContext context) {
		//selenium code
		if(flag)
			throw new SkipException("Skipping the test");
		
		System.out.println("Searching Phone");
		//Assert.fail("Some reason");
		context.setAttribute("phoneid", "Samsung");
	}
	
	@Test(priority = 2,dependsOnMethods = {"search"})
	public void selectPhone(ITestContext context) {
		//selenium code
		System.out.println("Select Phone");
		String phoneID = (String)context.getAttribute("phoneid");
		System.out.println("ID is "+ phoneID);
	}
	
	
	@Test(priority = 3,dependsOnMethods = {"search","selectPhone"})
	public void checkout(ITestContext context) {
		//selenium code
		System.out.println("Checking out Phone");
	}

}
