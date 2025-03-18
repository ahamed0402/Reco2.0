package hcl;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdownpractice {
	WebDriver driver;
	WebDriverWait wait;
	ChromeOptions co;

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

	public void dropdown() {
		driver.findElement(By.xpath("//a[@href='/dropdowns']")).click();

		WebElement drop = driver.findElement(By.id("fruits"));

		Select sel = new Select(drop);

		// sel.selectByVisibleText("Mango");
		// sel.selectByIndex(3);
		sel.selectByValue("2");
		WebElement fruits = sel.getFirstSelectedOption();
		System.out.println(fruits.getText());

		WebElement multiple = driver.findElement(By.id("superheros"));
		Select mul = new Select(multiple);
		mul.selectByValue("ta");
		mul.selectByIndex(5);
		mul.selectByVisibleText("Daredevil");

		List<WebElement> allll = mul.getOptions();
		
		for (WebElement webElement : allll) {
			System.out.println(webElement.getText());
		}

		List<WebElement> all = mul.getAllSelectedOptions();
	
		for (WebElement webElement : all) {

			System.out.println(webElement.getText());

		}

		WebElement count = driver.findElement(By.id("country"));

		Select countries = new Select(count);
		countries.selectByVisibleText("india");

		WebElement selected = countries.getFirstSelectedOption();
		System.out.println(selected.getText());

	}

	@AfterMethod
	public void teardown() {

		// driver.close();

	}

}
