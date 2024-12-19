package compliance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Groupsexample {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	
	@Test(groups = {"Smoke"})
	public void applaunch() {
		driver = new ChromeDriver();
		driver.get("http://13.203.6.58:9030/#/login");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@Test(groups = {"Sanity"})
	public void loginsetup()
	{
		
		driver.findElement(By.id("Username")).sendKeys("qc.test52@aparajitha.net");
		driver.findElement(By.id("password")).sendKeys("Ahamed@123");
		driver.findElement(By.id("group_short_name")).sendKeys("wal");
	}

	
	@Test(groups = {"Smoke", "Regression"})
	public void teardown() {
		
		driver.quit();
	}
}


