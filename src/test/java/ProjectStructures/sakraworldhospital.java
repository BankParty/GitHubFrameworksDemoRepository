package ProjectStructures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class sakraworldhospital {
	public Properties prop=null;

	@Test
	public void appointmentTest() throws IOException, InterruptedException {
		
 Properties prop = new Properties(); 

 FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test/resources//project.properties"); 
 prop.load(fs);

		   WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		    driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.findElement(By.linkText(prop.getProperty("doctor_name"))).click();
			//waitForPageToLoad();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"hv-vc-appointment-pop-up23\"]/div/div/div[2]/div/p[2]/button[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.id(prop.getProperty("name"))).sendKeys(prop.getProperty("first_name"));
			driver.findElement(By.cssSelector(prop.getProperty("email"))).sendKeys(prop.getProperty("email_id"));
			driver.findElement(By.id(prop.getProperty("mobile_number"))).sendKeys(prop.getProperty("phone_number"));
			WebElement gender = driver.findElement(By.id(prop.getProperty("gender")));
			Select s = new Select(gender);
			s.selectByVisibleText("Male");
			driver.findElement(By.id(prop.getProperty("dob"))).click();
			String dob = prop.getProperty("dob_val");
			
			//driver.findElement(By.linkText("Dr. Rani Premkumar")).click();
			//System.out.println(prop.getProperty("url"));
			
			//WebDriver driver = launchBrowser("Chrome");
			//driver.get("https://linkedin.com");
			//WebDriver driver=new FirefoxDriver();
			//System.setProperty("webdriver.gecko.driver", "c:\\drivers\\geckodriver.exe");
			
			/*
			 * WebElement username =
			 * driver.findElement(By.xpath("//input[@id='username' and @name='session_key']"
			 * )); username.sendKeys("XYZ"); System.out.println(username.getLocation().x);
			 * System.out.println(username.getLocation().y);
			 */
			 
			
			//WebElement password = driver.findElement(By.name("session_password"));
			//password.sendKeys("PASS");
			//driver.findElement(By.name("session_password")).sendKeys("PASS");
			//driver.findElement(By.xpath("html/body/div/main/div[2]/div[1]/form/div[3]/button")).click("submit");
	}
	

		
	
}


