package Implicitwait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WaitingExample {

	@Test
	public void linkedIn() throws InterruptedException {
		    WebDriver driver=new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "c:\\drivers\\geckodriver.exe");
			driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
			driver.manage().window().maximize();
			//dynamic wait-not a pause
			//Global timeout
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("username")).sendKeys("xyz");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("xyz");
			driver.findElement(By.xpath("html/body/div/main/div[2]/div[1]/form/div[3]/button")).click();
	
	
}
}
