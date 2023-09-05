package pages;

import testBase.WebTestBase;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage extends WebTestBase{
	@FindBy(id = "ctl00_lblUser")
    WebElement usersearch;
	
/*Page Object Model, also known as POM, is a design pattern in Selenium
	that creates an object repository for storing all web elements. 
	It helps reduce code duplication and improves test case maintenance.
In Page Object Model, consider each web page of an application as a class file.
 Each class file will contain only corresponding web page elements.
  Using these elements, testers can perform operations on the website under test.*/
	
    public HomePage(){
    	//to conncet webelement with driver we are using pagefactory
        PageFactory.initElements(driver,this);
    }

    public void userSearchClick(){
        usersearch.click();
    }
}

