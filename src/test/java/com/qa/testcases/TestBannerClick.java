package com.qa.testcases;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.globals.CommonMethods;
import com.qa.globals.Globals;
import com.qa.pageobjects.SearchPage;

public class TestBannerClick extends Globals {
	@BeforeTest
	public void launchUrl() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_CoverStoryURL);
	}

	// Banner click in home page
	@Test(priority = 0)

	public void BannerOne() throws Exception {
		SearchPage search = new SearchPage(driver);
		// Login with email
		// CommonMethods.loginViaEmail();
		// Thread.sleep(10000);
		search.bannerSlider.click();
		search.bannerOne.click();
		Reporter.log("Banner clicked without Login", true);
	}

	// Banner click in home page
	@Test(priority = 1)

	public void BannerclickWithLogin() throws Exception {
		SearchPage search = new SearchPage(driver);
		// Login with email
		CommonMethods.loginViaEmail();
		Thread.sleep(5000);
		search.coverstoryName.click();
		Thread.sleep(5000);
		search.bannerSlider.click();
		search.bannerOne.click();
		Reporter.log("Banner click with Login", true);
	}

	@Test(priority = 2)

	public void BannerclickWithLoginTwo() throws Exception {
		SearchPage search = new SearchPage(driver);
		// Login with email
		// CommonMethods.loginViaEmail();
		Thread.sleep(5000);
		search.coverstoryName.click();
		Thread.sleep(5000);
		search.bannerNewIn.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/new-products/clothing/");
		Reporter.log("NewIn Banner clicked with Login", true);
	}

	/*
	 * @Test(priority = 3)
	 * 
	 * public void BannerclickWithLoginThree() throws Exception {
	 * LoginPageobjects lgin = new LoginPageobjects(driver); AccountPage account
	 * = new AccountPage(driver); SearchPage search = new SearchPage(driver); //
	 * Login with email // CommonMethods.loginViaEmail(); Thread.sleep(5000);
	 * driver.get("https://www.coverstory.co.in/"); List<WebElement> links =
	 * driver.findElements(By.tagName("a"));
	 * System.out.println("Total links are " + links.size()); for (int i = 0; i
	 * < links.size(); i++) { WebElement ele = links.get(i); String url =
	 * ele.getAttribute("href"); // verifyLinkActive(url); ele.click(); } }
	 */

	@Test(priority = 3)

	public void BannerclickWithLoginThree() throws Exception {
		SearchPage search = new SearchPage(driver);
		// Login with email
		// CommonMethods.loginViaEmail();
		Thread.sleep(5000);
		search.coverstoryName.click();
		// scrollCenter();
		// Thread.sleep(5000);
		search.bannerThree1.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/clothing/dresses-jumpsuits/");
		Reporter.log("NewIn Banner clicked with Login", true);
		// Thread.sleep(5000);
		search.coverstoryName.click();
		// Thread.sleep(5000);
		search.bannerThree2.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/clothing/skirts-shorts/");
		Reporter.log("NewIn Banner clicked with Login", true);
		// Thread.sleep(5000);
		search.coverstoryName.click();
		// Thread.sleep(5000);
		search.bannerThree3.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/clothing/tops-tees/");
		Reporter.log("NewIn Banner clicked with Login", true);
		// Thread.sleep(5000);
		search.coverstoryName.click();
		// Thread.sleep(5000);
		search.bannerThree4.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/clothing/jeans/");
		Reporter.log("NewIn Banner clicked with Login", true);
		// Thread.sleep(5000);
		search.coverstoryName.click();
		// Thread.sleep(5000);
		search.bannerThree5.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/clothing/trousers-leggings/");
		Reporter.log("NewIn Banner clicked with Login", true);
		// Thread.sleep(5000);
		search.coverstoryName.click();
		// Thread.sleep(5000);
		search.bannerThree6.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/clothing/jacketsandsweaters/");
		Reporter.log("NewIn Banner clicked with Login", true);
	}

	@Test(priority = 4)

	public void BannerclickLookBook() throws Exception {
		SearchPage search = new SearchPage(driver);
		// Login with email
		// CommonMethods.loginViaEmail();
		// Thread.sleep(5000);
		search.coverstoryName.click();
		// Thread.sleep(5000);
		search.lookBook1.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/lookbook-4/");
		Reporter.log("LookBook1 Banner clicked with Login", true);
		search.coverstoryName.click();
		// Thread.sleep(5000);
		search.lookBook2.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.coverstory.co.in/lookbook-5/");
		Reporter.log("LookBook2 Banner clicked with Login", true);
		search.coverstoryName.click();
		Thread.sleep(5000);
		/*
		 * search.blog1.click(); Assert.assertEquals(driver.getCurrentUrl(),
		 * "https://www.coverstory.co.in/blog/");
		 * Reporter.log("Blog1 Banner clicked with Login", true);
		 * search.coverstoryName.click(); //Thread.sleep(5000);
		 * search.blog2.click(); Assert.assertEquals(driver.getCurrentUrl(),
		 * "https://www.coverstory.co.in/blog/");
		 * Reporter.log("Blog2 Banner clicked with Login", true);
		 */
	}

	// Closing the Browser:
	@AfterTest
	public void closeBrowser() {
		browserClose();
	}

}