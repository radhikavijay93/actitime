package browser.Actitme;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Radhika
 *
 */
public class CreateProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//Open Actitime Application
		driver.get("http://localhost/login.do");
		//to get random unique number for every execution
		Random r = new Random();
		int randomNum = r.nextInt(2000);
		//test Data
		String userName = "admin";
		String password = "manager";
		String customerName = "AAA"+randomNum;
		String projectName = "testing";
		//login
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		//Navigate to test Page, create customer Page
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(customerName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		//Create New Project
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys(projectName);
		Thread.sleep(2000);
		//select customer from Customer Dropdown
		driver.findElement(By.xpath("//button[text()='-- Please Select Customer to Add Project for  --']")).click();
		Thread.sleep(2000);
		String x = "//a[text()=customerName]";
		Thread.sleep(4000);
		driver.findElement(By.xpath(x)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='createProject']")).click();
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		
		
	}

}
