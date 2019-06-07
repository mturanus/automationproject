package automation;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionPractice extends TestBase {
	

	
//	@Test
//	public void test() {
//		driver.get("http://the-internet.herokuapp.com/upload");
//		WebElement chooseFile=driver.findElement(By.id("file-upload")); 
//		String location="/Users/muammerturan/Desktop/TechtorialLOGO.png"; 
//		chooseFile.sendKeys(location);
//		WebElement upload=driver.findElement(By.id("file-submit")); 
//		upload.click();
//	}
	
//	@Test
//	public void test2() throws InterruptedException {
//		driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
//		
//		Actions action=new Actions(driver);
//		
//		WebElement doubleClick=driver.findElement(By.id("puff_content"));
//		
//		Thread.sleep(2000);
//		
//		action.doubleClick(doubleClick).perform();
//		
//		Thread.sleep(2000);
//
//	}
	
	
//	@Test
//	public void test5() throws InterruptedException {
//		driver.get("https://www.amazon.com/");
//		
//		Actions action=new Actions(driver);
//		
//		WebElement howerover=driver.findElement(By.id("nav-link-accountList"));
//		
//		Thread.sleep(2000);
//		
//		action.moveToElement(howerover).perform();
//		
//		Thread.sleep(2000);
//
//	}
	
//	
//	@Test
//	public void test6() throws InterruptedException {
//		driver.get("https://www.amazon.com/");
//		
//		Actions action=new Actions(driver);
//		
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		
//		Thread.sleep(3000);
//		
//		action.sendKeys(Keys.PAGE_UP).perform();
//		
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//
//		action.sendKeys(Keys.ARROW_UP).perform();
//
//	}
//
//	
//
//	//@Test
//	public void test6() throws InterruptedException {
//		
//		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
//		
//		WebElement mainLocation=driver.findElement(By.id("draggable"));
//		
//		WebElement targetLocation=driver.findElement(By.id("droptarget"));
//
//		Actions action=new Actions(driver);
//				
//		//action.moveToElement(mainLocation).clickAndHold().moveToElement(targetLocation).release().build().perform();
//		
//		action.dragAndDrop(mainLocation, targetLocation).perform();
//		
//		//action.moveToElement(mainLocation).clickAndHold().moveToElement(targetLocation, 10, 150).release().build().perform();
//		
//		Thread.sleep(3000);
//
//	}
//	
//	
//	//@Test
//	public void test7() throws InterruptedException {
//		
//		driver.get("http://demo.guru99.com/test/drag_drop.html");
//		
//		WebElement mainLocation=driver.findElement(By.id("fourth"));
//		
//		WebElement targetLocation=driver.findElement(By.id("amt7"));
//
//		Actions action=new Actions(driver);
//				
//		//action.moveToElement(mainLocation).clickAndHold().moveToElement(targetLocation).release().build().perform();
//		
//		action.dragAndDrop(mainLocation, targetLocation).perform();
//		
//		//action.moveToElement(mainLocation).clickAndHold().moveToElement(targetLocation, 10, 150).release().build().perform();
//		
//		Thread.sleep(3000);
//
//	}
//	
//	//@Test
//	public void test8() {
//		
//		driver.get("http://demo.guru99.com/test/drag_drop.html");
//		driver.manage().window().maximize();
//
//		// Right click the button to launch right click menu options
//		Actions action = new Actions(driver);
//
//		WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
//		action.contextClick(link).perform();
//		// Click on Edit link on the displayed menu options
//		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-delete"));
//		element.click();
//		
//		// Accept the alert displayed
//		//driver.switchTo().alert().accept();
//		// Closing the driver instance
//		//driver.quit();
//		
//	}
//	
	
	
	    @Test
		public void test9() {
			
			driver.get("http://toolsqa.com/iframe-practice-page/");
			driver.manage().window().maximize();
			

			JavascriptExecutor exe = (JavascriptExecutor) driver;
			 Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			 System.out.println("Number of iframes on the page are " + numberOfFrames);
			
			//By finding all the web elements using iframe tag
			 List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
			 System.out.println("The total number of iframes are " + iframeElements.size());
			 
			
			
		}
	
	
	
	@Test
	public void test10() {
		
		driver.get("https://demos.telerik.com/kendo-ui/slider/angular");
		
		
		Actions action=new Actions(driver);
		
//		WebElement slider=driver.findElement(By.xpath("(//div[@class='k-slider-track'])[1]"));
	//	driver.switchTo().frame(0); 
		
		WebElement slider=driver.findElement(By.xpath("(//div[@class='k-slider-track'])[2]"));

		
	
			
		Dimension dim=slider.getSize(); 
		int y=dim.getHeight(); 
		System.out.println(y);
		
		action.clickAndHold(slider).moveByOffset(9, -98).release().build().perform(); 
		
		
		
	}
	
	
	
	
	
	
	

	
	
	

}
