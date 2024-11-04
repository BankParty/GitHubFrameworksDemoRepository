package handlingmouseandkeyboard;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingWorkspace\\DemoProj\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement searchBoxField = driver.findElement(By.name("q"));
		
		searchBoxField.sendKeys("Arun");
		
		Actions a = new Actions(driver);
		
		a.doubleClick(searchBoxField).perform();
		
	}

}