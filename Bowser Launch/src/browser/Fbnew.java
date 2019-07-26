package browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Fbnew {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Open FB
	driver.get("https://facebook.com");
	//Enter the details
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("Radhika");
	WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("Vijay");
	WebElement mobnum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	mobnum.sendKeys("7066192623");
	WebElement pwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	pwd.sendKeys("Radhika@93");
	WebElement date = driver.findElement(By.id("day"));
	Select sel1 = new Select(date);
	sel1.selectByVisibleText("8");
	WebElement month = driver.findElement(By.id("month"));
	Select sel2 = new Select(month);
	sel2.selectByVisibleText("Sept");
	WebElement year = driver.findElement(By.id("year"));
	Select sel3 = new Select(year);
	sel3.selectByVisibleText("1993");
	WebElement gender = driver.findElement(By.id("u_0_9"));
	gender.click();
	WebElement signup = driver.findElement(By.id("u_0_11"));
	signup.click();
	}
}