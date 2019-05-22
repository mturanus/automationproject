package automation;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	WebDriver driver;
	@Before
	public void beforeM() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
//	@Test
//	public void test1() throws InterruptedException {
//		WebElement input=driver.findElement(By.id("file-upload"));
//		String filePath="/Users/muammerturan/Desktop/TechtorialLOGO.png";
//		input.sendKeys(filePath);
//		Thread.sleep(3000);
//		
//		WebElement upload=driver.findElement(By.id("file-submit")); 
//	
//		upload.click();
//		Thread.sleep(3000);
//
//	}
	
//	@Test
//	public void test1() throws InterruptedException {
//		driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
//
//		WebElement input=driver.findElement(By.id("slide_content"));
//		
//		Actions action=new Actions(driver); 
//		
//		action.doubleClick(input).perform();
////nav-link-accountList
//	}
	
	
//	@Test
//	public void test1() throws InterruptedException {
//		driver.get("https://www.amazon.com/ref=nav_logo");
//
//		WebElement input=driver.findElement(By.id("nav-link-accountList"));
//		
//		Actions action=new Actions(driver); 
//		
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		
//		Thread.sleep(3000);
//		action.sendKeys(Keys.PAGE_UP).perform();
//		
//		action.moveToElement(input).perform();
//		
//		driver.quit();
////nav-link-accountList
//	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");

		WebElement source=driver.findElement(By.id("column-a"));
		WebElement target=driver.findElement(By.id("column-b"));

		
		
		Actions action=new Actions(driver); 
		
		Thread.sleep(3000);

		//action.dragAndDrop(source, target).perform();
		
		//action.dragAndDrop(source, target).perform();
		action.moveToElement(source).clickAndHold().moveToElement(target).release();
		
		
		Thread.sleep(3000);

		
		action.build().perform();
		
		//action.dragAndDropBy(source, 0, -200).perform();
		
		Thread.sleep(3000);
	
		
		//driver.quit();
//nav-link-accountList
	}
	
	
	
	
//	@Test
//	public void test3() throws InterruptedException {
//		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//		
//		
//		WebElement js=driver.findElement(By.xpath("(//button)[1]"));
//		js.click();
//		
//		Alert alert=driver.switchTo().alert();
//		
//		System.out.println(alert.getText());
//		
//		alert.accept();
//		
//		WebElement al1=driver.findElement(By.xpath("(//button)[2]"));
//
//		al1.click();
//		System.out.println(alert.getText());
//
//		alert.dismiss();
//		
//		WebElement al2=driver.findElement(By.xpath("(//button)[3]"));
//
//		al2.click();
//		
//		
//		System.out.println(alert.getText());
//
//		alert.sendKeys("somethingelse");
//		
//		alert.dismiss();
//
//	}
	
//	
//	@Test
//	public void test5() throws InterruptedException {
//		driver.get("http://the-internet.herokuapp.com/iframe");
//		
//		
//		WebElement iframe=driver.findElement(By.id("mce_0_ifr"));
//		
//		driver.switchTo().frame(iframe); 
//		
//		Select select=new Select(iframe); 
//
//		WebElement text=driver.findElement(By.id("tinymce"));
//
//		text.sendKeys("Techtorial Academy");
//		
//		Thread.sleep(2000);
//
//	}
	
//	@Test
//	public void test5() throws InterruptedException {
//		driver.get("https://www.messenger.com/");
//		
//		
//		WebElement window=driver.findElement(By.xpath("//i[@class='img sp_RpQ8QNMBode sx_22285d']"));
//		
//		window.click();
//		
//		String firstWindow=driver.getWindowHandle();
//		
//		System.out.println("First Window "+firstWindow);
//		
//		
//		Set<String> windowHandles=driver.getWindowHandles();
//		
//		for(String handle: windowHandles) {
//			
//			if(!driver.getTitle().equals(firstWindow)) {
//			driver.switchTo().window(handle);
//			}
//		}
//		
//		System.out.println(driver.getTitle());
//		
//		
//
//	}
	
	//dropdown
	

}
