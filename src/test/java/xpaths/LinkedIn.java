package xpaths;

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
			WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
			//WebElement username = driver.findElement(By.cssSelector("input#username"));
			username.sendKeys("XYZ");
			WebElement password=driver.findElement(By.xpath("//*[@id='password']"));
			password.sendKeys("abx");
			//System.out.println(username.getLocation().x);
			//System.out.println(username.getLocation().y);
			String text=driver.findElement(By.xpath("html/body/div/main/div[2]/div[1]/div[1]/h1")).getText();
			System.out.println(text);
			//WebElement password = driver.findElement(By.name("session_password"));
			//password.sendKeys("PASS");
			//driver.findElement(By.name("session_password")).sendKeys("PASS");
	}

}
