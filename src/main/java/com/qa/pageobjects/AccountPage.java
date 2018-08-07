package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.globals.Globals;



public class AccountPage extends Globals{
	public AccountPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	

	//Define the page Objects
	
	//@FindBy(xpath="//*[@id='page']/header/div/div/div/div[4]/div/div[3]/div/ul/li[3]/a")
	@FindBy(css=".cnv-name.sel-menu-myaccount>a")
	public WebElement MyAccount;
	
	@FindBy(xpath="//*[@id='CProEditButton']")
	public WebElement editProfileButton;
	
	@FindBy(xpath="//*[@id='customer-firstname']")
	public WebElement firstNameBox;
	
	@FindBy(xpath="//*[@id='customer-lastname']")
	public WebElement lastNameBox;
	
	@FindBy(xpath="//*[@id='CProSaveButton']")
	public WebElement saveProfileButton;
		
	@FindBy(xpath="//*[@id='change_account_password']/a")
	public WebElement changeAccountPasswordButton;
	
	@FindBy(xpath="//*[@id='password']")
	public WebElement newPasswordBox;
	
	@FindBy(xpath="//*[@id='PasswordForm_password2']")
	public WebElement confirmPasswordBox;
	
	@FindBy(xpath="//*[@id='save-new-password']/span")
	public WebElement savePasswordButton;
	
	//@FindBy(xpath="//*[@id='form-account-edit-password']/div/div[3]/div/a")
	@FindBy(css=".btn-account")
	public WebElement cancelPasswordButton;
	
	@FindBy(xpath="//a[@class='cnv-name sel-menu-myaccount']")
	public WebElement myProfile;
	
	@FindBy(xpath="//a[@class='cnv-name sel-menu-orders']")
	public WebElement myOrder;
	
	@FindBy(xpath="//a[@class='cnv-name sel-menu-address']")
	public WebElement mySavedAddress;
	
	@FindBy(xpath="//ul[@id='yw0']//li[4]//a[@class='cnv-name sel-menu-myaccount-logout']")
	public WebElement signOut;
	
	@FindBy(xpath="//*[contains(text(),'No, keep me signed in')]")
	//@FindBy(xpath="//*[@id='page']/div[1]/div/div[1]/a[1]")
	public WebElement keepMeSignedIn;
	
	//@FindBy(xpath="//a[contains(text(),'yes, sign me out')]")
	@FindBy(xpath="//a[@class='keepLogout']")
	public WebElement keepMeSignedOut;
	
	@FindBy(xpath="//*[contains(text(),'Update')]")
	public WebElement updateAddress;
	
	@FindBy(xpath="//*[contains(text(),'Set as Default')]")
	public WebElement setasDefaultAddress;
	
	@FindBy(css=".address-remove-icon")
	public WebElement deleteAddress;
	
	@FindBy(css=".confirm")
	public WebElement deleteAddressconfirm;
	
	@FindBy(xpath="//div[@class='col-sm-6 saved_ico_addition addressTitles showNewAddressBlock']")
	public WebElement openAddNewAddress;
	
	@FindBy(xpath="//div[@class='saved_ico_addition addressTitles showNewAddressBlock1']")
	public WebElement closeAddNewAddress;
	
	@FindBy(xpath="//*[@id='AddressForm_first_name']")
	public WebElement firstNameAddNewAddress;
	
	@FindBy(xpath="//*[@id='AddressForm_last_name']")
	public WebElement LastNameAddNewAddress;
	
	@FindBy(xpath="//*[@id='AddressForm_postcode']")
	public WebElement pincodeAddNewAddress;
	
	@FindBy(xpath="//*[@id='AddressForm_address1']")
	public WebElement address1AddNewAddress;
	
	@FindBy(xpath="//*[@id='AddressForm_phone']")
	public WebElement phoneAddNewAddress;
	
	@FindBy(xpath="//button[@type='button'][contains(text(),'Loading...')]")
	public WebElement setAsDefaultAddNewAddress;
	
	@FindBy(xpath="//*[contains(text(),'Save Address')]")
	public WebElement saveAddressInAddNewAddress;
	
	@FindBy(xpath="//button[@type='button'][contains(text(),'Cancel')]")
	public WebElement cancelButtonInAddNewAddress;
	
	@FindBy(xpath="//div[@class='pas']")
	public WebElement nameChanged;
	
	@FindBy(xpath="//span[@id='success-msg']")
	public WebElement passwordChanged;
	
	@FindBy(xpath="//h2[@class='pbs ui-borderBottom myaccount-title']")
	public WebElement orderPage;
	
	@FindBy(xpath="//h2[contains(text(),'Your address saved successfully')]")
	public WebElement addressUpdated;
	
	@FindBy(xpath="//h2[contains(text(),'Your address deleted successfully')]")
	public WebElement addressDeleted;
	

}
