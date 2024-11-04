package suitea;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BNN {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://cnn.com");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		System.out.println("Total link "+ allLinks.size());
		//By.xpath("//a"); 
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } WebElement fifthLink =
		 * allLinks.get(5); System.out.println(fifthLink.getText());
		 * System.out.println(fifthLink.getAttribute("href")); fifthLink.click(); try {
		 * Thread.sleep(5000); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		for(int i=0; i<allLinks.size(); i++) {
			WebElement link = allLinks.get(i);
			System.out.println(link.getText()+"---"+ link.isDisplayed());
		}
		}
		//System.out.println(fifthLink.getLocation().x);
		//System.out.println(fifthLink.getLocation().y);
		
		
	}


