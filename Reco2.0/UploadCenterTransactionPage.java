package com.reco.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reco.qa.base.TestBase;

public class UploadCenterTransactionPage extends TestBase {
	
 
	
	@FindBy(xpath="/html/body/app-root/layout/thin-fixed-layout/"
			+ "reco-vertical-navigation/div/div[2]/reco-vertical-"
			+ "navigation-aside-item[2]/div/div/mat-icon")
	
	WebElement menuopen;
	
	@FindBy(xpath="//span[normalize-space()='Upload center - Transaction(s)']")
	WebElement uploadtransaction;
	
	@FindBy(xpath ="//span[normalize-space()='Add new']/span")
	WebElement addnew;
	
	@FindBy(xpath = "//p[normalize-space()='Attendance']")
	WebElement attendance;
	
	public UploadCenterTransactionPage() {
		PageFactory.initElements(driver, this); // this refers to the current class
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void transactionmenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuopen)).click();
			
		uploadtransaction.click();
		addnew.click();
	}
	
	public boolean attendancecheck() {
		return attendance.isEnabled();
	}

}
