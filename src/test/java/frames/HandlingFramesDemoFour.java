package frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFramesDemoFour {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.get("https://letcode.in/frame");
//		 driver.get("https://docs.oracle.com/javase/8/docs/api/");
		// driver.get("https://docs.oracle.com/javase/8/docs/api/");
		// driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[contains(text(),'New York')]")).click();
		
		
		
	}

}