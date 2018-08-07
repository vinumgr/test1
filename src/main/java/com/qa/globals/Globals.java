package com.qa.globals;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Globals {

	// Pincode
	// public static String preprod_pincode = "";

	// Verification
	public static boolean result;
	public static String source;
	public static String screenshotPath = System.getProperty("user.dir");
	public static String directoryPath = System.getProperty("user.dir");

	// Browser
	public static WebDriver driver = null;
	public static String browserParentWindow = "";
	public static String browserChildWindow = "";

	// Url username & password

	public static String QA_CoverStoryURL = "https://www.coverstory.co.in/";
	//public static String QA_FutureGroup_UserName = "8553213996";
	//public static String QA_FutureGroup_Password = "123456";

	//public static String Enter_pincode = "500056";

	// Remote Webdriver Capabilities parameters
	private static String remoteServerUrl = "";
	private static final String FW_IE_NAME = "IE";
	private static final String FW_FF_NAME = "Firefox";
	private static final String FW_GC_NAME = "Chrome";
	private static final String FW_SF_NAME = "Safari";
	private static final String CAPABILITIES_IE_NAME = "internet explorer";
	private static final String CAPABILITIES_FF_NAME = "firefox";
	private static final String CAPABILITIES_GC_NAME = "chrome";
	private static final String CAPABILITIES_SF_NAME = "safari";

	// Test data
	boolean HeaderPrinted = false;
	public ArrayList<String> arraylistER = new ArrayList<String>();
	public static List<String> excelData = new ArrayList<String>();
	public static List<String> DBData = new ArrayList<String>();
	public static List<String> FTPData = new ArrayList<String>();
	public static List<Map<String, String>> oracleDBData = new ArrayList<>();
	public static String RESTData = "";
	public static String textData = "";
	public static String currentDate = "";
	public static String currentDateTime = "";
	public static String stringData = "";
	private static RemoteWebDriver remote = null;

	public static void log(String msg) {
		System.out.println(msg);
	}

	// Will help in taking screenshot for any kind of failures like Assertions,
	// Element not found or anything which fails a test.

	@Rule

	public TestName testName = new TestName();

	// Data base

	public void ERtakeScreenshot(WebDriver driver, String OEM, String reportName) {
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		String data = df.format(new Date());
		log("Date = " + data);
		String myString = data + "_" + OEM + "_" + reportName;
		log(myString);
		myString = myString.replaceAll("/", "_").toLowerCase();
		log(myString);
		myString = myString.replaceAll(" ", "_").toLowerCase();
		log(myString);

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now save the screenshot to a file some place
		try {
			FileUtils.copyFile(scrFile, new File(".\\screens\\screenshot_" + myString + ".png"));
			log("Screenshot Saved");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author charan reddy Takes Error Screenshot
	 */
	public void ERtakeScreenshotError(WebDriver driver, String OEM, String reportName) {
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		String data = df.format(new Date());
		log("Date = " + data);

		String myString = data + "_" + OEM + "_" + reportName;
		log(myString);
		myString = myString.replaceAll(" ", "_").toLowerCase();
		log(myString);

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now save the screenshot to a file some place
		try {
			FileUtils.copyFile(scrFile, new File(".\\screens\\Errors\\Error_screenshot_" + myString + ".png"));
			log("Error Screenshot Saved");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/**
	 * @author Vishal ,To capture Screenshot browser on Grid Browser - Chrome,
	 *         firefox, IE 11
	 * 
	 */
	public String captureScreen() throws IOException {
		String path;

		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File source = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		path = "./ScreenCapture/CoverStory/" + source.getName();
		FileUtils.copyFile(source, new File(path));

		return path;
	}

	// This is to print log for the ending of the test case

	static {
		// Optional, if not specified, WebDriver will search your path for
		// chromedriver.
		System.setProperty("webdriver.chrome.driver", directoryPath + "/Driver/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", directoryPath + "\\lib\\DriverRelated\\IE\\IEDriverServer2.53_Win32.exe");
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		System.setProperty("browser", "Chrome");
		System.setProperty("browserVersion", "51.0");
		System.setProperty("webdriver.remote", "false");

	}

	public void autoit() throws IOException {

		Runtime.getRuntime().exec("/FutureGroup/lib/DriverRelated/AutoIt/fg.exe");

	}

	public void acceptAlertIfAvailable(long timeout) {
		long waitForAlert = System.currentTimeMillis() + timeout;
		boolean boolFound = false;
		do {
			try {
				Alert alert = driver.switchTo().alert();
				if (alert != null) {
					alert.accept();
					boolFound = true;
				}
			} catch (NoAlertPresentException ex) {
			}
		} while ((System.currentTimeMillis() < waitForAlert) && (!boolFound));
	}

	/**
	 * @author CharanReddy BROWSERBack. Takes the browser to the previous page
	 * 
	 */
	public static void BROWSERBack() {
		try {
			if (null != driver) {
				driver.navigate().back();
				log("Browsers Back button clicked");
			}
		} catch (Exception e) {
			log("Browser Back button is either disabled or is not clickable");
		}
	}

	// Close the browser instance
	public static void browserClose() {
		// Make sure we shut everything down to avoid memory leaks
		driver.close();
		driver.quit();
		driver = null;
	}


	
	// Maximize the browser screen
	public static void browserMax() {
		driver.manage().window().maximize();
	}

	// Browser navigate
	public static void browserNav(String url) {
		log("Navigating to " + url);
		driver.navigate().to(url);
	}

	public static void check(WebElement checkBox) {
		log("Check the checkbox.");
		if (!checkBox.isSelected())
			checkBox.click();
	}

	// Click a link using text passed from the test case
	public void click(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	// Click on a button
	public void click(WebElement element) {
		element.click();
	}

	public static void clearDropdownValue(WebElement dropdownElement) {
		dropdownElement.sendKeys("--Select--");
		log("dropdown value cleared successfully.");
	}

	public static void clearTextBoxValue(WebElement textBoxElement) {
		textBoxElement.clear();
		log("textbox value cleared successfully.");
	}

	public void clickCoord(int x, int y) throws AWTException {
		Robot robot = new Robot();
		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

	public void clickCoord(WebElement element, int x, int y) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element, x, y).click().build().perform();
	}

	public static void doubleClick(WebElement elementToDoubleClick) {

		Actions actionsDoubleClick = new Actions(driver);
		if (elementToDoubleClick != null) {
			actionsDoubleClick.doubleClick(elementToDoubleClick);
			actionsDoubleClick.perform();

		}
	}

	public void fluentWait(WebElement element, int timeoutInSeconds) {
		new FluentWait<WebDriver>(driver).withTimeout(timeoutInSeconds, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
	}

	public static String getAllOptionsDropdown(WebElement element) {
		Select selectList = new Select(element);
		List<WebElement> options = selectList.getOptions();
		String value = "";
		for (WebElement option : options) {
			value = value + option.getAttribute("value");
		}
		return value;
	}

	/**
	 * Author Vishal To select the value from dropdown
	 * 
	 * @param element
	 * @param text
	 */
	public void selectdropdown(WebElement element, String text) {
		Select oSelect = new Select(element);

		oSelect.selectByVisibleText(text);

	}

	public static void getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/dd/MM HH:mm:ss.SSS");
		Date date = new Date();
		String dateNew = dateFormat.format(date).toString().replace("/", "_").replace(" ", "_").replace(":", "_")
				.replace(".", "_");
		currentDateTime = dateNew;
	}

	public static void getDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/dd/MM");
		Date date = new Date();
		String dateNew = dateFormat.format(date).toString().replace("/", "_").replace(" ", "-").replace(":", "_")
				.replace(".", "_");
		currentDate = dateNew;
	}

	public static void getText(WebElement element) {
		textData = element.getText();
	}

	public static void getTextInput(WebElement element) {
		textData = element.getAttribute("value");
	}

	// Get the current time in Milliseconds
	public static long getTime() {
		return System.currentTimeMillis();
	}

	/**
	 * @author CHARAN REDDY getWindowHandle. To get The current window handle
	 * 
	 */
	protected static String getWindowHandle() {
		return driver.getWindowHandle();
	}

	/**
	 * @author CHARAN REDDY getWindowHandle. To get The current window handles
	 * 
	 */
	protected static Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public static void IsClickable(WebElement element, int timeoutInSeconds)
			throws HeadlessException, IOException, AWTException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			log("Waiting for " + element + " for " + timeoutInSeconds + " seconds.");
		} catch (Exception e) {
			log(e.getMessage());
			// Fail the test
			assertTrue(false);
			
		}
		
	}
	
	//isclickable
	
	public static boolean IsElementClickable(WebElement element, int timeoutInSeconds)
			throws HeadlessException, IOException, AWTException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			log("Waiting for " + element + " for " + timeoutInSeconds + " seconds.");
			return true;
		} catch (Exception e) {
			log(e.getMessage());
			return false;
		}
	}

	public boolean isElementDisplayed(By by, WebDriver driver) {
		try {
			driver.findElement(by).isDisplayed();
			log("IN TRY for isElementPresent");
			return true;
		} catch (Exception e) {
			log("IN CATCH for isElementPresent");
			return false;
		}

	}

	public static void moveToElement(WebElement elementToMoveOnto) {

		Actions actionsMove = new Actions(driver);
		if (elementToMoveOnto != null) {

			actionsMove.moveToElement(elementToMoveOnto).perform();
			//actionsMove.perform();

		}
	}

	public void scrollBottom() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight); return true");
		try {
			wait(2);
		} catch (Exception e) {
		}

	}

	public void scrollBy(int scrollHeight) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0," + scrollHeight + "); return true");
		try {
			wait(2);
		} catch (Exception e) {
		}
	}

	public void scrollCenter() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight/2); return true");
		try {
			wait(2);
		} catch (Exception e) {
		}
	}

	public void scrollPage(int xValue, int yValue) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + xValue + "," + yValue + ")", "");
		try {
			wait(2);
		} catch (Exception e) {
		}
	}

	public void scrollTop() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0); return true");
		try {
			wait(2);
		} catch (Exception e) {
		}
	}

	public void select(WebElement element, String selection) {
		Select dropDown = new Select(element);
		dropDown.selectByVisibleText(selection);
	}

	/*
	 * selection selectFromListBox. selects the selection from the list box
	 * 
	 *///
	public void selectFromListBox(List<WebElement> elementList, String selection) {
		try {
			for (WebElement element : elementList) {
				if (element.getText().trim().equalsIgnoreCase(selection)) {
					click(element);
					break;
				}
			}
		} catch (Exception e) {
			log("Error : [" + selection + "] is not present in the list box or list box contains no value : "
					+ e.getLocalizedMessage());
		}
	}

	// Select browser to use
	public static void browserSelect() throws IOException {

		if (!Boolean.valueOf(System.getProperty("webdriver.remote"))) {
			// Set browser based on System Property
			if (System.getProperty("browser").contains("Chrome")) {

				String downloadPath = System.getProperty("user.dir") + "\\Downloads\\";
				new File(downloadPath).mkdirs();
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadPath);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("no-sandbox");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				//cap.setCapability("pageLoadStrategy", "none");
				cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				cap.setCapability(ChromeOptions.CAPABILITY, options);
				driver = new ChromeDriver(cap);

			} else if (System.getProperty("browser").contains("Firefox")) {
				driver = new FirefoxDriver();
			} else if (System.getProperty("browser").contains("IE")) {
				driver = new InternetExplorerDriver();
			} else {
				// Default to Firefox if one isn't specified
				driver = new FirefoxDriver();
			}
			log("Browser selected is " + System.getProperty("browser"));
		} else {
			browserSelectGrid();
		}

	}

	public static void wait(int numOfSeconds) throws InterruptedException {
		Thread.sleep(numOfSeconds * 1000);
	}

	public static void Wait(WebElement element, int timeoutInSeconds)
			throws HeadlessException, IOException, AWTException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			// Thread.sleep(2000);
			log("Waiting for " + element + " for " + timeoutInSeconds + " seconds.");
		} catch (Exception e) {
			log(e.getMessage());
			// Fail the test
			assertTrue(false);
		}
	}

	/**
	 * @author Charan Reddy
	 * @param String
	 *            text
	 * @param int
	 *            timeout
	 * @throws HeadlessException,
	 *             IOException, AWTException VerifyTextPresent. To Verify if a
	 *             text is present on the page or not Also wait for text
	 *             present. It can also verify fade away messages.
	 * 
	 */
	public static boolean VerifyTextPresent(final String text, int timeout)
			throws HeadlessException, IOException, AWTException {
		log("Wait for Text : " + text + " to be present on UI for maximum [" + timeout + "] seconds");
		try {
			new WebDriverWait(driver, timeout) {
			}.until(new ExpectedCondition<Boolean>() {
				@Override
				public Boolean apply(WebDriver driver) {
					return (driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]")).size() > 0);
				}
			});
		} catch (Exception e) {
			String ErrorMsg = "Failed wait for Text Present [" + text + "] request within timeout of : " + timeout
					+ " seconds  at url:" + driver.getCurrentUrl();
			log(ErrorMsg);
			StackTraceElement ste = new Exception().getStackTrace()[1];
			log(ste.getClassName() + "/" + ste.getMethodName() + ":" + ste.getLineNumber());
			return false;
		}
		log("Verify Text [" + text + "] " + "Is Present on the UI : Passed ");
		assertTrue(true);
		return true;
	}

	/**
	 * @author Charan Reddy
	 * @param String
	 *            text
	 * @param int
	 *            timeout
	 * @throws HeadlessException,
	 *             IOException, AWTException VerifyTextNotPresent. To Verify if
	 *             a text is not present on the page Also wait for text not
	 *             present. It can also verify fade away messages.
	 * 
	 */

	// Wait and verify Text To disappear
	public static boolean VerifyTextNotPresent(final String text, int timeout)
			throws HeadlessException, IOException, AWTException {
		log("Wait for Text : " + text + " to be not present on UI for maximum [" + timeout + "] seconds");
		try {
			new WebDriverWait(driver, timeout) {
			}.until(new ExpectedCondition<Boolean>() {
				@Override
				public Boolean apply(WebDriver driver) {
					return (driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]")).size() < 1);
				}
			});
		} catch (Exception e) {
			String ErrorMsg = "Failed wait for Text not to be Present [" + text + "] request within timeout of : "
					+ timeout + " seconds  at url:" + driver.getCurrentUrl();
			log(ErrorMsg);
			StackTraceElement ste = new Exception().getStackTrace()[1];
			log(ste.getClassName() + "/" + ste.getMethodName() + ":" + ste.getLineNumber());
			assertTrue(false);
			return false;
		}
		log("Verify Text [" + text + "] " + "Is not Present on the UI : Passed ");
		assertTrue(true);
		return true;
	}

	/**
	 * @author Vishal
	 * @throws Exception
	 *             To Verify if desired text matches with the actual text
	 * 
	 */
	public String verifyStringText(WebElement ele, String ActualText) {

		if (ele.getText().equals(ActualText)) {

			return "Text verification Passed";
		} else {
			return "Text verification Failed";

		}

	}

	/**
	 * @author Vishal
	 * @throws Exception
	 *             To Verify if desired text matches with the actual text
	 * 
	 */
	public void verifyText(WebElement ele, String ActualText) {

		if (ele.getText().equals(ActualText)) {

			System.out.println("Text verification Passed");
		} else {
			System.out.println("Text verification Failed");

		}
	}

	/**
	 * @author Vishal
	 * @throws Exception
	 *             To Verify if page is redirected to the correct URL
	 * 
	 */
	public void verifyurl(WebDriver driver, String Actualurl) {

		if (driver.getCurrentUrl().equals(Actualurl)) {

			System.out.println("Redirected to correct page - PASSED");
		} else {
			System.out.println("Redirecting to correct page is FAILED");

		}

	}

	/**
	 * @author Vishal
	 * @param ele
	 *            To read the text of an element
	 */
	public void readText(WebElement ele) {

		System.out.println(ele.getText());

	}

	/**
	 * @author CHARAN REDDY
	 * @throws Exception
	 *             setUp. Invoke the browser automatically in each test case
	 *             Also maximize it and close any previous browser opened
	 * 
	 */

	public void setUp() throws Exception {
		if (driver != null) {
			log("Close Browser due to unexpected Windows left from previous test iterations");
			browserClose();
		}
		/*
		 * String testMethodName = testName.getMethodName().toUpperCase();
		 * log("Executing Test Case -- [" + testName.getMethodName() + "]");
		 * if(!testMethodName.contains("DB") &&
		 * !testMethodName.contains("DATABASE") &&
		 * !testMethodName.contains("FTP") && !testMethodName.contains("REST")
		 * && !testMethodName.contains("SAUCE") &&
		 * !testMethodName.contains("MOBILE")){
		 */
		browserSelect();
		browserMax();
	}

	/**
	 * @author CHARAN REDDY Switch to last opened tab or window
	 *
	 */
	public static String switchToLatestTabOrWindow() {
		try {
			wait(2);
		} catch (Exception e) {
		}
		driver.switchTo().window(getWindowHandles().toArray()[getWindowHandles().size() - 1].toString());
		return driver.getTitle();
	}

	/**
	 * @author CHARAN REDDY Switch to later tab or window
	 * 
	 */
	public static String switchToNextTabOrWindow() {
		String actualHandle = getWindowHandle();
		int pos = 0;

		for (String handle : getWindowHandles()) {
			if (handle.equals(actualHandle)) {
				break;
			}

			pos++;
		}

		driver.switchTo()
				.window(getWindowHandles().toArray()[Math.max(getWindowHandles().size() - 1, pos + 1)].toString());
		return driver.getTitle();
	}

	/**
	 * @author CHARAN REDDY Switch to previous tab or window
	 *
	 */
	public static String switchToPreviousTabOrWindow() {
		String actualHandle = getWindowHandle();
		int pos = 0;

		for (String handle : getWindowHandles()) {
			if (handle.equals(actualHandle)) {
				break;
			}

			pos++;
		}

		driver.switchTo().window(getWindowHandles().toArray()[Math.min(0, pos - 1)].toString());
		return driver.getTitle();
	}

	// Wait until an object is visible before interacting with it
	public static void WebDriverExplicitWait(WebDriver driver, int timeoutInSeconds, String by, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		if (by.equalsIgnoreCase("id"))
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		if (by.equalsIgnoreCase("name"))
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
		if (by.equalsIgnoreCase("tagName"))
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(locator)));
		if (by.equalsIgnoreCase("className"))
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
		if (by.equalsIgnoreCase("linkText"))
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locator)));
		if (by.equalsIgnoreCase("partialLinkText"))
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(locator)));
		if (by.equalsIgnoreCase("cssSelector"))
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		if (by.equalsIgnoreCase("xpath"))
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}

	// Switch to parent window using Title
	public boolean switchWindowByTitle(String title) {

		String currentWindow = driver.getWindowHandle();
		List<String> availableWindows = new ArrayList<String>(driver.getWindowHandles());

		for (String w : availableWindows) {
			if (w != currentWindow) {
				driver.switchTo().window(w);
				if (driver.getTitle().equalsIgnoreCase(title))
					return true;
				else {
					driver.switchTo().window(currentWindow);
				}
			}
		}
		return false;
	}

	private static String getFrameworkBrowserNameFromCapabilitiesName(String capabilitiesBrowserName) {
		String frameworkBrowserName = null;

		switch (capabilitiesBrowserName) {
		case CAPABILITIES_IE_NAME:
			frameworkBrowserName = FW_IE_NAME;
			break;

		case CAPABILITIES_FF_NAME:
			frameworkBrowserName = FW_FF_NAME;
			break;

		case CAPABILITIES_GC_NAME:
			frameworkBrowserName = FW_GC_NAME;
			break;

		case CAPABILITIES_SF_NAME:
			frameworkBrowserName = FW_SF_NAME;
			break;

		default:
			frameworkBrowserName = "";
		}

		return frameworkBrowserName;
	}
	
	//=================Vinod=====================================
	public void clickLinkByHref(String href) {
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        Iterator<WebElement> i = anchors.iterator();

        while(i.hasNext()) {
            WebElement anchor = i.next();
            if(anchor.getAttribute("href").contains(href)) {
                anchor.click();
                break;
            }
        }
    }
	//=================Vinod=======================================
	public void clickLinkByHref(String href, int position) {
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        Iterator<WebElement> i = anchors.iterator();

        int j = 0;
        while(i.hasNext()) {
            WebElement anchor = i.next();

            if(anchor.getAttribute("href").contains(href)) {
                j++;
            }

            if(anchor.getAttribute("href").contains(href)
                    && j == position) {
                anchor.click();
                break;
            }
        }
    }
	
	
	public boolean elementHasClass(WebElement element, String disabled) {
		return element.getAttribute("class").contains(disabled);
	}

	/**
	 * @author Charan browserSelectGrid. Presents capabilities to select browser
	 *         on Grid Browser - Chrome, firefox, IE 11
	 * 
	 */
	// Function for Selenium Grid initialization
	public static void browserSelectGrid() {
		String browserName = System.getProperty("browser");
		String browserVersion = System.getProperty("browserVersion");
		// Below can also be parameterized from command line and Build .xml
		boolean blockPopups = false;
		boolean browserAutoSave = true;
		boolean checkObtainedBrowser = false;

		// Create Desired Capabilities
		DesiredCapabilities dc = new DesiredCapabilities();

		log("Request received for browser : " + browserName + " having version as : " + browserVersion
				+ " to be run on Selenium Grid..");

		if (browserName.equalsIgnoreCase(FW_IE_NAME)) {
			dc = DesiredCapabilities.internetExplorer();
			dc.setBrowserName(CAPABILITIES_IE_NAME);
			dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

			dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);

		} else if (browserName.equalsIgnoreCase(FW_FF_NAME)) {

			FirefoxProfile fp = new FirefoxProfile();
			fp.setPreference("webdriver.load.strategy", "unstable");
			fp.setPreference("browser.link.open_newwindow.restriction", 1);
			fp.setPreference("privacy.popups.policy", 1);

			// Add the possibility to get URLs with HTTP Authentication using
			// http://user:password@host
			fp.setPreference("network.http.phishy-userpass-length", 255);
			fp.setPreference("network.automatic-ntlm-auth.trusted-uris", "");

			if (blockPopups) {
				fp.setPreference("browser.link.open_newwindow.restriction", 2);
				fp.setPreference("privacy.popups.policy", 2);
			}

			if (browserAutoSave) {
				fp.setPreference("browser.download.folderList", 2);

				fp.setPreference("browser.download.dir", directoryPath);

				// Currently, only auto save .exe files from download clients
				fp.setPreference("browser.helperApps.neverAsk.saveToDisk",
						"application/octet-stream,application/x-zip-compressed"
								+ ",application/zip,application/zip-compressed,application/pdf");
				fp.setPreference("browser.download.manager.showWhenStarting", false);
				fp.setPreference("pdfjs.disabled", true);

			}

			dc = DesiredCapabilities.firefox();
			dc.setBrowserName(CAPABILITIES_FF_NAME);
			dc.setCapability(FirefoxDriver.PROFILE, fp);

		} else if (browserName.equalsIgnoreCase(FW_GC_NAME)) {

			dc = DesiredCapabilities.chrome();
			dc.setBrowserName(CAPABILITIES_GC_NAME);

		} else if (browserName.equalsIgnoreCase(FW_SF_NAME)) {
			dc = DesiredCapabilities.safari();
			dc.setBrowserName(CAPABILITIES_SF_NAME);
			dc.setPlatform(Platform.WINDOWS);
			dc.setJavascriptEnabled(true);
		}

		// Set desired version
		dc.setVersion(browserVersion);

		try {
			remote = new RemoteWebDriver(new URL(remoteServerUrl), dc);
		} catch (UnreachableBrowserException e) {
			log("Unable to reach Selenium Server at: " + remoteServerUrl);
		} catch (SessionNotCreatedException e) {
			log("There is an opened session at: " + remoteServerUrl);
		} catch (Exception e) {
			log("There is an Error in getting Remote webdriver instance : " + e.getMessage());
		}

		remote.setFileDetector(new LocalFileDetector());

		Capabilities remoteCapabilities = remote.getCapabilities();

		String driverInfo = null;

		// Get session ID
		String sessionID = remote.getSessionId().toString();

		driverInfo = "Initializing remote web driver: " + remoteServerUrl.toString() + " -> " + sessionID
				+ ". Selenium Server version: " + "2.53" + ". ";
		driverInfo += "OS: " + remoteCapabilities.getPlatform() + ". ";
		driverInfo += "Browser: " + browserName + " Requested version: " + browserVersion + ". Obtained version: "
				+ remoteCapabilities.getVersion();

		log(driverInfo);

		if (checkObtainedBrowser) {
			// Get obtained browser name and version
			String obtainedBrowserName = getFrameworkBrowserNameFromCapabilitiesName(
					remoteCapabilities.getBrowserName());
			String obtainedBrowserVersion = remoteCapabilities.getVersion();

			boolean throwException = false;
			String exceptionMessage = null;

			// If browser name or version are not the requested one's
			if (!browserVersion.equalsIgnoreCase(obtainedBrowserVersion)
					|| !browserName.equalsIgnoreCase(obtainedBrowserName)) {

				throwException = true;
				exceptionMessage = "browserName or browserVersion are not the requested ones. Requested: " + browserName
						+ " " + browserVersion + ". Obtained: " + obtainedBrowserName + " " + obtainedBrowserVersion;
			}

			// Throw exception
			if (throwException) {
				throw new IllegalStateException(exceptionMessage);
			}
		}
		
		

		driver = new Augmenter().augment(remote);

		driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);

		if (browserName.equalsIgnoreCase("Firefox")) {
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		}

	}

}
