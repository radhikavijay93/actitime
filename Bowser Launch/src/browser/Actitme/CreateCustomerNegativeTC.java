package browser.Actitme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomerNegativeTC {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		//Open Actitime Application
		d.get("http://localhost/login.do");
		
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		
		d.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='TASKS']")).click();
		
		d.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
		d.findElement(By.xpath("//span[text()='Create Customer']")).click();
		d.findElement(By.id("customerLightBox_nameField")).sendKeys("HDFC");
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='Create Customer']")).click();
		Thread.sleep(2000);
		String expMsg = "Customer with such name already exists";
		WebElement color = d.findElement(By.id("customerLightBox_nameDuplicateError"));
		String actMsg = color.getText();
		Thread.sleep(2000);
		if(actMsg.equals(expMsg)){
			System.out.println(actMsg+" ==Customer already exists : FAIL");
		}else{
			System.out.println(actMsg+" ==New Customer has been created : PASS");
		}
		String expColor = "rgba(226, 73, 52, 1)";
		String actColor = color.getCssValue("color");
		if(actColor.equals(expColor)){
			System.out.println(actColor+" ==Color is verified : PASS");
	}else{
		System.out.println(actColor+" ==Color is not verified : FAIL");
	}
		Thread.sleep(2000);
		d.findElement(By.id("customerLightBoxCloseButton")).click();
		//ALERT POP-UP
		d.findElement(By.id("logoutLink")).click();
		d.close();
	}

}
