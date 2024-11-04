package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cnn {

	@Test
	public void linkedIn() {
		//WebDriver driver = launchBrowser("Chrome");
		//driver.get("https://linkedin.com");
		   WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		    //WebDriver driver=new FirefoxDriver();
			//System.setProperty("webdriver.gecko.driver", "c:\\drivers\\geckodriver.exe");
			//driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
			driver.get("https://cnn.com");
			driver.manage().window().maximize();
			//isDisplayed - assumes element is present - checks visibility of the element
			boolean b = driver.findElement(By.xpath("//*[@id='pageHeader']/div/div/div[2]/div/nav[2]/ul/li[5]/ul/li[5]/a")).isDisplayed();
			System.out.println("Visibility " +b);
			driver.findElement(By.cssSelector("svg.header__menu-icon-svg")).click();
			 b = driver.findElement(By.xpath("//*[@id='pageHeader']/div/div/div[2]/div/nav[2]/ul/li[5]/ul/li[5]/a")).isDisplayed();
			System.out.println("Visibility after clicking " +b);
			driver.findElement(By.xpath("//*[@id='pageHeader']/div/div/div[2]/div/nav[2]/ul/li[5]/ul/li[5]/a")).click();
			//WebElement username = driver.findElement(By.xpath("//*[@id='pageHeader']/div/div/div[2]/div/nav[2]/ul/li[5]/ul/li[5]/a"));
			//username.sendKeys("XYZ");
			//System.out.println(username.getLocation().x);
			//System.out.println(username.getLocation().y);
			
			//WebElement password = driver.findElement(By.name("session_password"));
			//password.sendKeys("PASS");
			//driver.findElement(By.name("session_password")).sendKeys("PASS");
			//driver.findElement(By.xpath("html/body/div/main/div[2]/div[1]/form/div[3]/button")).click("submit");
}
}