package javapackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//login page elements
public class Baseclass {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Baseclass(WebDriver  driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	}
	
	@FindBy(xpath ="//input[@id='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='group_short_name']")
	WebElement Groupshortname;
	
	@FindBy(xpath="//span[contains(text(),' Sign in ')]")
	WebElement signin;
	
	@FindBy(xpath ="//td[normalize-space()='Walmart Focused']")
    WebElement legal;

   @FindBy(xpath ="//span[contains(text(),' Select ')]")
    WebElement selectButton;
	
	
	public void enterUsername(String username) {
       this.username.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void groupname(String Groupshortname) {
        this.Groupshortname.sendKeys(Groupshortname);
    }
    public void clickSignIn() {
        this.signin.click();
    }
	
    public void clickLegal() {
        wait.until(ExpectedConditions.visibilityOf(legal)).click();
    }

    public void clickSelect() {
        selectButton.click();
    }

    
}
