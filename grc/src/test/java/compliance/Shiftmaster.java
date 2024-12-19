package compliance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Shiftmaster {

	WebDriver driver;
	WebDriverWait wait;
	ChromeOptions co;

	@Test
	public void shiftmaster() throws InterruptedException {
		co = new ChromeOptions();
		co.addArguments("--disable-infobars");
		driver = new ChromeDriver(co);
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get("http://13.203.6.58:7000/#/login");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("username")).sendKeys("qc.test52@aparajitha.net");
		driver.findElement(By.id("password")).sendKeys("Acsl@123");
		driver.findElement(By.id("group_short_name")).sendKeys("amz");
		driver.findElement(By.xpath("//span[contains(text(),' Sign in ')]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement general = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("(//span[normalize-space()='General Master(s)'])[1]")));

		Thread.sleep(7000);

		wait.until(ExpectedConditions.elementToBeClickable(general));

		js.executeScript("arguments[0].click();", general);

		Thread.sleep(3000);

		WebElement shift1 = driver.findElement(By.xpath("//span[normalize-space()='Shift Master']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(shift1).click().perform();

		WebElement splash = driver.findElement(By.tagName("compfie-splash-screen"));
		System.out.println(splash.getTagName());

		WebElement add = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[@class='mat-ripple mat-button-ripple']")));

		wait.until(ExpectedConditions.elementToBeClickable(add));

		js.executeScript("arguments[0].click();", add);

		WebElement unit = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Choose Unit']")));

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(unit));

		js.executeScript("arguments[0].click();", unit);

		WebElement ch = driver.findElement(By.xpath("//span[normalize-space()='Chandigarh Unit']"));
		js.executeScript("arguments[0].click();", ch);

		Thread.sleep(3000);

		WebElement plusbutton = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
		js.executeScript("arguments[0].click();", plusbutton);

		Thread.sleep(3000);

		WebElement shiftname = driver.findElement(By.xpath(
				"//div[contains(@class, 'mat-form-field') and .//mat-label[contains(text(), 'Shift Name')]]//input"));

		shiftname.sendKeys("general");

		Thread.sleep(3000);

		WebElement calendar = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[11]"));
		calendar.click();

		WebElement date = driver.findElement(By.xpath("//span[starts-with(@id,'mat-calendar-button')]"));

		date.click();

		WebElement year = driver.findElement(By.xpath("//div[normalize-space()='2024']"));

		year.click();

		WebElement month = driver.findElement(By.xpath("//div[normalize-space()='FEB']"));

		month.click();

		WebElement days = driver.findElement(By.xpath("//div[normalize-space()='6']"));

		days.click();

		WebElement apply = driver.findElement(By.xpath("//span[normalize-space()='Apply']"));

		apply.click();

		WebElement shift = driver.findElement(By.xpath("//input[@placeholder='Please Fill 24 Hours Format']"));
		shift.sendKeys("0900");

		WebElement shiftend = driver.findElement(By.xpath("(//input[@type='time'])[2]"));
		shiftend.sendKeys("1800");

		WebElement intervalstrt = driver.findElement(By.xpath("(//input[@type='time'])[3]"));
		intervalstrt.sendKeys("0100");

		WebElement intervalend = driver.findElement(By.xpath("(//input[@type='time'])[4]"));
		intervalend.sendKeys("0200");

		// driver.findElement(By.xpath("//*[contains(text(),'Total shift hours ')]"));

		// driver.findElement(By.xpath("//*[contains(text(),'Total working hours')]"));

		actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		actions.sendKeys("0830").perform();

		actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

		actions.sendKeys("1930").perform();

		WebElement color = driver.findElement(By.xpath("(//mat-icon[@role='img'])[50]"));
		color.click();

		WebElement cursor = driver.findElement(By.xpath("(//div[@class='cursor'])[2]"));

		actions.clickAndHold(cursor).moveByOffset(65, 0).release().perform();
		
		Thread.sleep(2000);
		
		WebElement colorcode = driver.findElement(By.xpath("(//div[@class='cursor'])[1]"));
		
		colorcode.click();
		
		WebElement finalcolorselection = driver.findElement(By.className("saturation-lightness"));
		
		finalcolorselection.click();

		WebElement ok = driver.findElement(By.xpath("(//*[contains(text(),'OK')])[2]"));

		ok.click();

		WebElement remarks = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Remarks ')]")));

		actions.moveToElement(remarks).click().sendKeys(Keys.chord("Test by automation")).perform();

		WebElement save = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[normalize-space()='Save & Close'])[2]")));

		actions.moveToElement(save).click().perform();
		
		WebElement submit = driver.findElement(By.xpath("//*[normalize-space()='Submit as save']"));
		submit.click();

	}

}
