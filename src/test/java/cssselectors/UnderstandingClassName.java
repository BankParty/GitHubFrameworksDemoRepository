package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnderstandingClassName {

	@Test
	public void linkedIn() {
		//WebDriver driver = launchBrowser("Chrome");
		//driver.get("https://www.flipkart.com/");
			//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver", "c:\\drivers\\geckodriver.exe");
			//driver.get("https://www.cnn.com/");
			//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("Hi");
			
		    driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			//driver.findElement(By.className("_18u87m _3WuvDp")).sendKeys("abc");
			driver.findElement(By.className("_18u87m")).sendKeys("abc");
}
}