package framesandcookies;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paytm {
	@Test
	public void paytm() {
	System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://paytm.com");
	driver.manage().window().maximize();
	//WebElement golfClubs = driver.findElement(By.xpath("//*[@id='header-navigation']/div/ul/li[4]/a"));
	//Actions act = new Actions(driver);
	//act.moveToElement(golfClubs).build().perform(); //moves mouse to element
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(null));
	
	//*[@id='header-navigation']/div/ul/li[4]/a
	//act.moveToElement(target);
	
	//driver.findElement(By.xpath("/*[@id='termly-code-snippet-support']/div/div/div/div/div/div/div[2]/button[2]")).click();
	//*[@id="termly-code-snippet-support"]/div/div/div/div/div/div/div[2]/button[2]
	
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.location='https://linkedin.com'");
	
	//js.executeScript("document.getElementByName('session_key').value='hello' ");
	//js.executeScript("window.scrollTo(0,100)");

}
}