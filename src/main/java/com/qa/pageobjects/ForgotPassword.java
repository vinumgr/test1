package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.globals.Globals;

public class ForgotPassword extends Globals {

	public ForgotPassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Define the page Objects

	@FindBy(xpath = "//*[@id='login_form']/div[2]/div[1]/div[1]/a")
	public WebElement forgotPassword;

	@FindBy(xpath = "//*[@id='form-account-create-t-reset']/fieldset/div[3]/div/div/label/span")
	public WebElement resetPassword;

	@FindBy(xpath = "//*[@id='reset_email']")
	public WebElement email;

	@FindBy(xpath = "//*[@id='stepOneSubmitReset']")
	public WebElement proceedButoon;

	@FindBy(xpath = "//*[@id='form-account-create-t-reset']/fieldset/div[5]/div/a")
	public WebElement backToLogin;

	@FindBy(xpath = "//*[@id='pop_content1']/div[5]/div[2]/fieldset/div[3]/div[2]/button")
	public WebElement resentEmailButton;

	@FindBy(xpath = "//*[@id='form-account-create-t']/div[4]/div/a")
	public WebElement CheckoutforgotPassword;

	@FindBy(xpath = "//*[@id='tabs-1']/div/div[4]/fieldset/div[3]/div[1]/a/button")
	public WebElement CheckoutSignInButton;

	@FindBy(xpath = "//*[@id='tabs-1']/div/div[4]/fieldset/div[3]/div[2]/button")
	public WebElement CheckoutResendButton;
	
	@FindBy(xpath = "//*[@id='pop_content1']/div[5]/div[1]")
	public WebElement ResetPwd;
	
	@FindBy(xpath = "//*[@id='pop_content1']/button")
	public WebElement closeResetPwd;
}
