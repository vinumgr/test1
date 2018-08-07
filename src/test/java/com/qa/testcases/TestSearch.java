package com.qa.testcases;


import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.globals.CommonMethods;
import com.qa.globals.Constants;
import com.qa.globals.Globals;
import com.qa.pageobjects.LoginPageobjects;
import com.qa.pageobjects.SearchPage;

public class TestSearch extends Globals {

	public class TestAccount extends Globals {
		@BeforeTest
		public void launchUrl() throws Exception {
			System.setProperty("browser", "Chrome");
			setUp();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			browserNav(QA_CoverStoryURL);
		}

		// Search page with Login
		@Test(priority = 0)

		public void search() throws Exception {
			SearchPage search = new SearchPage(driver);
			LoginPageobjects lgin = new LoginPageobjects(driver);
			// Login with email
			CommonMethods.loginViaEmail();
			//WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
			Thread.sleep(3000);
			//Wait(search.searchIcon, 30);
			// Create object of WebDriverWait class
			moveToElement(search.searchIcon);
			search.searchBox.click();
			search.searchBox.sendKeys("shorts");
			search.searchButton.click();
			assertTrue("Search results 'shorts' ".trim().equalsIgnoreCase(search.searchResult.getText()));
			Reporter.log("Search result for shorts success with login", true);
			moveToElement(search.searchIcon);
			search.searchBox.clear();
			search.searchBox.sendKeys("jeans");
			search.searchButton.click();
			assertTrue("Search results 'jeans' ".trim().equalsIgnoreCase(search.searchResultTwo.getText()));
			Reporter.log("Search result for jeans success with login", true);
			//Thread.sleep(1000);
			// WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
			lgin.loginIcon.click();
			Reporter.log("Email :Login Icon clicked", true);
			Thread.sleep(2000);
			// WebDriverExplicitWait(driver, 20, "Xpath",
			// Constants.signOutButton);
			//Wait(lgin.signOutButton, 30);
			lgin.signOutButton.click();
			Reporter.log("Email :signout using Email number is successful", true);

		}
		// Search page without login
		/*
		 * @Test(priority = 1)
		 * 
		 * public void searchWithoutLogin() throws Exception { SearchPage search
		 * = new SearchPage(driver);
		 * 
		 * Thread.sleep(1000); moveToElement(search.searchIcon);
		 * search.searchBox.click(); search.searchBox.sendKeys("shorts");
		 * search.searchButton.click();
		 * assertTrue("Search results 'shorts' ".trim().equalsIgnoreCase(search.
		 * searchResult.getText()),"Text doesnt match");
		 * Reporter.log("Search result for shorts success witout login", true);
		 * 
		 * moveToElement(search.searchIcon); search.searchBox.clear();
		 * search.searchBox.sendKeys("jeans"); search.searchButton.click();
		 * assertTrue("Search results 'jeans' ".trim().equalsIgnoreCase(search.
		 * searchResultTwo.getText()),"Text doesnt match");
		 * Reporter.log("Search result for jeans success without login", true);
		 * 
		 * }
		 */

		@AfterTest
		public void closeBrowser() {
			browserClose();
		}

	}
}