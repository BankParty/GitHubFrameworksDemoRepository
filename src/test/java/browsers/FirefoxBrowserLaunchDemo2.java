package browsers;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxBrowserLaunchDemo2 {
	public static void main(String[]args) {
	}
	@Test
	public void login(){
	System.setProperty("webdriver.gecko.driver", "c:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	//driver.get("https://unemployment.labor.ny.gov/en-US/login");
	//Thread.sleep(3000);
	//driver.manage().window().maximize();
	//driver.findElement(By.id("login")).click();
	//driver.quit();
	//driver.get("https://www.qtpselenium.com/");
	driver.get("http://www.linkedin.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id='session_key']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//*[@id=\'session_password\']")).sendKeys("passcode");
	/*
	 * driver.findElement(By.xpath("//*[@id=\"bs-navbar-collapse-1\"]/ul/li[7]/a")).
	 * click();
	 * driver.findElement(By.id("eMailAddress")).sendKeys("karticsahabd@yahoo.com");
	 * driver.findElement(By.id("userPassword")).sendKeys("bMchWIQ");
	 * driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/form/button"
	 * )).click();
	 * driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/h2/a")).click(
	 * );
	 */
	 
	
}
}
