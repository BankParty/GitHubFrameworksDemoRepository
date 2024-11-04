package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class FirstScript {
	public static void main(String[] args) {
		
	}
	
	@Test
		public void login() {
		//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        WebElement textBox = driver.findElement(By.name("my-text"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
        
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
       submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        //driver.quit();
    }
}


