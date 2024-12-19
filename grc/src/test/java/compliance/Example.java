package compliance;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Example {
//screenshot example
	WebDriver driver;
	WebDriverWait wait;
	ChromeOptions Co;

	@BeforeClass
	public void setup() {
		Co = new ChromeOptions();
		driver = new ChromeDriver(Co);
		driver.get("http://13.203.6.58:7000/#/login");
		String title = driver.getTitle();
		System.out.println(title);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@Test
	public void login() throws IOException, InterruptedException {

		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username.sendKeys("qc.test52@aparajitha.net");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		password.sendKeys("Ahamed@123");

		//failing the cases
		WebElement group = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("group_short_name")));
		group.sendKeys("wal");

		WebElement sign = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),' Sign in ')]")));
		sign.click();
		
		Thread.sleep(3000);
		
		WebElement legal  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		legal.click();
		
		
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File src =
		 * ts.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("C:\\Users\\ahamed.i\\eclipse-workspace\\grc\\test-output" +
		 * "fail.png"); FileUtils.copyFile(src, dest);
		 */
		

	}

	@AfterClass
	public void teardown() {

		//driver.close();
	}
}
