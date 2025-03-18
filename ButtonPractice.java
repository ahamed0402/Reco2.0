package hcl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.reactivex.rxjava3.functions.Action;

public class ButtonPractice {
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
	public void buttontestpractice() {

		driver.findElement(By.xpath("//a[@href='/button']")).click();

		driver.findElement(By.id("home")).click();

		// navigate
		driver.navigate().back();
		

		// get x and y coordinates

		Point point = driver.findElement(By.id("position")).getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println(x + " " + y);

		// get color

		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(color);

		// get height and width

		Rectangle rect = driver.findElement(By.id("property")).getRect();
		int h = rect.getHeight();
		int w = rect.getWidth();
		System.out.println(h + " " + w);

		// check button is enabled or not
		WebElement button = driver.findElement(By.id("isDisabled"));
		boolean enabled = button.isEnabled();
		System.out.println(enabled);

		// buttonhold

		Actions action = new Actions(driver);

		WebElement hold = driver.findElement(By.xpath("//button[@class='button is-primary']/div"));

		action.clickAndHold(hold).build().perform();
		action.release();

	}

	@AfterMethod
	public void teardown() {

		// driver.close();

	}

}