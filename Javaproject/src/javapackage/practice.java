package javapackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//CSM login 
public class practice {
	
	WebDriver driver;
	WebDriverWait wait;
	String username = "admin";
	String pwd = "Admin$321";
	

	@BeforeClass
	public void setup()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-infobars");
		driver = new ChromeDriver(option);
		driver.get("http://52.66.68.173:9000/#/login");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void login()
	{
		
		
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement usr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
		WebElement pd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Sign in']")));

		usr.sendKeys(username);
		pd.sendKeys(pwd);
		btn.click();
		
		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Statutory Master(s)']")));
		menu.click();
		
	
	}
	
	
	@AfterClass
	public void browserclose()
	{
		//driver.quit();
	}
	

}
