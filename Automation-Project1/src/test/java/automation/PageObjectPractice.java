package automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.LoginPage;
import pages.MainPage;

public class PageObjectPractice extends TestBase {
	
	
	//@Test
	public void test() {
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
		
		WebElement username=driver.findElement(By.id("ctl00_MainContent_user")); 
		WebElement password=driver.findElement(By.id("ctl00_MainContent_password")); 
		WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
				
		username.sendKeys("Tester");
		password.sendKeys("test");
		
		
		if(login.isDisplayed()) {
			login.click();
		}
		
		WebElement pageHead=driver.findElement(By.xpath("//h1")); 
		
		// Web Orders title should come from the business requirement. 
		// Actual will come from the webapplication. 
		// Try to avoid ask business requirements from developer. 
		Assert.assertEquals("Web Orders", pageHead.getText());
		
	}
	
	
	//@Test
	public void test1() {

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
		
		WebElement username=driver.findElement(By.id("ctl00_MainContent_user")); 
		WebElement password=driver.findElement(By.id("ctl00_MainContent_password")); 
		WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
		
		// I can send the invalid username but valid password
		// I can send the invalid password but valid username
		// I can send the invalid username and password
		// Password it should include symbols techtorial2019.
		
		username.sendKeys("techtorial"); //wrong username
		password.sendKeys("test"); // correct password
		login.click();
		
		WebElement errorMessage=driver.findElement(By.id("ctl00_MainContent_status")); 
		
		Assert.assertEquals("Invalid Login or Password.", errorMessage.getText());
		
	}
	
	
	//@Test
	public void Test2() {
		
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
		
		LoginPage page=new LoginPage(driver); 
		page.username.sendKeys("Tester");
		page.password.sendKeys("test");
		page.login.click();	
		
	}
	
	@Test 
	public void Test3() {
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");

		LoginPage page=new LoginPage(driver); 
		page.login("Tester", "test");
		
		MainPage main=new MainPage(driver); 
		
		for(int i=0;i<main.webOrders.size();i++) {	
			System.out.println(main.webOrders.get(i).getText());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
