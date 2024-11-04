package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium. JavascriptExecutor; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptAlert {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.id("alert1")); 
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		jse.executeScript ("arguments[0].click();", button);

	}
}