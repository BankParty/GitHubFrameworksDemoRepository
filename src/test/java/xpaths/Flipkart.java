package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Flipkart {
	
	@Test
	public void linkedIn() {
		//WebDriver driver = launchBrowser("Chrome");
		//driver.get("https://www.flipkart.com/");
			System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver", "c:\\drivers\\geckodriver.exe");
			driver.get("https://www.cnn.com/");
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("Hi");
			
		    //driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("Hi");
			//System.out.println(username.getLocation().x);
			//System.out.println(username.getLocation().y);
			//String text=driver.findElement(By.xpath("html/body/div/main/div[2]/div[1]/div[1]/h1")).getText();
			//System.out.println(text);
			
			
			//WebElement password = driver.findElement(By.name("session_password"));
			//password.sendKeys("PASS");
			//driver.findElement(By.name("session_password")).sendKeys("PASS");
	}

}



