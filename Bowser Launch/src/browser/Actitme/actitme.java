package browser.Actitme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitme {

	public static void main(String[] args) throws InterruptedException, Throwable {
		FileInputStream fObj = new FileInputStream("./Data/commonData.properties");
		Properties pObj = new Properties();
		pObj.load(fObj);
		
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		System.out.println(URL);
		
				WebDriver d = new ChromeDriver();
				//Open Actitime Application
				d.get(URL);
				
				d.findElement(By.id("username")).sendKeys(USERNAME);
				Thread.sleep(1000);
				d.findElement(By.name("pwd")).sendKeys(PASSWORD);
				Thread.sleep(1000);
				d.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				d.findElement(By.xpath("//div[text()='TASKS']")).click();
				Thread.sleep(2000);
				d.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
				
				d.findElement(By.xpath("//span[text()='Create Customer']")).click();
				Thread.sleep(2000);
				d.findElement(By.id("customerLightBox_nameField")).sendKeys("testing123");
				Thread.sleep(3000);
				d.findElement(By.xpath("//span[text()='Create Customer']")).click();
				
				String ExpMsg = "Customer";
				String actMsg = d.findElement(By.xpath("//span[@class='successmsg']")).getText();
				Thread.sleep(2000);
				if(actMsg.contains(ExpMsg)){
					System.out.println(actMsg+" ==PASS");
				}else{
					System.out.println(actMsg+" ==FAIL");
				}
				d.findElement(By.id("logoutLink")).click();
				d.close();
	}
}
