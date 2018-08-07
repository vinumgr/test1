package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.globals.Globals;

public class QuickViewObjects extends Globals {

	public QuickViewObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	// Define the page Objects

	@FindBy(xpath = "//*[@id=\"productsCatalog\"]/li[1]/div/div[2]/a")
	public WebElement quickviewPLP;

	@FindBy(xpath = "//*[@id='shift']")
	public WebElement quickviewPLPTwo;

	@FindBy(xpath = "//*[@id='productsCatalog']/li[1]/div/div[2]/a/div/div[2]/span")
	// @FindBy(xpath=//span[@class='quickview']")
	public WebElement quickviewIcon;

	@FindBy(xpath = "//*[@id=\"quickviewdetail-add-tocart-btn\"]")
	public WebElement quickviewAddToCart;

	@FindBy(xpath = "//*[@id=\"plus\"]/i")
	public WebElement quickviewIncrement;

	@FindBy(xpath = "//*[@id='minus']/i")
	public WebElement quickviewdecrement;

	@FindBy(xpath = "//*[@id='quickview_productdetail']/div[3]/div[2]/span")
	public WebElement quickAddToWishlist;

	@FindBy(xpath = "//*[@id='quickview_productdetail']/ul/li[2]/a/img")
	public WebElement quickviewColourSwatch;

	@FindBy(xpath = "//*[@id=\"quickview_productdetail\"]/div[2]/div[1]")
	public WebElement quickviewSizeSelectErr;

	// @FindBy(xpath="//*[@id='quickview_productdetail']/div[2]/div[1]/div[2]/span[1]")
	@FindBy(xpath = "//div[@class='col-sm-10 col-xs-12 pd0']/span[1]")
	public WebElement quickviewXS;

	// @FindBy(xpath="//*[@id='quickview_productdetail']/div[2]/div[1]/div[2]/span[2]")
	@FindBy(xpath = "//div[@class='col-sm-10 col-xs-12 pd0']/span[2]")
	public WebElement quickviewS;

	// @FindBy(xpath="//*[@id=\"quickview_productdetail\"]/div[2]/div[1]/div[2]/span[3]")
	@FindBy(xpath = "//div[@class='col-sm-10 col-xs-12 pd0']/span[3]")
	public WebElement quickviewM;

	// @FindBy(xpath="//span[contains(text(),'L')]")
	// @FindBy(xpath="//*[@id='quickview_productdetail']/div[2]/div[1]/div[2]/span[4]")
	@FindBy(xpath = "//div[@class='col-sm-10 col-xs-12 pd0']/span[4]")
	public WebElement quickviewL;

	// @FindBy(xpath="//span[contains(text(),'XL')]")
	// @FindBy(xpath="//*[@id='quickview_productdetail']/div[2]/div[1]/div[2]/span[5]")
	@FindBy(xpath = "//div[@class='col-sm-10 col-xs-12 pd0']/span[5]")
	public WebElement quickviewXL;

	@FindBy(xpath = "//*[@id='quickview_productdetail']/div[3]/div[1]/div[2]/div/div/div[2]/text()/br")
	// @FindBy(xpath="//div[@class='quickViewCartMsg']")
	public WebElement toolTip;

	@FindBy(xpath = "//*[@id='quickview_productdetail']/div[3]/div[1]/div[2]/div/div/div[2]")
	public WebElement quickviewItemaddedMsg;

	@FindBy(xpath = "//*[@id=\"dialogClose\"]")
	public WebElement quickviewclose;

	@FindBy(xpath = "//*[@id='quantity_msg']")
	public WebElement quickviewOutOfStockErrormsg;

	/*
	 * public void QuickviewsizeSelect(){
	 * 
	 * if( quickviewXS.isEnabled()) {
	 * 
	 * quickviewXS.click(); System.out.println("Small size is selected");
	 * 
	 * }
	 * 
	 * else if(quickviewS.isEnabled()) { quickviewS.click();
	 * System.out.println("Medium size is selected");
	 * 
	 * } else if(quickviewM.isEnabled()) { quickviewM.click();
	 * System.out.println("Large size is selected"); } else
	 * if(quickviewL.isEnabled()) { quickviewL.click();
	 * System.out.println("XL size is selected"); } else
	 * if(quickviewXL.isEnabled()) { quickviewXL.click();
	 * System.out.println("XXL size is selected"); } else {
	 * System.out.println("Product is Out of stock"); } }
	 */
}