package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Inside our page class we need to create the constructor which initialize and find all the element 
	// Easy to forget but very important for page object model. 
	public LoginPage(WebDriver driver) {
		
		// InitElement method will initialize the webelement on LoginPage
		// We should always initialize the webelement otherwise it will throw null pointer exception
		PageFactory.initElements(driver, this); 
		
	}
	
	
	//FindBy annotation is used to store the element of the page. 
	// FindBy annotation is coming from the Selenium 
	@FindBy(id="ctl00_MainContent_username")
	public WebElement username; 
	
	@FindBy(id="ctl00_MainContent_password")
	public WebElement password; 
	
	@FindBy(id="ctl00_MainContent_login_button")
	public WebElement login; 
	
	@FindBy(id="ctl00_MainContent_status")
	public WebElement errormessage; 
	
	// If we are doing same functional over an over again. 
	// we need to create the reusable methods. 
	//this is the reusable method for login functionality
	public void login(String username, String password) {
		
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.login.click();
	}

}
