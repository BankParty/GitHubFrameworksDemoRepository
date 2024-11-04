package jsandactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSLinkedIn {
	@Test
	public void linkedIn() {
	System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.get("https://yahoo.com");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location='https://linkedin.com'");
	driver.manage().window().maximize();
	//js.executeScript("document.getElementByName('session_key').value='hello' ");
	js.executeScript("window.scrollTo(0,100)");

}
}