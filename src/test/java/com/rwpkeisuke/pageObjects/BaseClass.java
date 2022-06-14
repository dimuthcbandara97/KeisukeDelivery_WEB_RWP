package com.rwpkeisuke.pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.rwpkeisuke.utilities.ReadConfig;


public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
//	public String baseUrlString = "http://127.0.0.1:8000";
//	public String userNameString = "dimuthcathu101@gmal.com";
//	public String passwordString = "asd#@f123dfrg";
	
	public String baseUrlString = readConfig.getApllicationURL();
	public String userNameString = readConfig.getUsername();
	public String passwordString = readConfig.getPassword();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
			driver = new ChromeDriver();
		}else if(browser.equals("edge")){
			System.setProperty("webdriver.edge.driver",readConfig.getEdgePath());
			driver = new EdgeDriver();
		};
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		logger =Logger.getLogger("rwpkeisuke");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterTest
	public void tearDown() {
//		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
}
