package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_delete_msg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Open Gmail page
		driver.get("http://gmail.com");

		driver.findElement(By.id("identifierId")).sendKeys("radhikavijay93@gmail.com",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("Naren@92",Keys.ENTER);
	}

}
