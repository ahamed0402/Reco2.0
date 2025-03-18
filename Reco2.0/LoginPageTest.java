package com.reco.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reco.qa.base.TestBase;

import com.reco.qa.pages.LoginPage;
import com.reco.qa.pages.UploadCenterTransactionPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	UploadCenterTransactionPage transaction;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		
	}

	@Test(priority = 1)
	public void validatetitile() {
		String title = loginpage.verifytitle();
		Assert.assertEquals(title, "Reco");
	}

	@Test(priority = 2)
	public void validateimg() {
		boolean flag = loginpage.verifylogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void logintest() throws InterruptedException {
		transaction = loginpage.login(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("groupshortname"));

	}
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
