package compliance;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cgmbaseclass {

	WebDriver driver;
	WebDriverWait wait;

	public Cgmbaseclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='group_short_name']")
	WebElement group;

	@FindBy(xpath = "//span[contains(text(),' Sign in ')]")
	WebElement signin;

	@FindBy(xpath = "//td[normalize-space()='Walmart Dividend']")
	WebElement legal;

	@FindBy(xpath = "//span[contains(text(),' Select ')]")
	WebElement selectButton;

	public void enterUsername(String username) {
		wait.until(ExpectedConditions.elementToBeClickable(this.username)); 
		this.username.sendKeys(username);
	}

	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}

	public void groupname(String group) {
		this.group.sendKeys(group);
	}

	
	public void clickSignIn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", signin);

	}

	public void clickLegal() {
		wait.until(ExpectedConditions.elementToBeClickable(legal)).click();
	}

	public void clickSelect() throws InterruptedException {
		selectButton.click();
	}

	
	
}
