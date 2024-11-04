package frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFramesDemoThree {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.get("https://letcode.in/frame");
//		 driver.get("https://docs.oracle.com/javase/8/docs/api/");
		// driver.get("https://docs.oracle.com/javase/8/docs/api/");
		// driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
		
		
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.className("home-link")).click();
		
	}

}
