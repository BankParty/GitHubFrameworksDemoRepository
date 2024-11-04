package testcases.suitea;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import dataprovider.TestDataProvider;

public class CreateUser {
	//@Test(dataProvider = "getData") // step 2 - map the data provider
	@Test(dataProviderClass =TestDataProvider.class, dataProvider="getData")
	public void createUser(String browser, String userType, int phone, String email) { //step 2 - define parameter
		System.out.println(browser+"---"+userType+"--"+phone+"--"+email);
		
	}
	//step 1
	@DataProvider
	public Object[][] getData(){
		Object[][]  data = new Object[3][4];
		
		//row 1
		data[0][0] = "Chrome";
		data[0][1] = "Admin";
		data[0][2] = 1111111;
		data[0][3] = "email1@somedomain.com";
		 //row 2
		data[1][0] = "Mozilla";
		data[1][1] = "SuperAdmin";
		data[1][2] = 33443;
		data[1][3] = "email2@somedomain.com";
		//row 3
		data[2][0] = "ie";
		data[2][1] = "User";
		data[2][2] = 67575;
		data[2][3] = "email3@somedomain.com";
		
		return data;
		
	}
	@Test(dataProviderClass =TestDataProvider.class, dataProvider="getData")
	public void deleteUser(String browser, String userType, int phone, String email) { //step 2 - define parameter
		System.out.println(browser+"---"+userType+"--"+phone+"--"+email);
}
}
