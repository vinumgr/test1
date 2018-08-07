package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.globals.Globals;

public class AddToWishlist_PO extends Globals {

	public AddToWishlist_PO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// WishList Icon In PLP for signed out user
	@FindBy(xpath = "//*[@id='productsCatalog']/li[1]/div/div[2]/a/div/div[1]/span")
	public WebElement wishlistIconPLP;

	// Wishlist menu in Account
	@FindBy(xpath = "//*[@id='page']/header/div/div/div/div[4]/div/div[3]/div/ul/li[4]/a")
	public WebElement wishlistAccountMenu;

	// Wishlsit Page
	@FindBy(xpath = "//*[@id='wish_list_item_5596']/div/div[2]/div[1]")
	public WebElement wishlistRemoveButton;

	@FindBy(xpath = "//*[@id='wish_list_item_5596']/div/div[2]/div[2]/button")
	public WebElement wishlistAddToCartButton;

	@FindBy(xpath = "//a[@id='removeWishlistProducts']")
	public WebElement wishlistClearallButton;

	@FindBy(xpath = "//*[@id='content']/div[2]/div[3]/div/div[1]/button")
	public WebElement wishlistContinueShoppingButton;

	@FindBy(xpath = "//*[@id='content']/div[2]/div[3]/div/div[2]/button")
	public WebElement wishlistProcedToCartButton;

	@FindBy(xpath = "//*[@id='wish_list_item_5675']/div/div[2]/div[3]/div/div[1]/i")
	public WebElement wishlistSizeeClose;

	// WishList icon in PDP for sign in user

	@FindBy(xpath = "//span[@data-target='#Signin-popup'][contains(text(),'Add to wishlist')]")
	public WebElement wishlistIconSignOutPDP;

	// Wishlist icon in PDP for signed out user

	@FindBy(xpath = "//*[@id=\"pdp_productdetail\"]/div[3]/div[2]/span")
	public WebElement wishlistIconSignInPDP;

	// Wishlist icon in quickview for sign in user
	@FindBy(xpath = "//*[@id='quickview_productdetail']/div[3]/div[2]/span")
	public WebElement wishlistIconSignoutQuickview;

	// Account >> wishlist in account section
	@FindBy(xpath = "//*[@id='page']/header/div/div/div/div[4]/div/div[3]/div/ul/li[4]/a")
	public WebElement wishlistInAccount;

	//@FindBy(xpath = "//span[contains(text(),'Add to wishlist')]")
	@FindBy(xpath = "//*[@id='pdp_productdetail']/div[3]/div[2]/span")
	public WebElement wishlistPDPMsg;
	
	//@FindBy(xpath = "//span[contains(text(),'Added to wishlist')]")
	@FindBy(xpath = "//*[@id='quickview_productdetail']/div[3]/div[2]/span")
	public WebElement wishlistQuickviewItemAddedPDPMsg;
	
	@FindBy(xpath = "//*[@id='productsCatalog']/li[1]/div/div[2]/a/div/div[1]/span")
	public WebElement wishlistPLPItemAddedPDPMsg;
	
	
	//

	/*
	 * //Checked element is present in this div WebElement
	 * weChecked=driver.findElement(By.xpath(
	 * "//div[3]/div[3]/div/div[5]/div/div/div[1]/div")); //Unchecked element is
	 * present in this div WebElement weUnchecked=driver.findElement(By.xpath(
	 * "//div[3]/div[3]/div/div/div[1]/div"));
	 * 
	 * //This the following code where I am checking WebElement
	 * weUnchecked=driver.findElement(By.xpath(
	 * "//div[3]/div[3]/div/div/div[1]/div")); if(weUnchecked.isSelected()) {
	 * System.out.println("Selected"); } else {
	 * System.out.println("Not Selected"); } //WebElement
	 * weChecked=driver.findElement(By.xpath(
	 * "//div[3]/div[3]/div/div[5]/div[1]/div")); WebElement
	 * weChecked=driver.findElement(By.xpath(
	 * "//div[3]/div[3]/div/div[5]/div/div/div[1]/div"));
	 * if(weChecked.isSelected()) { System.out.println("Selected"); } else {
	 * System.out.println("Not Selected"); }
	 * 
	 * 
	 */

}
