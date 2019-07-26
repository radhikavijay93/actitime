package browser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BookMyShow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Open bookmyshow page
		driver.get("http://bookmyshow.com");
		driver.findElement(By.xpath("//div[contains(text(),'Popular Cities')]/../div/ul/li[3]")).click();
		driver.findElement(By.id("wzrk-cancel")).click();
		//list all kannada movies in console
		driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).click();
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//div[text()='KANNADA']"));
		act.moveToElement(wb).perform();
		List<WebElement> kannada_movie_list = driver.findElements(By.xpath("//div[text()='KANNADA']/../../li[*]/div/div/a"));
		for(WebElement wb1 : kannada_movie_list)
		{
			String movie_name = wb1.getText();
			System.out.println(movie_name);
		}
	}

}
