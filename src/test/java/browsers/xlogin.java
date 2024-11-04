package browsers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class xlogin {
	public static void main(String[]args) {
		
	}
@Test
	public void login() {
	//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://x.com");
	driver.get("https://api.linkedin.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.cssSelector("input#username")).sendKeys("abc@gmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
	driver.findElement(By.cssSelector("#organic-div > form > div.login__form_action_container > button")).click();
	
	/*driver.findElement(By.xpath("user_email_login")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("passcode");
	driver.findElement(By.name("commit")).click();*/
}
}
