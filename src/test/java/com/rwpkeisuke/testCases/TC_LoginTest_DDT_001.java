package com.rwpkeisuke.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rwpkeisuke.pageObjects.BaseClass;
import com.rwpkeisuke.pageObjects.LoginPage;
import com.rwpkeisuke.utilities.XLUtils;

public class TC_LoginTest_DDT_001 extends BaseClass
{
	@Test(dataProvider = "LoginData")
	public void loginDDT(String userString,String pwdString) throws InterruptedException 
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(userString);
		logger.info("user name provided");
		loginPage.setPassword(pwdString);
		logger.info("password provided");
//		loginPage.loginButton();
		
		Thread.sleep(3000);
		
//		if(isAlertPresent()==true) {
//			driver.switchTo().alert().accept();
//			driver.switchTo().defaultContent();
//			Assert.assertTrue(false);
//			logger.warn("Login Failed");
//		}else {
//			Assert.assertTrue(true);
//			logger.info("Login Passed");
//			loginPage.clickLogout();
//			Thread.sleep(3000);
//			driver.switchTo().alert().accept();
//			driver.switchTo().defaultContent();
//		}
		
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	@DataProvider(name = "LoginData")
	String [][] getData() throws IOException {
		String pathString="E:\\Chathu\\NIBM SQA\\EclipseWorkPlace\\KEISUKE_WEB_AUTOMATION_With_Jenkins\\src\\test\\java\\com\\rwpkeisuke\\testData\\LoginData.xlsx";
		
		int rownum = XLUtils.getRowCount(pathString, "Sheet1");
		int colcount = XLUtils.getCellCount(pathString, "Sheet1", 1);
		
		String loginDataString[][] = new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				loginDataString[i-1][j]=XLUtils.getCellData(pathString,"Sheet1", i,j);				
			}
		}
		return loginDataString;
	}

}
