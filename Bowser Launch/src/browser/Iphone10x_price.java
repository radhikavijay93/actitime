package browser;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone10x_price {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		try{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		}catch(Exception e)
		{
			System.out.println("Exception handled");	
		}
		driver.findElement(By.name("q")).sendKeys("iphone 10x",Keys.ENTER);
		List<WebElement> lst1 = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
		System.out.println(lst1.size());
		List<WebElement> lst2 = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1]"));
		//display the link element in console
		for(int i=0; i<lst1.size();i++)
		{
			System.out.println(lst1.get(i).getText()+ "==>"+lst2.get(i).getText());
		}
	}
}
