package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Webdrivertest {
	public static void main(String[]args) {
		
	}
@Test
	public void login() {
	//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/users/sign_in");
	
	driver.findElement(By.id("user_email_login")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("passcode");
	driver.findElement(By.name("commit")).click();
}
}