package windowmanagement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RediffAlert {

	@Test
	public void rediff() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		//delay for alert to appear
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.alertIsPresent());
		
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		//a1.accept(); // click ok button
		//a1.dismiss(); //click cancel button
		//driver.switchTo().defaultContent();
	}
}
