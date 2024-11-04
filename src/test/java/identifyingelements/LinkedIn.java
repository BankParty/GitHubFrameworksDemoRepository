package identifyingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//ctrl, shift, o - to import together everything

public class LinkedIn {
	
	
	
	@Test
	public void linkedIn() {
		//WebDriver driver = launchBrowser("Chrome");
		//driver.get("https://linkedin.com");
		   WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		    //WebDriver driver=new FirefoxDriver();
			//System.setProperty("webdriver.gecko.driver", "c:\\drivers\\geckodriver.exe");
			driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
			driver.manage().window().maximize();
			WebElement username = driver.findElement(By.xpath("//input[@id='username' and @name='session_key']"));
			username.sendKeys("XYZ");
			System.out.println(username.getLocation().x);
			System.out.println(username.getLocation().y);
			
			//WebElement password = driver.findElement(By.name("session_password"));
			//password.sendKeys("PASS");
			driver.findElement(By.name("session_password")).sendKeys("PASS");
			//driver.findElement(By.xpath("html/body/div/main/div[2]/div[1]/form/div[3]/button")).click("submit");
	}
	
}
