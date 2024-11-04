package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	//https://www.qtpselenium.com/contact-us
	/**
	 * @throws InterruptedException
	 */
	@Test
	public void linkedIn() throws InterruptedException {
		//WebDriver driver = launchBrowser("Chrome");

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		driver.get("https://www.qtpselenium.com/contact-us");
		//driver.get("https://www.facebook.com");
		//driver.get("https://linkedin.com");
		driver.manage().window().maximize();
		//select a value
		//read selected
		//total # of elements- size
		WebElement dropList=driver.findElement(By.name("country_id")); 
		Select s = new Select(dropList); 
		s.selectByIndex(21);
				//s.selectByVisibleText("Bangladesh");
				//s.selectByValue("252");
	}
}
