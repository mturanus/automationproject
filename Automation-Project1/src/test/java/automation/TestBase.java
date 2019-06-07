package automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver driver;
	
	@Before
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	public void switchWindow(String window) {
		
		Set <String> windows=driver.getWindowHandles(); 
		
	
		for(String each:windows) {
			
			driver.switchTo().window(each); 
			if(driver.getTitle().equals(window)) {
				
				break; 
			}
		}
		
			}
		
	
	
	@After
	public void tearDown() {
		
		//driver.close();
	}
	
	
}
