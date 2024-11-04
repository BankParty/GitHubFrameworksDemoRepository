package introtwocommnds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElementByIdDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Kartic");
		WebElement textBoxField = driver.findElement(By.name("q"));
		textBoxField.sendKeys("Kartic");
		String pageTtitle = driver.getTitle();
		System.out.println(pageTtitle);
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		WebElement paraElement = driver.findElement(By.id("pah"));
		String paraText = paraElement.getText();
		System.out.println(paraText);
		WebElement buttonX = driver.findElement(By.id("button9"));
		String buttonText = buttonX.getText();
		System.out.println(buttonText);
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.id("selenium143")).click();
		WebElement button2 = driver.findElement(By.id("but2"));
		boolean button2status = button2.isDisplayed(); //true
		System.out.println(button2status);
		
		WebElement button1 = driver.findElement(By.id("but1"));
		boolean button1Status = button1.isDisplayed();
		System.out.println(button1Status); //true
		
		WebElement button22 = driver.findElement(By.id("but2"));
		boolean button22Enabled = button22.isEnabled(); //true
		System.out.println(button22Enabled);
		
		WebElement button11 = driver.findElement(By.id("but1"));
		boolean button11Enabled = button11.isEnabled();
		System.out.println(button11Enabled); //false
		
		WebElement maleRadioButton = driver.findElement(By.id("radio1"));
		boolean maleRaidoStatus = maleRadioButton.isSelected();
		System.out.println(maleRaidoStatus); //false
		 
		//checkbox selected or not
		WebElement orangeCheckbox = driver.findElement(By.id("checkbox1"));
		boolean orangeCheckboxStatus = orangeCheckbox.isSelected();
		System.out.println(orangeCheckboxStatus); //true
		
		//navigate()
		driver.navigate().to("https://jqueryui.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//getPageSource
		driver.getPageSource();
		
		//driver.quit();


	}

}
