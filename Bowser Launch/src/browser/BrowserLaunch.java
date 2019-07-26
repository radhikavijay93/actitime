package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
	//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		ChromeDriver d = new ChromeDriver();
		//Open Amazon page
		d.get("http://amazon.com");
//webElement currentpagetitle = d.getTitle();
		
		//Login
	WebElement signwb = d.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	signwb.click();
	
	//Enter login details
	WebElement emailwb = d.findElement(By.id("ap_email"));
	emailwb.sendKeys("7066192623");
	
	WebElement pswwb = d.findElement(By.id("ap_password"));
	pswwb.sendKeys("Malathi@70");
		
	WebElement signbtnwb = 	d.findElement(By.id("signInSubmit"));
	signbtnwb.click();
	
	
	WebElement logoutbtn = d.findElement(By.xpath("//span[text()='Sign Out']"));
	logoutbtn.click();
	
	d.quit();
	}
}
