package javapackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	WebDriver driver;
	WebDriverWait wait;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Input Template Upload']")
	WebElement inputTemplateUploadButton;

	@FindBy(xpath = "//span[normalize-space()='Add New']")
	WebElement addNewButton;

	@FindBy(xpath = "(//div[@id='mat-select-value-13'])[1]")
	WebElement unitDropdown;

	
	//div[@id='mat-select-value-13']
	//@FindBy(xpath = "//span[@class='mdc-list-item__primary-text'][normalize-space()='Compliance Focused D']")
	//WebElement unitOption;
	
	@FindBy(xpath = "//span[normalize-space()='Compliance Focused D']")
	WebElement unitOption;

	@FindBy(xpath = "//mat-label[contains(text(),' Choose Employee Paygroup ')]")
	WebElement payGroupDropdown;

	@FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[1]")
	WebElement payGroupOption;

	@FindBy(xpath = "//mat-label[contains(text(),'Month')]")
	WebElement monthDropdown;

	@FindBy(xpath = "//span[contains(text(),'April')]")
	WebElement monthOption;

	@FindBy(xpath = "//mat-label[contains(text(),'Year')]")
	WebElement yearDropdown;

	@FindBy(xpath = "//span[normalize-space()='2024']")
	WebElement yearOption;

	@FindBy(xpath = "//div[normalize-space()='Employee Master']")
	WebElement templateOption;

	@FindBy(xpath = "//div[@class='upload-drop-zone']")
	WebElement browseFileZone;

	@FindBy(xpath = "//span[normalize-space()='Import']")
	WebElement importButton;

	// Actions
	public void clickInputetemplate() {
		inputTemplateUploadButton.click();
	}
	

	public void clickAddNew() {
		addNewButton.click();
	}

	public void selectUnit() {
		wait.until(ExpectedConditions.visibilityOf(unitDropdown)).click();
	}

	public void selectUnitOption(String UnitText) {
		wait.until(ExpectedConditions.visibilityOf(unitOption)).click();
	}

	public void selectPaygroup() {
		wait.until(ExpectedConditions.visibilityOf(payGroupDropdown)).click();
	}

	public void selectPaygroupOption(String paygroupText) {
		wait.until(ExpectedConditions.visibilityOf(payGroupOption)).click();
	}

	public void selectMonthDropDown() {
		monthDropdown.click();
	}

	public void selectMonthOption(String monthText) {
		monthOption.click();

	}

	public void selectYearDropdown() {
		yearDropdown.click();
	}

	public void selectYearOption(String yearText) {
		yearOption.click();
	}

	public void selectTemplate(String templateText) {
		templateOption.click();
	}

	public void clickBrowseFile() {
		wait.until(ExpectedConditions.visibilityOf(browseFileZone)).click();
	}

	public void clickUpload() {
		wait.until(ExpectedConditions.visibilityOf(importButton)).click();
	}

}
