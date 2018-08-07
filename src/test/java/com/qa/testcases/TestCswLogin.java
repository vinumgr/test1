package com.qa.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.datautitlities.Excelutility;
import com.qa.globals.Constants;
import com.qa.globals.Globals;
import com.qa.pageobjects.AccountPage;
import com.qa.pageobjects.LoginPageobjects;

public class TestCswLogin extends Globals {

	// Launch the Browser
	@BeforeTest
	public void url_launch() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().deleteAllCookies();
		browserNav(QA_CoverStoryURL);

	}

	// Test case for Login with Valid credentials

	@Test(priority = 0)
	public void coverStoryEmailLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		AccountPage account = new AccountPage(driver);
		// Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Email :Login button clicked", true);
		log(Excelutility.excelData(2, 0, 0));
		lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
		Reporter.log("Email :Email entered", true);
		log(Excelutility.excelData(2, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		Reporter.log("Email :Password entered", true);
		// Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signInButton);
		lgin.signInButton.click();
		// Reporter.log("Email :SignIn using email is successful", true);
		Thread.sleep(1000);
		// WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email :Login Icon clicked", true);
		System.out.println(lgin.signOutButton.getAttribute("innerText"));
		Assert.assertEquals("Sign Out", lgin.signOutButton.getAttribute("innerText").trim(), "Text not matched | ");
		Reporter.log("Email: Login success", true);
		Thread.sleep(5000);
		lgin.signOutButton.click();
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email : Login Icon clicked", true);
		Assert.assertEquals("Sign In / Sign Up", lgin.loginButton.getAttribute("innerText").trim(),
				"Text not matched | ");
		Reporter.log("Email :signout using Email number is successful", true);
		// captureScreen();

	}

	// Test case for Login with Valid credentials
	@Test(priority = 1)
	public void coverStoryPhoneLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		// Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		// moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Phone : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Phone :Login button clicked", true);
		log(Excelutility.excelData(3, 0, 0));
		// Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginInputId);
		lgin.loginInputId.sendKeys(Excelutility.excelData(3, 0, 0));
		Reporter.log("Phone Number Login: Phone number entered", true);
		Thread.sleep(1000);
		log(Excelutility.excelData(3, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(3, 1, 0));
		Reporter.log("Phone Number Login :Password entered", true);
		// Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signInButton);
		lgin.signInButton.click();
		Reporter.log("Phone :Login using phone number is successful", true);
		Thread.sleep(1000);
		// WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email :Login Icon clicked", true);
		System.out.println(lgin.signOutButton.getAttribute("innerText"));
		Assert.assertEquals("Sign Out", lgin.signOutButton.getAttribute("innerText").trim(), "Text not matched | ");
		Reporter.log("Email: Login success", true);
		Thread.sleep(5000);
		lgin.signOutButton.click();
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email : Login Icon clicked", true);
		Assert.assertEquals("Sign In / Sign Up", lgin.loginButton.getAttribute("innerText").trim(),
				"Text not matched | ");
		Reporter.log("Email :signout using Email number is successful", true);
		// captureScreen();

	}

	// Test case for Login with Valid credentials for google+
	@Test(priority = 2)
	public void coverStorygoogleplusLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		// Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		// moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("GooglePlus : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("GooglePlus :Login button clicked", true);
		// Thread.sleep(5000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signinGooglePlus);
		lgin.signinGooglePlus.click();
		Reporter.log("GooglePlus :signinGooglePlus button clicked", true);
		Thread.sleep(5000);
		switchToLatestTabOrWindow();
		log(Excelutility.excelData(4, 0, 0));
		lgin.emailAndPhoneSignin.sendKeys(Excelutility.excelData(4, 0, 0));
		Reporter.log("GooglePlus :emailAndPhoneSignin button clicked", true);
		lgin.nextButtonSignin.click();
		Reporter.log("GooglePlus :nextButtonSignin button clicked", true);
		Thread.sleep(3000);
		log(Excelutility.excelData(4, 1, 0));
		lgin.passwordSignin.sendKeys(Excelutility.excelData(4, 1, 0));
		// Thread.sleep(5000);
		lgin.gmailSigninButton.click();
		Reporter.log("GooglePlus :gmailSigninButton button clicked", true);
		Thread.sleep(5000);
		switchToPreviousTabOrWindow();
		// Thread.sleep(5000);
		// WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("GooglePlus :loginIcon button clicked", true);
		Thread.sleep(1000);
		// WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email :Login Icon clicked", true);
		System.out.println(lgin.signOutButton.getAttribute("innerText"));
		Assert.assertEquals("Sign Out", lgin.signOutButton.getAttribute("innerText").trim(), "Text not matched | ");
		Reporter.log("Email: Login success", true);
		Thread.sleep(5000);
		lgin.signOutButton.click();
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email : Login Icon clicked", true);
		Assert.assertEquals("Sign In / Sign Up", lgin.loginButton.getAttribute("innerText").trim(),
				"Text not matched | ");
		Reporter.log("Email :signout using Email number is successful", true);
		// captureScreen();
	}

	// Test case for Login with Valid credentials for Facebook
	@Test(priority = 3)
	public void coverStoryFacebookLogin() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		// Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Facebook : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Facebook : Login button clicked", true);
		// Thread.sleep(5000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signinFacebook);
		lgin.signinFacebook.click();
		Reporter.log("Facebook : signinFacebook button clicked", true);
		Thread.sleep(5000);
		// WebDriverExplicitWait(driver, 10, "Xpath",
		// Constants.facebookEmailAndPhone);
		switchToLatestTabOrWindow();
		log(Excelutility.excelData(5, 0, 0));
		lgin.facebookEmailAndPhone.sendKeys(Excelutility.excelData(5, 0, 0));
		// Thread.sleep(5000);
		log(Excelutility.excelData(5, 1, 0));
		lgin.facebookPassword.sendKeys(Excelutility.excelData(5, 1, 0));
		// Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.facebookLoginButton);
		lgin.facebookLoginButton.click();
		switchToLatestTabOrWindow();
		lgin.loginIcon.click();
		Reporter.log("Email :Login Icon clicked", true);
		System.out.println(lgin.signOutButton.getAttribute("innerText"));
		Assert.assertEquals("Sign Out", lgin.signOutButton.getAttribute("innerText").trim(), "Text not matched | ");
		Reporter.log("Email: Login success", true);
		Thread.sleep(5000);
		lgin.signOutButton.click();
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email : Login Icon clicked", true);
		Assert.assertEquals("Sign In / Sign Up", lgin.loginButton.getAttribute("innerText").trim(),
				"Text not matched | ");
		Reporter.log("Email :signout using Email number is successful", true);
		// captureScreen();
	}

	@Test(priority = 4)
	public void coverStoryOTPLogin() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		// Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Phone : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Phone :Login button clicked", true);
		// Thread.sleep(1000);
		log(Excelutility.excelData(3, 0, 0));
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginInputId);
		lgin.loginInputId.sendKeys(Excelutility.excelData(3, 0, 0));
		Reporter.log("Login with OTP: Phone number entered", true);
		Thread.sleep(5000);
		check(lgin.OTPCheckBox);
		Thread.sleep(5000);
		lgin.signinOTP.click();
		Reporter.log("OTP sent", true);
		// Assert.assertEquals("Enter OTP to Sign In",
		// lgin.OTPEnterPage.getText());
		System.out.println();
	}

	// Closing the Browser:
	@AfterTest
	public void closeBrowser() {
		browserClose();
	}

}