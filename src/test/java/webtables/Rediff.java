package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff {
	
	@Test
	public void testTable() {
		String company = "Prism Johnson"; //find the current price 
		//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		//company list
		List<WebElement> names= driver.findElements(By.xpath("//Table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> prices= driver.findElements(By.xpath("//Table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total companies " + names.size());
		System.out.println("Total prices " + prices.size());
		
		for(int i=0; i<names.size(); i++) {
			if(company.equals(names.get(i).getText())) {
			System.out.println(names.get(i).getText()+"--"+prices.get(i).getText());
			break;
		}
	}

}
}