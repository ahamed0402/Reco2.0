package javapackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions ;
import org.openqa.selenium.support.ui.WebDriverWait;

public class importtemplate {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-infobars");
		driver = new ChromeDriver(option);
		driver.get("http://52.66.68.173:9030/#/login");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Username']")));
				user.sendKeys("qc.test52@aparajitha.net");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Acsl@123");
		
		driver.findElement(By.xpath("//input[@id='group_short_name']")).sendKeys("wal");
		
		driver.findElement(By.xpath("//span[contains(text(),' Sign in ')]")).click();
		WebElement legal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='Walmart Focused']")));
		legal.click();
		driver.findElement(By.xpath("//span[contains(text(),' Select ')]")).click();

		driver.findElement(By.xpath("//span[normalize-space()='Input Template Upload']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Add New']")).click();
		
		WebElement unit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='mat-select-value-13'])[1]")));
		unit.click();
		
		WebElement chooseunit = driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text'][normalize-space()='Compliance Focused D']"));
		chooseunit.click();
		
		WebElement paygroup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='mat-select-value-15'])[1]")));
		paygroup.click();
		
		
		WebElement choosepaygroup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='mdc-list-item__primary-text'])[1]")));
		choosepaygroup.click();
		
		WebElement month = driver.findElement(By.xpath("//mat-label[contains(text(),'Month')]"));
		month.click();
		
		WebElement choosemonth = driver.findElement(By.xpath("//span[contains(text(),'April')]"));
		choosemonth.click();
		
		WebElement year = driver.findElement(By.xpath("//mat-label[contains(text(),'Year')]"));
		year.click();
		
		WebElement chooseyear = driver.findElement(By.xpath("//span[normalize-space()='2024']"));
		chooseyear.click();
		
		WebElement choosetemplate = driver.findElement(By.xpath("//div[normalize-space()='Employee Master']"));
		choosetemplate.click();
		
		
		WebElement browsefile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='upload-drop-zone']")));
		browsefile.click();
	
		
		
		Robot robot = new Robot();
        robot.setAutoDelay(2000);

        // Copy the file path to clipboard
        String filePath = "X:\\Team\\Ahamed.I\\Employee Master_Template_04092024_104439.xlsx";
        java.awt.datatransfer.StringSelection stringSelection = new java.awt.datatransfer.StringSelection(filePath);
        java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Simulate Ctrl+V to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate Enter key to confirm
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
		
		WebElement upload = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Import']")));
		upload.click();
		
	}

}
