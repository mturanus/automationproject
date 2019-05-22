package automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionPractice {
	
	
	WebDriver driver;
	@Before
	public void beforeM() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
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

	

	@Test
	public void test6() throws InterruptedException {
		
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
		
		WebElement mainLocation=driver.findElement(By.id("draggable"));
		
		WebElement targetLocation=driver.findElement(By.xpath("//div[@class='test1']"));

		Actions action=new Actions(driver);
				
		action.moveToElement(mainLocation).clickAndHold().moveToElement(targetLocation).release().build().perform();
		
		//action.dragAndDrop(mainLocation, targetLocation).perform();
		
		//action.moveToElement(mainLocation).clickAndHold().moveToElement(targetLocation, 10, 150).release().build().perform();
		
		Thread.sleep(3000);

	}
	
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		//driver.quit();
	}
	
	
	

}
