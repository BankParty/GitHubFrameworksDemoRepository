package multipleobjectextraction;

import java.util.List;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CnnHeaderLinkTesting {
	
	@Test
	public void cnnHeaderLinks() {
		SoftAssert softAssert = new SoftAssert();
		//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://cnn.com");
		driver.manage().window().maximize();
		List<WebElement> topLinks =driver.findElements(By.xpath("//*[@id='pageHeader']/div/div/div[1]/div[1]/nav/div/div/a"));
		System.out.println("Total Links "+ topLinks.size() );
		 
		for(int i=0; i<topLinks.size(); i++) {
			System.out.println(topLinks.get(i).getText());
			String url = topLinks.get(i).getAttribute("href");
			System.out.println(url);
			boolean result = validateResponseCode(url);
			//Assert.assertTrue(result, "Invalid response code");
			//SoftAssert.assertTrue(result, "Invalid response code");
			
			System.out.println("--------------------------");
		}
		softAssert.assertAll();
	
	}
public boolean validateResponseCode(String url) {
	int resp_code=0;
	try {
		resp_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("Response code for URL "+ url +" is -> " + resp_code);
		if(resp_code==200)
			return true;
	}catch (Exception e) {
		e.printStackTrace();
}
return false;
}
}