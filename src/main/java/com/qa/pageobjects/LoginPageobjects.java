package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.globals.Globals;

public class LoginPageobjects extends Globals {

	public LoginPageobjects(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	// Define the page Objects

	@FindBy(xpath = "//*[@id='InputBoxpincode']")
	public WebElement pncode;

	@FindBy(xpath = "//*[@id='content']/div[3]/div[2]/div[4]/div/div[2]/button")
	public WebElement checkbtn;

	// @FindBy(xpath =".//span[@class='user-icon-inner']")

	@FindBy(xpath = "//*[@id='page']/header/div/div/div/div[4]/div/div[3]/span")
	public WebElement loginIcon;

	// @FindBy(xpath ="//*[@id='mini-cart-header']/span[1]")
	@FindBy(xpath = "//span[@class='user_icon']")
	public WebElement loginButton;

	@FindBy(xpath = "//*[@id='loginInput']")
	public WebElement loginInputId;

	@FindBy(xpath = "//*[@id='signPassword']")
	public WebElement loginInputPassword;

	@FindBy(xpath = "//*[@id='stepOneSubmit']")
	public WebElement signInButton;

	@FindBy(xpath = "//*[@id='page']/header/div/div/div/div[4]/div/div[3]/div/ul/li[6]")
	// @FindBy(xpath ="//li[6]//a[@class='sel-logout ']")
	// @FindBy(css =".sel-logout")
	public WebElement signOutButton;

	@FindBy(xpath = "//*[@id='form-account-create-t']/div/p")
	public WebElement errorMsg;

	@FindBy(xpath = "//button[@type='button'][contains(text(),'Sign in with Gplus')]")
	public WebElement signinGooglePlus;

	@FindBy(xpath = "//input[@id='identifierId']")
	public WebElement emailAndPhoneSignin;

	@FindBy(xpath = "//span[@class='RveJvd snByac'][contains(text(),'Next')]")
	public WebElement nextButtonSignin;

	@FindBy(xpath = "//div[@id='password']//div[@class='aCsJod oJeWuf']//div[@class='aXBtI Wic03c']//div[@class='Xb9hP']//input[@class='whsOnd zHQkBf']")
	public WebElement passwordSignin;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	public WebElement gmailSigninButton;

	@FindBy(xpath = "//*[@id='stepOneSubmit']")
	public WebElement signinOTP;

	@FindBy(xpath = "//*[@id='signOtp']")
	public WebElement OTPCheckBox;

	@FindBy(xpath = "//*[@id='login_form']/div[1]/div/div")
	public WebElement OTPEnterPage;

	@FindBy(xpath = "//button[@type='button'][contains(text(),'Sign in with Facebook')]")
	public WebElement signinFacebook;

	// @FindBy(xpath
	// ="/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")
	@FindBy(xpath = "//input[@id='email']")
	public WebElement facebookEmailAndPhone;

	@FindBy(xpath = "//input[@id='pass']")
	public WebElement facebookPassword;

	@FindBy(xpath = "//button[@id='loginbutton']")
	public WebElement facebookLoginButton;

	/*
	 * //@FindBy(xpath ="//*[@id=\"js_0\"]/div/div/div[2]/div/div/a") public
	 * WebElement facebookSignOutButton;
	 */

}