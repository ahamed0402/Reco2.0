package hcl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Seleniumpractice {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://letcode.in/test");

	}

	@Test

	public void inputkeys() {

		WebElement inputfield = driver.findElement(By.xpath("//a[@href='/edit']"));
		inputfield.click();

		WebElement label = driver.findElement(By.className("label"));
		String firstlabel = label.getText();
		// System.out.println(firstlabel);
		Assert.assertEquals("Enter your full Name", firstlabel);

		WebElement name = driver.findElement(By.id("fullName"));
		name.sendKeys("ahamed");

		driver.findElement(By.id("join")).sendKeys(" at selenium", Keys.TAB);

		String myvalue = driver.findElement(By.id("getMe")).getAttribute("value");
		
		System.out.println(myvalue);

		WebElement cleartext = driver.findElement(By.id("clearMe"));
		cleartext.clear();

		WebElement fielddisabled = driver.findElement(By.id("noEdit"));
		boolean flag = fielddisabled.isEnabled();
		System.out.println(flag);

		String isreadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isreadonly);

	}

	@AfterMethod
	public void teardown() {

driver.close();

	}

}
