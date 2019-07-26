package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Search {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		//Search for iphone 10x
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 10x",Keys.ENTER);
		//capture the price of the product
		String x = "//span[text()='iPhone XR (64GB, Black)']/../../../../../../../div[2]/div[1]/div/div[1]/div/div/a/span[1]/span/span[contains(text(),'59,900')]";
		String price = driver.findElement(By.xpath(x)).getText();
		System.out.println(price);
		driver.close();
	}

}
