package com.reco.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reco.qa.base.TestBase;
import com.reco.qa.pages.LoginPage;
import com.reco.qa.pages.UploadCenterTransactionPage;

public class UploadCenterTransactionPageTest extends TestBase {
    LoginPage loginpage;
	UploadCenterTransactionPage uploadtransaction;
	
	public UploadCenterTransactionPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		uploadtransaction = new UploadCenterTransactionPage();
		loginpage = new LoginPage();
		uploadtransaction=	loginpage.login(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("groupshortname"));
		
	}
	
	@Test
	public void validatattendance() {
		uploadtransaction.transactionmenu();
		boolean flag = uploadtransaction.attendancecheck();
		Assert.assertTrue(flag);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
