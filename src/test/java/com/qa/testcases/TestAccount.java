package com.qa.testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.datautitlities.Excelutility;
import com.qa.globals.CommonMethods;
import com.qa.globals.Constants;
import com.qa.globals.Globals;
import com.qa.pageobjects.AccountPage;
import com.qa.pageobjects.LoginPageobjects;
import com.qa.pageobjects.SearchPage;

public class TestAccount extends Globals {
	@BeforeTest
	public void launchUrl() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_CoverStoryURL);
	}

	// Account Info updating : First Name And Last Name
	@Test(priority = 0)

	public void MyAccountInfo() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AccountPage account = new AccountPage(driver);
		// Login with email
		CommonMethods.loginViaEmail();
		Thread.sleep(10000);
		// WebDriverExplicitWait(driver, 20, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Account : loginIcon button clicked", true);
		// Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.MyAccount);
		account.MyAccount.click();
		Reporter.log("Account : MyAccount button clicked", true);
		// Thread.sleep(3000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.editProfileButton);
		account.editProfileButton.click();
		Reporter.log("Account : editProfileButton button clicked", true);
		account.firstNameBox.clear();
		// account.clearTextBoxValue(account.firstNameBox);
		account.firstNameBox.sendKeys("FirstNameEdited");
		Reporter.log("First name successfully edited", true);
		account.lastNameBox.clear();
		account.lastNameBox.sendKeys("Lastnameedited");
		Reporter.log("Last name successfully edited", true);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.saveProfileButton);
		account.saveProfileButton.click();
		Assert.assertEquals("Your account updated successfully", account.nameChanged.getAttribute("innerText"), "Text not matched | ");
		Reporter.log("Account : saveProfileButton button clicked", true);

	}

	// Account Info updating :Changing password
	@Test(priority = 1)

	public void MyAccountChangePassword() throws Exception {
		AccountPage account = new AccountPage(driver);
		account.changeAccountPasswordButton.click();
		Reporter.log("Account : changeAccountPasswordButton button clicked", true);
		account.newPasswordBox.sendKeys(Excelutility.excelData(2, 1, 0));
		Reporter.log("Account : newPasswordBox button clicked", true);
		account.confirmPasswordBox.sendKeys(Excelutility.excelData(2, 1, 0));
		Reporter.log("Account : confirmPasswordBox button clicked", true);
		account.savePasswordButton.click();
		Assert.assertEquals("Password updated successfully", account.passwordChanged.getAttribute("innerText").trim(), "Text not matched | ");
		Reporter.log("Account : savePasswordButton button clicked", true);

	}

	// Account Info updating :My order page
	@Test(priority = 2)

	public void MyAccountOrderPage() throws Exception {
		AccountPage account = new AccountPage(driver);
		account.myOrder.click();
		//assert.assertTrue("My orders"account.orderPage.getAttribute("innerText"));
		assertTrue("My orders".equalsIgnoreCase(account.orderPage.getAttribute("innerText")));
	}

	// Account Info updating :Save Address Page
	@Test(priority = 3)

	public void MyAccountSaveAddressPage() throws Exception {
		AccountPage account = new AccountPage(driver);
		account.mySavedAddress.click();
		Reporter.log("Account : mySavedAddress button clicked", true);
		account.openAddNewAddress.click();
		Reporter.log("Account : openAddNewAddress button clicked", true);
		account.firstNameAddNewAddress.sendKeys(Excelutility.excelData(7, 0, 0));
		Reporter.log("Account : firstNameAddNewAddress button clicked", true);
		account.LastNameAddNewAddress.sendKeys(Excelutility.excelData(7, 1, 0));
		Reporter.log("Account : LastNameAddNewAddress button clicked", true);
		account.pincodeAddNewAddress.sendKeys(Excelutility.excelData(2, 2, 0));
		Reporter.log("Account : pincodeAddNewAddress button clicked", true);
		Thread.sleep(3000);
		account.address1AddNewAddress.sendKeys("Address : Embitel Testing");
		Reporter.log("Account : address1AddNewAddress button clicked", true);
		account.phoneAddNewAddress.sendKeys(Excelutility.excelData(3, 0, 0));
		Reporter.log("Account : phoneAddNewAddress button clicked", true);
		account.saveAddressInAddNewAddress.click();
		Assert.assertEquals("Your address saved successfully", account.addressUpdated.getAttribute("innerText").trim(),
				"Text not matched | ");
		Reporter.log("Account : saveAddressInAddNewAddress button clicked", true);
		Thread.sleep(5000);
		account.deleteAddress.click();
		Reporter.log("Account : deleteAddress button clicked", true);
		switchToLatestTabOrWindow();
		account.deleteAddressconfirm.click();
		Assert.assertEquals("Your address deleted successfully", account.addressDeleted.getAttribute("innerText").trim(),
				"Text not matched | ");
		Reporter.log("Account : deleteAddressconfirm button clicked", true);

	}
	// Account Info updating :SignOut Page
	/*
	 * @Test(priority = 4) public void MyAccountSignOutPage() throws Exception {
	 * //LoginPageobjects lgin = new LoginPageobjects(driver); AccountPage
	 * account = new AccountPage(driver); SearchPage search = new
	 * SearchPage(driver); Thread.sleep(5000); account.signOut.click();
	 * Reporter.log("Account : signOut button clicked", true);
	 * //Thread.sleep(5000); switchToNextTabOrWindow(); //Thread.sleep(5000);
	 * moveToElement(account.keepMeSignedOut); account.keepMeSignedOut.click();
	 * //switchToPreviousTabOrWindow();
	 * Reporter.log("Account : keepMeSignedOut button clicked", true);
	 * 
	 * }
	 */

	// Closing the Browser:
	@AfterTest
	public void closeBrowser() {
		browserClose();
	}

}