package compliance;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Patternconfigexample {

	WebDriver driver;
	WebDriverWait wait;
	ChromeOptions co;

	@Test
	public void loginsetup() throws InterruptedException, IOException {
		co = new ChromeOptions();
		co.addArguments("--disable-infobars");
		driver = new ChromeDriver(co);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("http://13.203.6.58:7000/#/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("qc.test52@aparajitha.net");
		driver.findElement(By.id("password")).sendKeys("Acsl@123");
		driver.findElement(By.id("group_short_name")).sendKeys("amz");
		driver.findElement(By.xpath("//span[contains(text(),' Sign in ')]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement general = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("(//span[normalize-space()='General Master(s)'])[1]")));

		Thread.sleep(15000);
		wait.until(ExpectedConditions.elementToBeClickable(general));

		js.executeScript("arguments[0].click();", general);

		driver.findElement(By.xpath("//span[normalize-space()='Pattern Configuration']")).click();

		WebElement employee = driver.findElement(By.xpath("//span[normalize-space()='Core Employee(s)']"));
		js.executeScript("arguments[0].click();", employee);

		Thread.sleep(3000);

		WebElement add = driver.findElement(By.xpath("//mat-icon[normalize-space()='add']"));
		js.executeScript("arguments[0].click();", add);

		WebElement unit = driver.findElement(By.xpath("//span[normalize-space()='Choose Unit']"));
		js.executeScript("arguments[0].click();", unit);

		Thread.sleep(3000);

		WebElement uttarakhand = driver.findElement(By.xpath("//span[normalize-space()='Chandigarh Unit']"));
		js.executeScript("arguments[0].click();", uttarakhand);

		Thread.sleep(3000);

		WebElement automaticradio = driver.findElement(By.xpath("(//span[@class='mat-radio-outer-circle'])[1]"));
		js.executeScript("arguments[0].click();", automaticradio);

		System.out.println("Automatic is selected:" + automaticradio.isSelected());

		WebElement pattern = driver
				.findElement(By.xpath("//button[normalize-space()='Click here to configure Pattern']"));
		pattern.click();

		System.out.println("pattern is enabled:" + pattern.isEnabled());

		WebElement digits = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@maxlength='1'])[1]")));

		wait.until(ExpectedConditions.elementToBeClickable(digits));

		digits.sendKeys("1");

		WebElement startingvalue = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@maxlength='4'])[1]")));

		wait.until(ExpectedConditions.elementToBeClickable(startingvalue));

		startingvalue.sendKeys("003");

		WebElement incrementby = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@maxlength='1'])[2]")));
		wait.until(ExpectedConditions.elementToBeClickable(incrementby));

		incrementby.sendKeys("1");

		WebElement separator = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mat-select-value-5']")));
		wait.until(ExpectedConditions.elementToBeClickable(separator));

		separator.click();

		WebElement separatordropdown = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='_']")));
		wait.until(ExpectedConditions.elementToBeClickable(separatordropdown));

		separatordropdown.click();

		WebElement prefixcode = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='mat-button-wrapper'])[10]")));
		wait.until(ExpectedConditions.elementToBeClickable(prefixcode));

		prefixcode.click();

		WebElement choosepattern = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Choose Pattern']")));
		wait.until(ExpectedConditions.elementToBeClickable(choosepattern));

		choosepattern.click();

		WebElement selectpattern = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Group Short Name']")));
		wait.until(ExpectedConditions.elementToBeClickable(selectpattern));

		selectpattern.click();

		WebElement save = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Save & Close']")));
		wait.until(ExpectedConditions.elementToBeClickable(save));

		save.click();

		Thread.sleep(2000);

		try {

			WebElement submit = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Submit as save']")));
			wait.until(ExpectedConditions.elementToBeClickable(submit));

			submit.click();
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}

		WebElement toast = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("compfie-toast-notification")));

		String expectedtext = " Successfully Created ";

		String actualtext = toast.getText();

		if (expectedtext.equals(actualtext)) {
			System.out.println("toast is verified");
		} else {
			System.out.println("toast is not verified");
		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File ("test-output/screenshot.png");
		
		FileUtils.copyFile(src, dest);
		
		
	}
}
