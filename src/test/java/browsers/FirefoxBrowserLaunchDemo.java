package browsers;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirefoxBrowserLaunchDemo {
	public static void main(String[]args) {
	}
	@Test
	public void login(){
	//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.get("https://unemployment.labor.ny.gov/en-US/login");
	//Thread.sleep(3000);
	//driver.manage().window().maximize();
	//driver.findElement(By.id("login")).click();
	//driver.quit();
	//driver.get("https://www.qtpselenium.com/");
	driver.get("http://www.yahoo.com/");
	//driver.get("http://www.linkedin.com/");
	driver.manage().window().maximize();
	String Title = driver.getTitle();
	System.out.println(Title);
	driver.findElement(By.id("session_key")).sendKeys("karticsaha1@gmail.com");
	driver.findElement(By.id("session_password")).sendKeys("Idteditm@8");
	driver.findElement(By.xpath("//*[@id='main-content']/section[1]/div/div/form/div[2]/button")).click();
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=1;i<=links.size();i++) {
		System.out.println(links.get(i).getText());
	}
	
	

	
	
	//driver.findElement(By.xpath("//*[@id='ember12']/div/div/li-icon/svg/path")).click();
	
	//double click code
	/*Actions actions = new Actions(driver);
	WebElement elementLocator = driver.findElement(By.id("ID"));
	actions.contextClick(elementLocator).perform();*/
	
	//*[@id='ember12']/div/div/li-icon/svg/path
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
