package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Search {
 
	@Test
	public void searchExistingProduct() throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement searchBoxField = driver.findElement(By.name("q"));
		searchBoxField.sendKeys("HP");
		
		Thread.sleep(3000);
		WebElement googleSearchButton = driver.findElement(By.name("btnK"));
		googleSearchButton.click();
	}
}
