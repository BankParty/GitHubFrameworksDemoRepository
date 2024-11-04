package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomWebTableFunction {
	
@Test
public void testTable() {
	String company = "Prism Johnson"; //find the current price 
	System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	int rowNumber = getRowNumberWithCellData(company);
	Assert.assertTrue(rowNumber !=-1, "Company name not found in table -"+ company);
	String price = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rowNumber+"]/td[4] ")).getText();
	System.out.println(price);
	
	//return row number corresponding to data
	//data ot found returns -1
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
public int getRowNumberWithCellData(String data) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	driver.manage().window().maximize();
	List<WebElement> rows = driver.findElements(By.xpath("//Table[@class='dataTable']/tbody/tr"));
	for(int rNum=0; rNum<rows.size();rNum++) {
		WebElement row = rows.get(rNum);
		List<WebElement> cells = row.findElements(By.tagName("td"));
		for(int cNum=0; cNum<cells.size();cNum++) {
			//System.out.println(cells.get(cNum).getText());
			if(data.equals(cells.get(cNum).getText()));
			return (rNum+1);
			
		}
		//System.out.println("--------");
		}
	//no data found
	return -1;
		}
}



