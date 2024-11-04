package QAFoxClass;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();	
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test(priority=1)
	public void verifyLoginWithValidCredentials() {
		
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@Test(priority=2)
	public void verifyLoginWithInvalidCredentials() {
		
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1xyz123xyz@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String expectedWarning = "Warning: No match for E-Mail Address and/or Password.";
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains(expectedWarning));

	}
//	public String generateEmailWithTimeStamp() {
//		return "amotoori" + new Date().toString().replaceAll("\\s", "-").replaceAll("\\:", "-")+ "@gmail.com";
	
}
