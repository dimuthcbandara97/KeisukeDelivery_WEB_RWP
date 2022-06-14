package com.rwpkeisuke.pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public String randomString() {
		String genString = RandomStringUtils.randomAlphabetic(8);
		return genString;
	}
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver) {
		ldriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	// email
	@FindBy(id = "email")
	@CacheLookup
	WebElement txtUsernamElement;
	
	public void setUserName(String unameString) {
		txtUsernamElement.sendKeys(unameString);
	}
	
	// password
	@FindBy(id = "password")
	@CacheLookup
	WebElement txtPasswordElement;	
	public void setPassword(String pawdString) {
		txtPasswordElement.sendKeys(pawdString);
	}
	
	// remember me
	
	@FindBy(xpath = "//label[contains(text(),' ')]")
	@CacheLookup
	WebElement txtRememberMElement;	
	public void setRememberME() {
		txtRememberMElement.click();;
	}
	
	// login button
	@FindBy(xpath = "//button[contains(text(),'In')]")
	@CacheLookup
	WebElement btnLoginElement;
	
	public void loginButton() {
		btnLoginElement.click();
	}
	
	// Dashoboard of sidenav
	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement btnDashoElement;
	
	public void clickDashboard() {
		btnDashoElement.click();
	}
	
	// Bakery item of sidenav
	@FindBy(xpath = "//span[contains(text(),'Bakery Item')]")
	@CacheLookup
	WebElement btnBakerElement;
	
	public void clickBakeryItem() {
		btnBakerElement.click();
	}
	
	
	// Bakery item of Vehicle
		@FindBy(xpath = "//span[contains(text(),'Vehicle')]")
		@CacheLookup
		WebElement btnVehiclElement;
		
		public void clickVehicle() {
			btnVehiclElement.click();
		}
		
	// Driver of side nav
	@FindBy(xpath = "//span[contains(text(),'Driver')]")
	@CacheLookup
	WebElement btnDriverElement;
	
	public void clickDriver() {
		btnDriverElement.click();
	}
	
	// Shop of Side nav
	@FindBy(xpath = "//span[contains(text(),'Shop')]")
	@CacheLookup
	WebElement btnShopElement;
	
	public void clickShop() {
		btnShopElement.click();
	}
	
	// Manager of Side nav
	@FindBy(xpath = "//span[contains(text(),'Manager')]")
	@CacheLookup
	WebElement btnManagerElement;
	
	public void clickManager() {
		btnManagerElement.click();
	}
	
	// Add new Bakery Item

	
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement bakeryNewItemElement;
	public void clickNewItem() {
		bakeryNewItemElement.click();
	}
	
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement bakeryNewItemName;
	public void enterNewItemName() {
		bakeryNewItemName.click();
		bakeryNewItemName.clear();
		bakeryNewItemName.sendKeys("Sini Sambal Bun");
	}
	
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement bakeryNewPrice;
	public void enterNewPrice() {
		bakeryNewPrice.click();
		bakeryNewPrice.clear();
		bakeryNewPrice.sendKeys("Rs 150 / = ");
	}
	
	// click add new Bakery
	@FindBy(xpath = "//button[contains(text(),'Bakery')]")
	@CacheLookup
	WebElement bakeryNewButton;
	public void clickBakeryButton() {
		bakeryNewButton.click();
	}
	
	/**
	 * 
	 * New Testings 18 / 05 / 2022
	 * */
	
	// View All Bakery Items
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement bakeryViewAllButton;
	public void clickBakeryList() {
		bakeryViewAllButton.click();
	}
	
	// Edit Bakery Item List
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	@CacheLookup
	WebElement editBaeryItemElement;
	public void editbakeyItem() {
		editBaeryItemElement.click();
	}
	
	// Remove Bakery Item From List
	@FindBy(xpath = "//span[contains(text(),'Remove')]")
	@CacheLookup
	WebElement RemoveBakeryItem;
	public void removeBakeryItem() {
		RemoveBakeryItem.click();
	}
	

	// click Vehicle element
	@FindBy(xpath = "//span[contains(text(),'Vehicle')]")
	@CacheLookup
	WebElement vehicekElement;
	public void clickVehicleelement() {
		vehicekElement.click();
	}
	
	// Click vehicle new
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement vehiclenewbuttonElement;
	public void vehiclenew() {
		vehiclenewbuttonElement.click();
	}
	
	// Add Vehicle Number
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement entervehiclElement;
	public void entervehicleNumber() {
		entervehiclElement.click();
		entervehiclElement.clear();
		entervehiclElement.sendKeys("BHO 4454");
	}
	
	// Add Vehicle Type
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement entervehicletypElement;
	public void entervehicletype() {
		entervehicletypElement.click();
		entervehicletypElement.clear();
		entervehicletypElement.sendKeys("Motor Cycle");
	}
	
	// Add vehicle Button
	@FindBy(xpath = "//button[contains(text(),'Vehicl')]")
	@CacheLookup
	WebElement addvehicleElement;
	public void clickAddVehicle() {
		addvehicleElement.click();
	}
	
	// View All Vehicles
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement viewAllVehicles;
	public void ViewAllVehicles() {
		viewAllVehicles.click();
	}
	
	// Driver click
	@FindBy(xpath = "//span[contains(text(),'Driver')]")
	@CacheLookup
	WebElement driverclickElement;
	public void clcikcdriver() {
		driverclickElement.click();
	}
	
	// Add new driver - Click
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement addnewDriverElement;
	public void addnewVehicleSidenav() {
		addnewDriverElement.click();
	}
	
	// First Name - Dricer
	@FindBy(xpath = "//input[@id='firstName']")
	@CacheLookup
	WebElement firstnamedriverElement;
	public void addFnameDriver() {
		firstnamedriverElement.click();
		firstnamedriverElement.clear();
		firstnamedriverElement.sendKeys("Dimuth C");
	}
	
	// Last Name - Driver
	@FindBy(xpath = "//input[@id='lastName']")
	@CacheLookup
	WebElement lastnamElement;
	public void addLanameDriver() {
		lastnamElement.click();
		lastnamElement.clear();
		lastnamElement.sendKeys("Bandara");
	}
	
	// Driver - NIC
	@FindBy(xpath = "//input[@id='nicNo']")
	@CacheLookup
	WebElement nicElementDriver;
	public void nicDriver() {
		nicElementDriver.click();
		nicElementDriver.clear();
		nicElementDriver.sendKeys("97777777V");
	}
	
	// Contact Number - Driver
	@FindBy(xpath = "//input[@id='contactNo']")
	@CacheLookup
	WebElement contactNumberDriverElement;
	public void contactDriver() {
		contactNumberDriverElement.click();
		contactNumberDriverElement.clear();
		contactNumberDriverElement.sendKeys("+94771112783");
	}
	
	// Adrress Line 01 - Driver
	@FindBy(xpath = "//input[@id='addressLineOne']")
	@CacheLookup
	WebElement adressLineOneDriverElement;
	public void adressLineOneDriver() {
		adressLineOneDriverElement.click();
		adressLineOneDriverElement.clear();
		adressLineOneDriverElement.sendKeys("249");
	}
	
	
	// Address Line 02 - Driver
	@FindBy(xpath = "//input[@id='addressLineTwo']")
	@CacheLookup
	WebElement addresLinetwoElement;
	public void adressLinetwoDriver() {
		addresLinetwoElement.click();
		addresLinetwoElement.clear();
		addresLinetwoElement.sendKeys("Kanumale, Ranjanagama");
	}
	
	// Adress Line 03 - Driver	
	@FindBy(xpath = "//input[@id='addressLineThree']")
	@CacheLookup
	WebElement addressLineThreeElement;
	public void addressLinethreeDriver() {
		addressLineThreeElement.click();
		addressLineThreeElement.clear();
		addressLineThreeElement.sendKeys("Kurunegala");

	}
	
	// Add driver button
	@FindBy(xpath = "//button[contains(text(),'Driver')]")
	@CacheLookup
	WebElement addDriverButtonElement;
	public void adddriverOption() {
		addDriverButtonElement.click();
	}
	
	// View all drivers - List
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement viewAllDrivers;
	public void viewAllDrivers() {
		viewAllDrivers.click();
	}
	
	
	// Shop Click
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")
	@CacheLookup
	WebElement shopSideNavElement;
	public void shopSidenav() {
		shopSideNavElement.click();
	}
	
	// Add New Shop - Click
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement newshopsidnavElement;
	public void newShopSidenav() {
		newshopsidnavElement.click();
	}
	
	// Enter shop name - shop
	@FindBy(xpath = "//input[@id='shopName']")
	@CacheLookup
	WebElement shopName;
	public void entershopName() {
		shopName.click();
		shopName.clear();
		shopName.sendKeys("Keisukee New Branch");
	}
	
	// Enter BR Number-shop
	@FindBy(xpath = "//input[@id='brNumber']")
	@CacheLookup
	WebElement brNumber;
	public void enterrShop() {
		brNumber.click();
		brNumber.clear();
		brNumber.sendKeys("PV1545626PVT");
	}
	
	// Enter Contact Number-shop
	@FindBy(xpath = "//input[@id='contactNo']")
	@CacheLookup
	WebElement contactNoShop;
	public void contactNumberShop() {
		contactNoShop.click();
		contactNoShop.clear();
		contactNoShop.sendKeys("0771127963");
	}
	
	// Enter Adress Line 01 - Shop
	@FindBy(xpath = "//input[@id='addressLineOne']")
	@CacheLookup
	WebElement addressLine01ShopElement;
	public void adresL01Shop() {
		addressLine01ShopElement.click();
		addressLine01ShopElement.clear();
		addressLine01ShopElement.sendKeys("Line 01");
	}
	
	// Enter Adress Line 02 - Shop
	@FindBy(xpath = "//input[@id='addressLineTwo']")
	@CacheLookup
	WebElement addL02Shop;
	public void addressL02Shop() {
		addL02Shop.click();
		addL02Shop.clear();
		addL02Shop.sendKeys("Line 02");
	}
	
	// Enter Adress Line 03 - Shop
	@FindBy(xpath = "//input[@id='addressLineThree']")
	@CacheLookup
	WebElement addL03Shop;
	public void caddressL03Shop() {
		addL03Shop.click();
		addL03Shop.clear();
		addL03Shop.sendKeys("Line 03");
	}
	
	// Click on Add shop 
	@FindBy(xpath = "//button[contains(text(),'Shop')]")
	@CacheLookup
	WebElement btnAddShop;
	public void clickAddShopButton() {
		btnAddShop.click();
	}
	
	// View all shops
	@FindBy(xpath = "//body/div[@id='layout-wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement veiwAllShops;
	public void viewAllShopss() {
		veiwAllShops.click();
	}
	
	
	
}
