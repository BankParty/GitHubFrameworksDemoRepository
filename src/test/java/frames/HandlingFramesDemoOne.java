package frames;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFramesDemoOne {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.get("https://letcode.in/frame");
//		 driver.get("https://docs.oracle.com/javase/8/docs/api/");
		// driver.get("https://docs.oracle.com/javase/8/docs/api/");
		// driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Kartic");
		driver.findElement(By.name("lname")).sendKeys("Saha");

	}

}
