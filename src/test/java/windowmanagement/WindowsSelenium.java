package windowmanagement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsSelenium {
	
	@Test
	public void testWindows() {
		//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//how to create new window tab?
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		//1 window
	Set<String> s = driver.getWindowHandles();
	Iterator<String> it = s.iterator();
	System.out.println(it.next()); //main window ID
	System.out.println("Total windows " +s.size());
	
	//driver.switchTo().window(nameorHandle);
	driver.get("http://naukri.com");
	driver.manage().window().maximize();
	s = driver.getWindowHandles();
	 it = s.iterator();
	 System.out.println("Total windows " +s.size());
	 //driver.switchTo().window(popup1);
	 //driver.close(); //closed the window under focus
	 //driver.quit(); //close all windows and end selenium session
	}
}
