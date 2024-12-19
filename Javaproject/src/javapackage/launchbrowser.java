package javapackage;

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
//import org.openqa.selenium.support.ui.Select;

public class launchbrowser {

	public static void main(String[] args) throws InterruptedException  {
		// Generate register
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-infobars");
		driver = new ChromeDriver(option);
		driver.get("http://52.66.68.173:9030/#/login");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("qc.test52@aparajitha.net");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Acsl@123");
		
		driver.findElement(By.xpath("//input[@id='group_short_name']")).sendKeys("wal");
		
		driver.findElement(By.xpath("//span[contains(text(),' Sign in ')]")).click();
		WebElement legal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='Walmart Focused']")));
		legal.click();
		driver.findElement(By.xpath("//span[contains(text(),' Select ')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' Registers ')]")).click();
		
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   
		   WebElement dropdown = driver.findElement(By.xpath("(//div[@id='mat-select-value-13'])[1]"));
		   js.executeScript("arguments[0].click();", dropdown);
		   
		   WebElement selectunit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()='Compliance Focused D'])[1]")));
		   selectunit.click();
		   
		   WebElement selectpaygroup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mat-select-value-15']")));
		   js.executeScript("arguments[0].click();", selectpaygroup);
		   
		  
		   
		   WebElement checkbox	= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='mat-ripple mat-mdc-option-ripple']")));
		   js.executeScript("arguments[0].click();", checkbox);
		   
		 
		   Actions actions = new Actions(driver);
		   actions.sendKeys(Keys.TAB).perform();
		   
		   
		   
		   WebElement acttype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mat-select-value-1']")));
		   js.executeScript("arguments[0].click();", acttype);
		   
		   WebElement selectact = driver.findElement(By.xpath("//span[normalize-space()='State']"));
		   js.executeScript("arguments[0].click();", selectact);
		   
		   Thread.sleep(2000);
		   
		   WebElement register = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath ("//mat-label[contains(text(),'Register')]")));
		   js.executeScript("arguments[0].click();", register);
		   
		  
		   
		   WebElement registerselect = driver.findElement(By.xpath("(//span[normalize-space()='Damage or Loss PC'])[1]"));
		   js.executeScript("arguments[0].scrollIntoView(true);", registerselect);
		   js.executeScript("arguments[0].click();", registerselect);
		   actions.sendKeys(Keys.TAB).perform();
		   
		   
		   WebElement state	 = driver.findElement(By.xpath("//mat-label[contains(text(),'State Name')]"));
		   state.click();	
		   
		   WebElement stateselection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Odisha']")));
		   js.executeScript("arguments[0].scrollIntoView(true);", stateselection);
		   js.executeScript("arguments[0].click();", stateselection);
		   actions.sendKeys(Keys.TAB).perform();
		   
		   WebElement chooseact = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-label[contains(text(),'Choose an Act')]")));
		   chooseact.click();
		   
		   
		   WebElement actbased = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Shop and Establishment Act']")));
		   js.executeScript("arguments[0].scrollIntoView(true);", actbased);
		   js.executeScript("arguments[0].click();", actbased);
		   actions.sendKeys(Keys.TAB).perform();
		   
		   
		   WebElement month	 = driver.findElement(By.xpath("//mat-label[contains(text(),'Month')]"));
		   month.click();	
		   
		   WebElement selectmonth = driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text'][normalize-space()='April']"));
		   selectmonth.click();
		   actions.sendKeys(Keys.TAB).perform();
		   
		   WebElement year	 = driver.findElement(By.xpath("//mat-label[contains(text(),'Year')]"));
		   year.click();
		   
		   WebElement chooseyear = driver.findElement(By.xpath("//span[normalize-space()='2024']"));
		   chooseyear.click();
		   
		   WebElement pdf	= driver.findElement(By.xpath("//span[normalize-space()='PDF']"));
		   pdf.click();
		   
		   
		   WebElement report = driver.findElement(By.xpath(" //span[normalize-space()='Generate report']"));
		   report.click();
		
		   
		   Thread.sleep(3000);
		   WebElement downloadstatus = driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[14]"));
		   downloadstatus.click();
				   
		   
		   WebElement generatepdf = driver.findElement(By.xpath("//img[@title='PDF File']"));
		   generatepdf.click();
		   
		   
		   driver.quit();
		   
		

	}

}
