package testCase;

import testBase.WebTestBase;

import org.testng.annotations.*;
import org.testng.asserts.*;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class TC01 extends WebTestBase {
LoginPage loginPage;
HomePage homePage;
MyAccountPage myAccountPage;
	//loading the config file
	public TC01() {
		super();
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		myAccountPage=new MyAccountPage();
	}
	
	@Test
	public void VerifyLogin() {
		//In Selenium, Asserts are validations or checkpoints for an application.
		SoftAssert softAssert = new SoftAssert();
		homePage.userSearchClick();
	     loginPage.login(prop.getProperty("mobile"), prop.getProperty("password"));
	     softAssert.assertEquals(myAccountPage.getTextOFMYAccountPage(), "My Account", "My Account text should be match");
	     softAssert.assertAll();
	}
	
	@Test
	public void verifySearchBar(){
	     SoftAssert softAssert = new SoftAssert();
	     myAccountPage.search();
	     System.out.println(myAccountPage.getTextOfSearch());
	     softAssert.assertEquals(myAccountPage.getTextOfSearch(), "Showing results for \"the power of your subconscious mind\"\n" +
	             "263 results found","Showing results for \"the power of your subconscious mind\"\n" +
	             "263 results found text should be match");
	    myAccountPage.selectDropDown("byVisibleText", "Best Seller");
	     softAssert.assertAll();
	 }
	
	@Test
	public void verifyMouseHover(){
	     SoftAssert softAssert = new SoftAssert();
	     myAccountPage.mouseHover();
	     softAssert.assertAll();
	 }
	
	
	@Test
	 public void verifyScrollDown(){
	     SoftAssert softAssert = new SoftAssert();
	     myAccountPage.scrollDownMethod();
	     softAssert.assertAll();
	 }
	
	@Test
	public void verifyGetWindowhandle() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
	     myAccountPage.verifyGetWindowhandle();
	     softAssert.assertAll();
	}
	

	@Test
	public void verifyCookieHandle() {
		SoftAssert softAssert = new SoftAssert();
	     myAccountPage.getCookiesHandle();
	     softAssert.assertAll();
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.close();
	}
}


