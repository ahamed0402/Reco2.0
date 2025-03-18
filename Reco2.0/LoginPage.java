package com.reco.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reco.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "Username")
	WebElement user;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id = "group_short_name")
	WebElement group;

	// before signin i have captcha - what can be done here need to analyse
	
	@FindBy(xpath = "//input[@placeholder='Enter Captcha']")
	WebElement captcha;

	@FindBy(xpath = "//span[normalize-space()='Sign in']/div")
	WebElement signin;

	@FindBy(xpath = "//img[contains(@class,'w-60')]")
	WebElement apjlogo;

	public LoginPage() {
		PageFactory.initElements(driver, this); // this refers to the current class
	}

	public String verifytitle() {
		return driver.getTitle();
	}

	public boolean verifylogo() {
		return apjlogo.isDisplayed();
	}

	public UploadCenterTransactionPage login(String un, String pwd, String grp) {
		user.sendKeys(un);
		pass.sendKeys(pwd);
		group.sendKeys(grp);
		captcha.clear();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		signin.click();
		
		return new UploadCenterTransactionPage();
		
		}
	}


