package compliance;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Componentcreationandmapping {

	WebDriver driver;
	WebDriverWait wait;
	ChromeOptions co;
	/*
	 * @Test(enabled = false) public void loginsetup() throws InterruptedException,
	 * IOException { co = new ChromeOptions();
	 * co.addArguments("--disable-infobars"); driver = new ChromeDriver(co); wait =
	 * new WebDriverWait(driver, Duration.ofSeconds(30));
	 * 
	 * driver.get("http://13.203.6.58:7000/#/login");
	 * driver.manage().window().maximize();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * driver.findElement(By.id("username")).sendKeys("qc.test52@aparajitha.net");
	 * driver.findElement(By.id("password")).sendKeys("Acsl@123");
	 * driver.findElement(By.id("group_short_name")).sendKeys("amz");
	 * driver.findElement(By.xpath("//span[contains(text(),' Sign in ')]")).click();
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * 
	 * WebElement general = wait.until(ExpectedConditions
	 * .presenceOfElementLocated(By.
	 * xpath("(//span[normalize-space()='General Master(s)'])[1]")));
	 * 
	 * Thread.sleep(3000);
	 * wait.until(ExpectedConditions.elementToBeClickable(general));
	 * 
	 * js.executeScript("arguments[0].click();", general);
	 * 
	 * WebElement generalcomponents = wait.until(ExpectedConditions
	 * .presenceOfElementLocated(By.
	 * xpath(" //span[normalize-space()='General Component(s)'] ")));
	 * 
	 * Thread.sleep(3000);
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(generalcomponents));
	 * 
	 * js.executeScript("arguments[0].click();", generalcomponents);
	 * 
	 * WebElement componentcreation = wait.until(ExpectedConditions
	 * .presenceOfElementLocated(By.
	 * xpath(" //span[normalize-space()='Component Creation'] ")));
	 * 
	 * Thread.sleep(3000);
	 * wait.until(ExpectedConditions.elementToBeClickable(componentcreation));
	 * 
	 * js.executeScript("arguments[0].click();", componentcreation);
	 * 
	 * WebElement add = wait
	 * .until(ExpectedConditions.presenceOfElementLocated(By.xpath(
	 * "//mat-icon[normalize-space()='add']")));
	 * 
	 * Thread.sleep(3000); wait.until(ExpectedConditions.elementToBeClickable(add));
	 * 
	 * js.executeScript("arguments[0].click();", add);
	 * 
	 * Thread.sleep(3000);
	 * 
	 * WebElement unit = wait .until(ExpectedConditions.presenceOfElementLocated(By.
	 * xpath(" //span[normalize-space()='Choose Unit'] ")));
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(unit));
	 * 
	 * 
	 * unit.click();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * WebElement selectunit = wait.until(
	 * ExpectedConditions.presenceOfElementLocated(By.
	 * xpath(" //span[normalize-space()='Chandigarh Unit'] ")));
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(selectunit));
	 * 
	 * 
	 * selectunit.click();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * WebElement personal = wait.until(
	 * ExpectedConditions.presenceOfElementLocated(By.xpath(
	 * "//mat-icon[normalize-space()='account_box']")));
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(personal));
	 * 
	 * personal.click();
	 * 
	 * 
	 * Actions action = new Actions (driver);
	 * 
	 * WebElement marital =
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.
	 * xpath("//span[normalize-space()='Marital Status']")));
	 * 
	 * action.moveToElement(marital).perform();
	 * 
	 * 
	 * 
	 * 
	 * WebElement marital =
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//table/tbody/tr[6]/td[5]")));
	 * 
	 * marital.click();
	 * 
	 * System.out.println(marital.isSelected()); // it will show false when we dont
	 * have the input tag
	 * 
	 * personal.click(); // to close the accordian
	 * 
	 * WebElement submit = wait .until(ExpectedConditions.elementToBeClickable(By.
	 * xpath("//span[normalize-space()='Submit as save']"))); submit.click();
	 * 
	 * driver.close();
	 */

	// component mapping

	@Test(enabled = true)
	public void loginsetup2() throws InterruptedException, IOException {
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

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(general));

		js.executeScript("arguments[0].click();", general);

		WebElement componentmapping = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Component Mapping']")));

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(componentmapping));

		js.executeScript("arguments[0].click();", componentmapping);

		WebElement add = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-icon[normalize-space()='add']")));

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(add));

		js.executeScript("arguments[0].click();", add);
		
		
		WebElement unit = driver.findElement(By.xpath("//span[normalize-space()='Choose Unit']"));
		js.executeScript("arguments[0].click();", unit);

		Thread.sleep(3000);

		WebElement ch = driver.findElement(By.xpath("//span[normalize-space()='Chandigarh Unit']"));
		js.executeScript("arguments[0].click();", ch);

		Thread.sleep(3000);
		
		
		WebElement pay = driver.findElement(By.xpath("//span[normalize-space()='Employee Pay Group']"));
		js.executeScript("arguments[0].click();", pay);

		Thread.sleep(3000);
		
		
		WebElement paygroup = driver.findElement(By.xpath("//span[normalize-space()='Executive']"));
		js.executeScript("arguments[0].click();", paygroup);

		Thread.sleep(3000);
		
		
		WebElement showdetail = driver.findElement(By.xpath("//mat-icon[normalize-space()='sort']"));
		js.executeScript("arguments[0].click();", showdetail);

		Thread.sleep(3000);
		
		
		WebElement save = driver.findElement(By.xpath("//span[normalize-space()='Submit as save']"));
		js.executeScript("arguments[0].click();", save);

		Thread.sleep(3000);

	}

}
