package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mmtbooking {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Open Make my trip
	driver.get("https://makemytrip.com");
	//Identify the From Drop Down
	WebElement fwb = driver.findElement(By.xpath("//input[@placeholder='From']"));
	Thread.sleep(1000);
	//Create an object for select class
	Select sel = new Select(fwb);
	sel.selectByVisibleText("Bangalore, India");
	
	

	}

}
