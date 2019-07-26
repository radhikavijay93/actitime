package browser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Make_my_trip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Open MakeMyTrip page
		driver.get("https://makemytrip.com");
		Thread.sleep(5000);
		//Enter from & to cities
		driver.findElement(By.xpath("//span[text()='From']")).click();
				   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("BLR");
				   driver.findElement(By.xpath("//p[text()='Bangalore, India']")).click(); 
				   Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
				   driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("MOM");
		           driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		           Actions act = new Actions(driver);
		           act.click();
		           
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		List<WebElement> lst1 = driver.findElements(By.xpath("//p[text()='Bengaluru']/../../../../../../../../div[1]/div[2]/p/span"));
		List<WebElement> lst2 = driver.findElements(By.xpath("//p[text()='Bengaluru']/../../../../../../../../div[1]/div[2]/p[2]"));
		System.out.println(lst1);
		System.out.println(lst2);
	}

}
