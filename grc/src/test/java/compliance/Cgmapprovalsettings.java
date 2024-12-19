package compliance;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Cgmapprovalsettings {

	WebDriver driver;
	WebDriverWait wait;

	public Cgmapprovalsettings(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		PageFactory.initElements(driver, this);
	}

	
//	@FindBy(xpath = "(//span[normalize-space()='General Master(s)'])[1]")
//	WebElement Generalmaster;
	
	
	@FindBy(xpath = "//span[normalize-space()='General Setting(s)']")
	WebElement Generalsettings;
	
	@FindBy(xpath = "//span[normalize-space()='Approval Setting(s)']")
	WebElement Approvalsettings;
	
	
	@FindBy(xpath="//mat-icon[normalize-space()='add']")
	WebElement Addnew;
	
	
	@FindBy(xpath = "//label[@for='mat-radio-96-input']//span[@class='mat-radio-label-content']")
	WebElement Unitradio;
	
	
	@FindBy(xpath= "//span[normalize-space()='Choose Unit']")
	WebElement UnitDropdown;
	
	
	@FindBy(xpath= "//span[normalize-space()='Dividend Unit B']")
	WebElement ChooseUnit;
	
	
	@FindBy(xpath = "//span[normalize-space()='Choose Module']")
	WebElement Module;
	
	
	@FindBy(xpath = "/span[normalize-space()='General Masters Module']")
	WebElement generalmastermodule;
	
	@FindBy(xpath = "//span[normalize-space()='Choose Type of Approval(s)']")
	WebElement Typeofapprovals;
	
	
	@FindBy(xpath= "//span[normalize-space()='Employee Master']")
	WebElement approvalsmenu;
	
	@FindBy(xpath="//label[@for='mat-radio-106-input']//span[@class='mat-radio-label-content']")
	WebElement Autoapproval;
	
	@FindBy(xpath="//span[normalize-space()='Send for Approval']")
	WebElement sendforapproval;
	
	
	/*
	 * public void master() {
	 * wait.until(ExpectedConditions.elementToBeClickable(Generalmaster));
	 * this.Generalmaster.click(); }
	 */
	
	public void general()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Generalsettings));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", Generalsettings);
		
	}

	
	public void approvalsettings() throws InterruptedException
	{
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(Approvalsettings));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", Approvalsettings);
		
	}
	
	public void addnew()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Addnew));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", Addnew);
		
	}
	
	
	public void unitradio()
	{

		wait.until(ExpectedConditions.elementToBeClickable(Unitradio));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", Unitradio);
	}
	
	public void unitdrop ()
	{
wait.until(ExpectedConditions.elementToBeClickable(UnitDropdown));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", UnitDropdown);
	}
	
	
	public void unitselect()
	{
wait.until(ExpectedConditions.elementToBeClickable(ChooseUnit));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", ChooseUnit);
    }
	
	
	public void module()
	{
wait.until(ExpectedConditions.elementToBeClickable(Module));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", Module);
		
	}
	
	public void moduleselect()
	
	{
		this.generalmastermodule.click();
	}
	
	public void type()
	{
		this.Typeofapprovals.click();
	}
	
	public void typeapprovalselect()
	{
		this.approvalsmenu.click();
	}
	
	public void approvals()
	{
		this.Autoapproval.click();
	}
	
	public void send()
	{
		this.sendforapproval.click();
	}
	
}
