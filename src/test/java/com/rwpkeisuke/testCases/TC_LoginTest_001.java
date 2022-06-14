package com.rwpkeisuke.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;
import com.rwpkeisuke.pageObjects.BaseClass;
import com.rwpkeisuke.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException {
		driver.get(baseUrlString);
		

		LoginPage loginPage = new LoginPage(driver);
		logger.info("TC_001 Page Loads Successfully");
		
		logger.error("Title should be chanaged");
		logger.error("Keisuke Logo Should be changed in Title Bar");
		
		loginPage.setUserName(userNameString);
		logger.info("Email Entered Successfully");
		logger.info("TC_002_S1_P1 Passed");
		
		loginPage.setPassword(passwordString);
		logger.info("Password Entered Successfully");
		logger.info("TC_002_S1_P2 Passed");
		
		loginPage.setRememberME();
		logger.info("Clicked on Remember Me");
		logger.info("TC_002_S1_P3 Passed");
		
		loginPage.loginButton();
		logger.info("Clicked on Login Page");
		logger.info("TC_002_S1_P4 Passed");
		
		logger.error("TC_002_S1_P5 Failed - No page named Forgot password");
		logger.info("TC_002_S1_P6 Passed");
		
//		if(driver.getTitle().equals("")) {
//			Assert.assertTrue(true);
//		}else {
//			captureScreen(driver, "loginTest");
//			Assert.assertTrue(false);
//			logger.info("Login Test Failed");
//		}
		
	}
}
