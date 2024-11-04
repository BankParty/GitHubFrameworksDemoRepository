package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zoho {
	@Test
	public void linkedIn() throws InterruptedException {
		//WebDriver driver = launchBrowser("Chrome");
		//driver.get("https://linkedin.com");
		   WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
			driver.get("https://www.zoho.com/signup.html?all_prod_page=true&ireft=nhome&src=home1-header");
			driver.manage().window().maximize();
			boolean b = driver.findElement(By.xpath("//span[@id='signup-termservice']")).isEnabled();
			System.out.println(b);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@id='signup-termservice']")).click();
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("password")).sendKeys("abc");
			Thread.sleep(5000);
			//driver.findElement(By.id("email")).clear();
			String text = driver.findElement(By.xpath("//h3")).getText();
			System.out.println(text);
			text= driver.findElement(By.id("email")).getAttribute("value");
			System.out.println("Value of text field:" + text);
			text=driver.findElement(By.xpath("//span[@id='signup-termservice']")).getAttribute("checked");
			System.out.println(text);

	
	
	
	}
}
