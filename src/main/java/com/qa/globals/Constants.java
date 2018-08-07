package com.qa.globals;

public class Constants {
/*
	public static String fbb_URL = "";
	public static String fbb_UserName = "vinodmgr22@gmail.com.com";
	public static String fbb_Password = "123456";
	public static String Pincode="";
	
	public static String live_FutureGroup_URL = "";
	public static String live_FutureGroup_UserName = "";
	public static String live_FutureGroup_Password = "";*/
	
	
	public static String excelFilePath = System.getProperty("user.dir")+"/src/main/java/com/qa/datautitlities/LoginData.xlsx";
	/*public static String excelFileName = "";
	public static String excelSheetName = "";
	public static String cardnumber = "5123456789012346";
	public static String cardname = "Test";
	public static String cardexpiryyear = "2017";
	public static String cvvnumber = "123";
	*/
	
	//Objects xpath
	public static String loginIcon = ".//span[@class='user-icon-inner']";
	public static String signInButton = "//*[@id='stepOneSubmit']";
	public static String signOutButton = "//li[@class='signout-afterlogin']//a[contains(@class,'sel-logout')][contains(text(),'Sign Out')]";
	public static String loginInputId = "//*[@id='loginInput']";
	public static String signinGooglePlus = "//button[@type='button'][contains(text(),'Sign in with Gplus')]";
	public static String signinFacebook = "//button[@type='button'][contains(text(),'Sign in with Facebook')]";
	public static String facebookLoginButton = "//button[@id='loginbutton']";
	public static String facebookEmailAndPhone = "//input[@id='email']";
	public static String MyAccount = "//*[@id='page']/header/div/div/div/div[4]/div/div[3]/div/ul/li[3]/a";
	public static String editProfileButton = "//*[@id='CProEditButton']";
	public static String saveProfileButton = "//*[@id='CProSaveButton']";
	
	//Add To cart
	public static String dressAndJumpsuits = "//h3[@class='widgettitle'][contains(text(),'Dresses & Jumpsuits')]";
	public static String PLPTwo = "//*[@id='productsCatalog']/li[1]/div/div[2]/a";
	public static String addTocartButton = "//button[@id='pdp-add-tocart-btn']";
	public static String cartIcon_PDP = "//*[@id=\"page\"]/header/div/div/div/div[4]/div/div[1]/div[1]";
	public static String removeFromMiniCartSymbol = "//*[@id=\"items_minicart_overlay_1\"]/div[2]/a";
	public static String viewCartButton_PDP = "//*[@id=\"mini-cart-drobdwon\"]/div[4]/div[4]/div[1]/a";
	public static String clothing = "//span[contains(text(),'Clothing')]";
	public static String topsAnTees = "//h3[@class='widgettitle'][contains(text(),'Tops & Tees')]";
	public static String quickviewPLP = "//*[@id=\"productsCatalog\"]/li[1]/div/div[2]/a";
	public static String quickviewIcon = "//*[@id='productsCatalog']/li[1]/div/div[2]/a/div/div[2]/span";
	public static String wishlistInAccount = "//*[@id='page']/header/div/div/div/div[4]/div/div[3]/div/ul/li[4]/a";
	public static String PLP = "//*[@id='productsCatalog']/li[2]/div/div[2]/a ";
	public static String quickviewclose = "//*[@id=\"dialogClose\"]";



	public static String removeFromCartSymbol = "//*[@id='items_overlay_1']/div[6]/a[1]";
	public static String removeFromCartButton = "//button[@class='btn remove-item cart-pop-btn']";


	

}
