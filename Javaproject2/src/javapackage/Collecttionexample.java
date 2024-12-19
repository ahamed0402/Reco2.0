package javapackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collecttionexample {
	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://mypeople.aparajitha.com/");
        driver.manage().window().maximize();   
		WebElement sigin = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='iamUrlSigninBtn']")));
		sigin.click();
		
		WebElement username = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login_id']")));
		username.sendKeys("ahamed.i@aparajitha.com");
		
		WebElement nxtbutton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='nextbtn']")));
		nxtbutton.click();
		
		WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		pwd.sendKeys("Amayra@786");
		
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()='Sign in'])[2]")));
		login.click();
		
		//WebElement later = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Remind me later']")));
		//later.click();
		
		Thread.sleep(3000);
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		/*for (WebElement link: alllinks)
		{
			System.out.println(link.getAttribute("href"));
		}
		
		*/
		
		Iterator <WebElement> iterator  = alllinks.iterator();
		
		while (iterator.hasNext())
		{
			System.out.println(iterator.next().getAttribute("href"));
		}
		driver.quit();

	}

}
