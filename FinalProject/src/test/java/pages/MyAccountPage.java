package pages;

import testBase.WebTestBase;
import utils.Utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MyAccountPage extends WebTestBase{
	@FindBy(xpath = "//h1[text()='My Account']")
    WebElement accountTitle;

    @FindBy(xpath = "//input[@id='inputbar']")
    WebElement searchTextBox;

    @FindBy(id = "btnTopSearch")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class='search-summary search-heading']")
    WebElement searchTitle;

    @FindBy(xpath = "//select[@class='styled']")
    WebElement dropDown;

    @FindBy(xpath = "//span[@class='usernametext']")
    WebElement hover;

    @FindBy(xpath = "//img[@alt='Youtube']")
    WebElement youtubeOption;
    
	public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }
	public String getTextOFMYAccountPage(){
        return accountTitle.getText();
    }
	public void search(){
        searchTextBox.click();
        searchTextBox.sendKeys("The Power of your subconscious Mind");
        searchTextBox.sendKeys(Keys.ENTER);
        searchBtn.click();
    }
	
	public String getTextOfSearch()
	{
		return searchTitle.getText();
	}
	
	public void selectDropDown(String term,String value) {
		dropDown.click();
		Utility.selectValue(dropDown,term,value);
	}
	
	public void mouseHover() {
		// TODO Auto-generated method stub
		Utility.mouseHover(driver,hover);
		
	}
	
	public void scrollDownMethod() {
		// TODO Auto-generated method stub
		Utility.scrollDownByElement(driver,youtubeOption);
		youtubeOption.click();
	}
	
	public void verifyGetWindowhandle() throws InterruptedException {
		
				Utility.scrollDownByElement(driver,youtubeOption);
				youtubeOption.click();
				Utility.switchToWindows(driver);
	}
	
	public void getCookiesHandle() {
		// TODO Auto-generated method stub
		Utility.getCookies();
		
	}
}

