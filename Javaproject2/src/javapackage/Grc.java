package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grc {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

	}

	@Test
	public void search() {
		driver.findElement(By.className("gLFyf")).sendKeys("ahamed", Keys.ENTER);

	}

	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
