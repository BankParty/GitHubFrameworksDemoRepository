package multipleobjectextraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	
	@Test
	public void printNames() {
			System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");
			driver.manage().window().maximize();
			List<WebElement> allTshirtNames = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
			System.out.println("total t shirts - "+allTshirtNames.size());
			
			for(WebElement e: allTshirtNames) {
				System.out.println(e.getText());
			}
	}

}
