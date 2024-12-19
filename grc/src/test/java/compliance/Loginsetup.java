package compliance;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Loginsetup {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup()

	{
		driver = new ChromeDriver();
		driver.get("http://52.66.68.173:9030/#/login");
		driver.manage().window().maximize();

	}

	@Test
	public void login() throws InterruptedException {
	
		
		WebElement username = driver.findElement(By.xpath("//input[@id='Username']"));
		username.sendKeys("qc.test52@aparajitha.net");

		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("Acsl@123");

		WebElement group = driver.findElement(By.xpath("//input[@id='group_short_name']"));
		group.sendKeys("wal");

		WebElement sigin = driver.findElement(By.xpath("//span[@class='ng-tns-c279-1 ng-star-inserted']"));
		sigin.click();
		
		WebElement legal = driver.findElement(By.xpath("//td[normalize-space()='Walmart Dividend']"));
		legal.click();

		WebElement select = driver.findElement(By.xpath("//span[@class='mdc-button__label']"));
		select.click();

		}

	
	@AfterClass
	public void browserclose() {
		driver.quit();
	}
}
