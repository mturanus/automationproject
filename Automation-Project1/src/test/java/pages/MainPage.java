package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	
	public MainPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this); 
	}
	
	
	//driver.findElement(By.xpath("//h1')
	// this is for only one element
	@FindBy(xpath="//h1")
	public WebElement webOrderTitle; 

	//List<WebElement> name=driver.findElements(By.xpath("....") --> Return list of webelements
	@FindBy(xpath="//ul//li")
	public List<WebElement> webOrders; 
	
	
}
