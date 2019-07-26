package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
				ChromeDriver d = new ChromeDriver();
				d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//Open Amazon page
				d.get("http://amazon.in");
				Thread.sleep(2000);
				WebElement wb = d.findElement(By.xpath("//span[text()='Category']"));
				Actions act = new Actions(d);
				act.moveToElement(wb).perform();
				Thread.sleep(2000);
				WebElement wb1 = d.findElement(By.xpath("//span[text()='Amazon Prime Video']"));
				act.moveToElement(wb1).perform();
				Thread.sleep(2000);
				d.findElement(By.xpath("//span[text()='All Videos']")).click();		
				d.close();
	}
}