package base;


import java.time.Duration;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Need help')]")).click();
		driver.findElement(By.id("auth-fpp-link-bottom")).click();
		String email = "venkatasuresh.sqa@gmail.com";
		String appPassCode ="eqkr ktks ymyd yydu";
		driver.findElement(By.id("ap_email")).sendKeys(email);
		driver.findElement(By.id("continue")).click();
		
		
		String host = "imap.gmail.com";
        String username = email; // replace with your email
        String password = appPassCode; // replace with your app password

        // Set properties for the connection
        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");
        
        try {
            // Create a Session
            Session emailSession = Session.getDefaultInstance(properties);
            
            // Create the IMAP store
            Store store = emailSession.getStore("imaps");
            store.connect(host, username, password);
            
            // Create the folder object and open it
            Folder emailFolder = store.getFolder("Inbox");
            emailFolder.open(Folder.READ_ONLY);
            
            // Fetch the messages
            Message[] messages = emailFolder.getMessages();
            System.out.println("Number of emails: " + messages.length);
            
            // Print out the subject of each email
            for (int i = 0; i < messages.length; i++) {
                MimeMessage message = (MimeMessage) messages[0];
                System.out.println("Email Subject: " + message.getSubject());
            }
            
            // Close the folder and store
            emailFolder.close(false);
            store.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}