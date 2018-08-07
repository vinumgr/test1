package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.globals.Globals;

public class OrderObjects extends Globals {

	public OrderObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	// Define the page Objects

	@FindBy(xpath = "//*[@id='btn_cart_checkout']")
	public WebElement proceedToCheckout;

	@FindBy(xpath = "//*[@id='checkout-shipping-address-btn']")
	public WebElement proceedToReviewOrder;

	@FindBy(xpath = "//*[@id='checkout-payment-btn']")
	public WebElement proceedToPaymentOrder;

	@FindBy(xpath = "//*[@id='payment-form']/div[1]/div/ul/li[3]/a")
	public WebElement netBanking;

	@FindBy(xpath = "//*[@id='payment-form']/div[1]/div/div[1]/div[4]/div/div[1]/div/ul/li[1]/div")
	public WebElement iciciBank;

	@FindBy(xpath = "//*[@id='checkout-complete-payment-btn']")
	public WebElement completePayment;

	/*
	 * @FindBy(xpath="//span[contains(text(),'Clothing')]") public WebElement
	 * menuCategoryClothing;
	 * 
	 * @FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'All New')]")
	 * public WebElement allNewUnderClothingCategory;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id='productsCatalog']/li[1]/div/div[2]/a") public
	 * WebElement plpPage;
	 * 
	 * @FindBy(xpath=
	 * "//*[@id='pdp_productdetail']/div[2]/div[1]/div[2]/span[1]") public
	 * WebElement selectSize_PDP;
	 * 
	 * @FindBy(xpath=
	 * ".//*[@id='productsCatalog']/li[2]/div/div[2]/div[4]/div/div/div/div[3]/div/span[2]")
	 * public WebElement AddtoBagSize_PLP;
	 * 
	 * @FindBy(xpath="//button[@id='pdp-add-tocart-btn']") public WebElement
	 * addtoBag_PDP;
	 * 
	 * 
	 * @FindBy(xpath="//div[@class='mini-cart1']") public WebElement
	 * cartIcon_PDP;
	 * 
	 * @FindBy(xpath="//*[@id='mini-cart-drobdwon']/div[4]/div[4]/div[1]/a")
	 * public WebElement viewCartButton_PDP;
	 * 
	 * 
	 * @FindBy(xpath="//input[@id='InputBoxpincode']") public WebElement
	 * pinCodeBeforeCheckout;
	 * 
	 * @FindBy(xpath="//*[@id='checkout-shipping-address-btn']") public
	 * WebElement proceedToReview;
	 * 
	 * @FindBy(xpath="//button[@id='checkout-payment-btn']") public WebElement
	 * proceedToPayment;
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//button[@id='pdp-add-tocart-btn']") public WebElement
	 * AddtoBagSize_PDP;
	 * 
	 * //@FindBy(xpath=
	 * ".//*[@id='page']/header/div/div/div/div[3]/div[2]/div/div[7]/a")
	 * 
	 * @FindBy(xpath=
	 * "//div[@class='mini-cart-content']/div[@class='buttonalignmnet']") public
	 * WebElement ViewBagButton;
	 * 
	 * @FindBy(xpath=".//*[@id='checkoutfixedbutton']/a/span") public WebElement
	 * ProceedtoCheckout_Button;
	 * 
	 * @FindBy(id="checkoutBtn") public WebElement ProceedtoRevieworder_Button;
	 * 
	 * @FindBy(xpath=".//*[@id='checkoutBtn']") public WebElement
	 * ProceedtoPayment_Button;
	 * 
	 * @FindBy(xpath=".//*[@id='payment-form']/div[1]/div/ul/li[1]/a") public
	 * WebElement CreditCard_Tab;
	 * 
	 * @FindBy(
	 * xpath="//div[@class='tab-pane js_payment_tab_CreditCard active']/div[@class='radio_card']/label[@class='differentcard']"
	 * ) public WebElement UsedifferentCard_link;
	 * 
	 * @FindBy(xpath=".//*[@id='cc_number']") public WebElement CardNumber;
	 * 
	 * @FindBy(xpath=".//*[@id='cc_holder']") public WebElement CardName;
	 * 
	 * @FindBy(xpath=".//*[@id='cc_exp_year']") public WebElement
	 * CardExpiryYear;
	 * 
	 * @FindBy(xpath=".//*[@id='cc_exp_month_chosen']/a") public WebElement
	 * CardExpiryMonth;
	 * 
	 * @FindBy(xpath=".//*[@id='cc_exp_month_chosen']/div/ul/li[6]") public
	 * WebElement ExpiryMonth;
	 * 
	 * @FindBy(xpath=".//*[@id='cc_security_code']") public WebElement
	 * CardCVVNumber;
	 * 
	 * @FindBy(xpath=".//*[@id='checkoutBtn']") public WebElement
	 * CompletePaymentButton;
	 * 
	 * @FindBy(xpath=
	 * ".//*[@id='content']/div[2]/div[2]/div[1]/div[2]/p/span[1]") public
	 * WebElement OrderNo;
	 * 
	 * //Sorting Objects
	 * 
	 * @FindBy(xpath=
	 * ".//*[@id='content']/div[4]/div/div[2]/div/div[4]/div[2]/div/a/span")
	 * public WebElement sortingDropdown;
	 * 
	 * @FindBy(xpath=
	 * ".//*[@id='content']/div[4]/div/div[2]/div/div[4]/div[2]/div/div/ul/li[2]")
	 * public WebElement sortNew;
	 * 
	 * @FindBy(xpath=
	 * ".//*[@id='content']/div[4]/div/div[2]/div/div[4]/div[2]/div/div") public
	 * WebElement sortDropdownHover;
	 */
}
