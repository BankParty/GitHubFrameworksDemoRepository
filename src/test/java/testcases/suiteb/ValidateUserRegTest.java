package testcases.suiteb;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateUserRegTest {
	
	@Test
	public void register() {
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals("XYZ", "XYZA");//FAIL

		softAssert.assertTrue(false, "Element not found" ); //passing
		boolean buttonPresence=false;
		if(!buttonPresence) {
			softAssert.fail("Submit button was not there");
			softAssert.fail("Submit button was not there");
			softAssert.assertAll();
		}
		softAssert.fail("Reg was not success"); //fail
		softAssert.assertAll();
		
	}

}
